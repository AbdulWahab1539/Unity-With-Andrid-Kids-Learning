package com.example.login

import User
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import com.example.login.utils.LoadingScreen
import com.example.login.utils.Utils
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase

class RegistrationActivity : AppCompatActivity() {

    lateinit var etEmail: EditText
    lateinit var etConfPass: EditText
    private lateinit var etPass: EditText
    private lateinit var etUsername: EditText
    private lateinit var etGuardianEmail: EditText
    private lateinit var btnSignUp: Button
    lateinit var animationView: LottieAnimationView
    lateinit var cbGuardian: CheckBox
    lateinit var cbKid: CheckBox
    lateinit var database: DatabaseReference
    private var mp: MediaPlayer? = null
    lateinit var loading: LoadingScreen
    var email: String = ""
    var username: String = ""
    var guardianEmail: String = ""
    var pass: String = ""
    var id = ""
    // create Firebase authentication object
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        database =
            Firebase.database.getReferenceFromUrl("https://guardian-app-1a5f6-default-rtdb.firebaseio.com")
        // View Bindings
        etEmail = findViewById(R.id.etSEmailAddress)
        etConfPass = findViewById(R.id.etSConfPassword)
        etPass = findViewById(R.id.etSPassword)
        etUsername = findViewById(R.id.etUserName)
        etGuardianEmail = findViewById(R.id.etGuardianEmail)
        animationView = findViewById(R.id.animation)
        cbGuardian = findViewById(R.id.cb_guardian)
        cbKid = findViewById(R.id.cb_kid)
        //  btnSignUp = findViewById(R.id.imageButton3)
        //tvRedirectLogin = findViewById(R.id.imageButton4)
        val btnSignUp = findViewById<Button>(R.id.sign_up)
        val tvRedirectLogin = findViewById<Button>(R.id.sign_in)
        // Initialising auth object
        auth = Firebase.auth
        loading = LoadingScreen


        btnSignUp.setOnClickListener {
            signUpUser()
        }

        // switching from signUp Activity to Login Activity
        tvRedirectLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        cbKid.setOnCheckedChangeListener { _, _ ->
            if (cbKid.isChecked) Utils.showHide(etGuardianEmail)
            else Utils.showHide(etGuardianEmail)
        }

        //mediaPlayer = MediaPlayer.create(this@RegistrationActivity, R.raw.back_sound)
        animationView.setMinAndMaxProgress(0.0f, 0.3f);
        animationView.playAnimation()
    }

    private fun signUpUser() {
        email = etEmail.text.toString()
        pass = etPass.text.toString()
        val confirmPassword = etConfPass.text.toString()
        username = etUsername.text.toString()
        guardianEmail = etGuardianEmail.text.toString()

        if (cbGuardian.isChecked && cbKid.isChecked) {
            Toast.makeText(this, "Please select single account type", Toast.LENGTH_SHORT).show()
            return
        }

        if (!cbGuardian.isChecked && !cbKid.isChecked) {
            Toast.makeText(this, "Please select a account type", Toast.LENGTH_SHORT).show()
            return
        }

        // check pass
        if (email.isBlank() || pass.isBlank() || confirmPassword.isBlank() || username.isBlank()) {
            Toast.makeText(this, "Fields can't be blank", Toast.LENGTH_SHORT).show()
            return
        }

        if (cbKid.isChecked && guardianEmail.isBlank()) Toast.makeText(
            this, "Please provide Guardian to continue", Toast.LENGTH_SHORT
        ).show()
        if (pass != confirmPassword) {
            Toast.makeText(
                this, "Password and Confirm Password do not match", Toast.LENGTH_SHORT
            ).show()
            return
        }
        if (cbKid.isChecked) checkGuardianId()
        else if (cbGuardian.isChecked) createAccount()
    }

    private fun checkGuardianId() {

        loading.displayLoadingWithText(this, "Please wait...", false)
        val idListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val child = dataSnapshot.children
                child.forEach {
                    val user = it.getValue<User>()!!
                    Log.i("TAG", "onDataChange: " + user.email)
                    if (user.isGuardian == true && user.email.equals(etGuardianEmail.text.toString())) {
                        id = user.userId.toString()
                    }
                }
                if (id.isNotBlank()) createAccount()
                else {
                    Toast.makeText(
                        applicationContext, "Guardian email not found", Toast.LENGTH_SHORT
                    ).show()
                }
                loading.hideLoading()
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.w("TAG", "loadPost:onCancelled", databaseError.toException())
                loading.hideLoading()
            }
        }
        database.child("Users").addValueEventListener(idListener)
    }

    private fun createAccount() {
        loading.displayLoadingWithText(this, "Please wait...", false)
        auth.createUserWithEmailAndPassword(email, pass)
            .addOnCompleteListener(this) { task ->
            if (task.isSuccessful) {
                Log.i("TAG", "signUpUser: " + auth.currentUser!!.uid)
                val user: User?
                if (cbGuardian.isChecked) user = User(
                    auth.currentUser?.uid,
                    username,
                    email,
                    "",
                    cbGuardian.isChecked,
                    cbKid.isChecked
                )
                else user = User(
                    auth.currentUser?.uid,
                    username,
                    email,
                    id,
                    cbGuardian.isChecked,
                    cbKid.isChecked
                )
                database.child("Users").child(auth.currentUser!!.uid).setValue(user)
                    .addOnCompleteListener(this) {
                        if (it.isSuccessful) {
                            loading.hideLoading()
                            Log.i("TAG", "signUpUser: Upload data")
                            Toast.makeText(this, "Successfully Signed Up", Toast.LENGTH_SHORT)
                                .show()
                            finish()
                        } else {
                            Toast.makeText(this, "failed to Write data", Toast.LENGTH_SHORT)
                                .show()
                        }
                    }
            } else {
                loading.hideLoading()
                Toast.makeText(this, task.exception.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}