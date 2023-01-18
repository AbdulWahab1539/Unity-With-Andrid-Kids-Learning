package com.example.login

import User
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.login.utils.Utils
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase


//import com.jaeger.library.StatusBarUtil;
class SplashScreen : AppCompatActivity() {
    lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //StatusBarUtil.setTransparent(this);
        FirebaseApp.initializeApp(this)
//        PrefUtils.get(applicationContext, "IS_LOGGED_IN", false) as Boolean &&
        if (FirebaseAuth.getInstance().currentUser != null) {
            database = Firebase.database
                .getReferenceFromUrl("https://guardian-app-1a5f6-default-rtdb.firebaseio.com")
                .child("Users")
                .child(FirebaseAuth.getInstance().currentUser!!.uid)
            val userListener = object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    Utils.user = dataSnapshot.getValue<User>()!!
                    Log.i("TAG", "onDataChange: " + Utils.user!!.isKid + Utils.user!!.isGuardian)
                    if (Utils.user!!.isKid == true)
                        startActivity(Intent(applicationContext, Preschooler::class.java))
                    else if (Utils.user!!.isGuardian == true)
                        startActivity(Intent(applicationContext, GuardianDashboard::class.java))
                    else startActivity(Intent(applicationContext, LoginActivity::class.java))
                    finish()
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    Log.w("TAG", "loadPost:onCancelled", databaseError.toException())
                }
            }
            database.addValueEventListener(userListener)
        } else
            startActivity(Intent(this@SplashScreen, LoginActivity::class.java))
        finish()
    }
}