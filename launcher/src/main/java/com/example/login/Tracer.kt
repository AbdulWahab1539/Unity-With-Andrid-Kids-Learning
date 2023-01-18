package com.example.login

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import com.example.login.utils.Utils

class Tracer : AppCompatActivity() {

    var startTime: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tracing)
        startTime = System.currentTimeMillis()

        val buttonClick = findViewById<CardView>(R.id.etrace)
        val buttonClick2 = findViewById<CardView>(R.id.utrace)
        val buttonClick3 = findViewById<CardView>(R.id.dtrace)


        buttonClick.setOnClickListener {
            val mpa = MediaPlayer.create(this, R.raw.clicksound)
            mpa.start()
            val intent = Intent(this, EnglishTracing::class.java)
            startActivity(intent)
        }
        buttonClick2.setOnClickListener {
            val mpa = MediaPlayer.create(this, R.raw.clicksound)
            mpa.start()
            val intent = Intent(this, UrduTracing::class.java)
            startActivity(intent)
        }
        buttonClick3.setOnClickListener {
            val mpa = MediaPlayer.create(this, R.raw.clicksound)
            mpa.start()
            val intent = Intent(this, DigiTracing::class.java)
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