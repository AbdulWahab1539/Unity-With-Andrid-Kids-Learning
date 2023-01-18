package com.example.login

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.login.activities.PuzzleActivity
import com.example.login.utils.Utils
import com.google.firebase.auth.FirebaseAuth

class Preschooler : AppCompatActivity() {
    lateinit var btnLogout: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preschooler)


        val buttonClick = findViewById<CardView>(R.id.sound)
        val buttonClick2 = findViewById<CardView>(R.id.tracking)
        val buttonClick3 = findViewById<CardView>(R.id.puzzle)

        btnLogout = findViewById(R.id.btn_logout)
        btnLogout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            Toast.makeText(this, "Logged out Successfully", Toast.LENGTH_SHORT)
                .show()
            startActivity(Intent(applicationContext, LoginActivity::class.java))
            finish()
        }



        buttonClick.setOnClickListener {
            val mpa = MediaPlayer.create(this, R.raw.clicksound)
            mpa.start()

            val intent = Intent(this, KidsDashboard::class.java)
            startActivity(intent)
        }
        buttonClick2.setOnClickListener {
            val mpa = MediaPlayer.create(this, R.raw.clicksound)
            mpa.start()

            val intent = Intent(this, Tracer::class.java)
            startActivity(intent)


        }
        buttonClick3.setOnClickListener {
            val mpa = MediaPlayer.create(this, R.raw.clicksound)
            mpa.start()

            val intent = Intent(this, PuzzleActivity::class.java)
            startActivity(intent)


        }

    }

    override fun onDestroy() {
        Utils.releaseMusic()
        super.onDestroy()
    }

    override fun onResume() {
        if (Utils.length == 0)
            Utils.loadSound(this, R.raw.backgroundsound, false)
        else
            Utils.resumeMusic()
        super.onResume()
    }

    override fun onPause() {
        Utils.pauseMusic()
        super.onPause()
    }

}