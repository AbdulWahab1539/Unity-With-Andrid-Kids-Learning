package com.example.login

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.example.login.utils.Utils
import com.google.firebase.auth.FirebaseAuth

class KidsDashboard : AppCompatActivity() {


    var startTime: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kids_dashboard)
        startTime = System.currentTimeMillis()
        val buttonClick = findViewById<CardView>(R.id.phonic)
        val buttonClick2 = findViewById<CardView>(R.id.math)
        val buttonClick3 = findViewById<CardView>(R.id.Urdubt)

        buttonClick.setOnClickListener {
            val mpa = MediaPlayer.create(this, R.raw.clicksound)
            mpa.start()
            val intent = Intent(this, ABCsounds::class.java)
            startActivity(intent)
        }
        buttonClick2.setOnClickListener {
            val mpa = MediaPlayer.create(this, R.raw.clicksound)
            mpa.start()
            val intent = Intent(this, Sounds123::class.java)
            startActivity(intent)
        }
        buttonClick3.setOnClickListener {
            val mpa = MediaPlayer.create(this, R.raw.clicksound)
            mpa.start()
            val intent = Intent(this, Urdusounds::class.java)
            startActivity(intent)
        }
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