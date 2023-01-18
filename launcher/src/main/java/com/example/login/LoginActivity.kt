package com.example.login

import PrefUtils
import User
import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.login.utils.LoadingScreen
import com.example.login.utils.Utils
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {

    lateinit var etEmail: EditText
    private lateinit var etPass: EditText
    lateinit var btnLogin: Button
    lateinit var database: DatabaseReference
    lateinit var loading: LoadingScreen

    // Creating firebaseAuth object
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        ConstraintLayout constraintLayout = findViewById (R.id.sign_in)
//        AnimationDrawable animationDrawable =(AnimationDrawable) constraintLayout . getBackground ();
//        animationDrawable.setEnterFadeDuration(2500);
//        animationDrawable.setExitFadeDuration(5000);
//        animationDrawable.start();




        // View Binding
        //tvRedirectSignUp = findViewById(R.id.imageButton6)
        // btnLogin = findViewById(R.id.imageButton5)

        val btnLogin = findViewById<Button>(R.id.sign_in)
        val tvRedirectSignUp = findViewById<Button>(R.id.sign_up)
        etEmail = findViewById(R.id.etEmailAddress)
        etPass = findViewById(R.id.etPassword)

        // initialising Firebase auth object
        auth = FirebaseAuth.getInstance()

        loading = LoadingScreen
        btnLogin.setOnClickListener {
            login()
        }

        tvRedirectSignUp.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }

    private fun login() {
        val email = etEmail.text.toString()
        val pass = etPass.text.toString()



        if (email.isBlank() || pass.isBlank()) {
            Toast.makeText(this, "Email and Password can't be blank", Toast.LENGTH_SHORT).show()
            return
        }

        // calling signInWithEmailAndPassword(email, pass)
        // function using Firebase auth object
        // On successful response Display a Toast
        loading.displayLoadingWithText(this, "Please wait", false)
        auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                database = Firebase.database
                    .getReferenceFromUrl("https://guardian-app-1a5f6-default-rtdb.firebaseio.com")
                    .child("Users")
                    .child(FirebaseAuth.getInstance().currentUser!!.uid)
                val userListener = object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        Utils.user = dataSnapshot.getValue<User>()!!
                        loading.hideLoading()
//                        PrefUtils.save(applicationContext, "IS_LOGGED_IN", true)
                        Toast.makeText(
                            applicationContext,
                            "Successfully LoggedIn",
                            Toast.LENGTH_SHORT
                        ).show()
                        Log.i("TAG", "onDataChange: " + Utils.user!!.isKid + Utils.user!!.isGuardian)
                        if (Utils.user!!.isKid == true)
                            startActivity(Intent(applicationContext, Preschooler::class.java))
                        else
                            startActivity(Intent(applicationContext, GuardianDashboard::class.java))
                        finish()
                    }

                    override fun onCancelled(databaseError: DatabaseError) {
                        Log.w("TAG", "loadPost:onCancelled", databaseError.toException())
                    }
                }
                database.addValueEventListener(userListener)
            } else {
                loading.hideLoading()
                Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
            }

        }
    }
}