package com.example.login.activities

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.login.R
import com.example.login.service.TrackService
import com.example.login.unity.UnityGame
import com.example.login.utils.Utils

class PuzzleActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzle)
//        Utils.loadSound(this, R.raw.backgroundsound, false)
        Utils.releaseMusic()
        val buttonClick1 = findViewById<CardView>(R.id.btn_animal)
        val buttonClick2 = findViewById<CardView>(R.id.btn_color)
        val buttonClick3 = findViewById<CardView>(R.id.btn_drag)
        val buttonClick4 = findViewById<CardView>(R.id.btn_fruit)
        val buttonClick5 = findViewById<CardView>(R.id.btn_number)
        val buttonClick6 = findViewById<CardView>(R.id.btn_shape)
        val buttonClick7 = findViewById<CardView>(R.id.btn_urdu)
        val buttonClick8 = findViewById<CardView>(R.id.btn_vegitable)
        val buttonClick9 = findViewById<CardView>(R.id.btn_vehicle)

        buttonClick1.setOnClickListener { launchGame("AnimalScene") }
        buttonClick2.setOnClickListener { launchGame("ColorScene") }
        buttonClick3.setOnClickListener { launchGame("DragScene") }
        buttonClick4.setOnClickListener {launchGame("FruitScene") }
        buttonClick5.setOnClickListener {launchGame("NumberScene")}
        buttonClick6.setOnClickListener {launchGame("ShapeScene")}
        buttonClick7.setOnClickListener {launchGame("UrduScene")}
        buttonClick8.setOnClickListener {launchGame("VegetableScene")}
        buttonClick9.setOnClickListener {launchGame("VehicleScene")}
    }

    private fun launchGame(gameName: String){
        Utils.gameName = gameName
        val mpa = MediaPlayer.create(this, R.raw.clicksound)
        mpa.start()
        Utils.startTime =  System.currentTimeMillis()
        startActivity(Intent(this, UnityGame::class.java))
//        startService(Intent(this, TrackService::class.java))
    }

    override fun onPause() {
//        Utils.music.pause()
        super.onPause()
    }
}
