package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import com.example.juvenilezone.R
import android.media.MediaPlayer
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import com.example.login.utils.Utils
//import com.example.juvenilezone.Sounds
import java.lang.NullPointerException

class Urdusounds : AppCompatActivity(), View.OnClickListener {
    var b1: Button? = null
    var b2: Button? = null
    var b3: Button? = null
    var b4: Button? = null
    var b5: Button? = null
    var b6: Button? = null
    var b7: Button? = null
    var b8: Button? = null
    var b9: Button? = null
    var b10: Button? = null
    var b11: Button? = null
    var b12: Button? = null
    var b13: Button? = null
    var b14: Button? = null
    var b15: Button? = null
    var b16: Button? = null
    var b17: Button? = null
    var b18: Button? = null
    var b19: Button? = null
    var b20: Button? = null
    var b21: Button? = null
    var b22: Button? = null
    var b23: Button? = null
    var b24: Button? = null
    var b25: Button? = null
    var b26: Button? = null
    var b27: Button? = null
    var b28: Button? = null
    var b29: Button? = null
    var b30: Button? = null
    var b31: Button? = null
    var b32: Button? = null
    var b33: Button? = null
    var b34: Button? = null
    var b35: Button? = null
    var b36: Button? = null
    var b37: Button? = null
    var b38: Button? = null
    var startTime: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setBackgroundDrawableResource(R.drawable.letters_bg)
        setContentView(R.layout.activity_urdusounds)
        startTime = System.currentTimeMillis()

        Utils.releaseMusic()
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        val b1 = findViewById<ImageButton>(R.id.us1)
        val b2 = findViewById<ImageButton>(R.id.us2)
        val b3 = findViewById<ImageButton>(R.id.us3)
        val b4 = findViewById<ImageButton>(R.id.us4)
        val b5 = findViewById<ImageButton>(R.id.us5)
        val b6 = findViewById<ImageButton>(R.id.us6)
        val b7 = findViewById<ImageButton>(R.id.us7)
        val b8 = findViewById<ImageButton>(R.id.us8)
        val b9 = findViewById<ImageButton>(R.id.us9)
        val b10 = findViewById<ImageButton>(R.id.us10)
        val b11 = findViewById<ImageButton>(R.id.us11)
        val b12 = findViewById<ImageButton>(R.id.us12)
        val b13 = findViewById<ImageButton>(R.id.us13)
        val b14 = findViewById<ImageButton>(R.id.us14)
        val b15 = findViewById<ImageButton>(R.id.us15)
        val b16 = findViewById<ImageButton>(R.id.us16)
        val b17 = findViewById<ImageButton>(R.id.us17)
        val b18 = findViewById<ImageButton>(R.id.us18)
        val b19 = findViewById<ImageButton>(R.id.us19)
        val b20 = findViewById<ImageButton>(R.id.us20)
        val b21 = findViewById<ImageButton>(R.id.us21)
        val b22 = findViewById<ImageButton>(R.id.us22)
        val b23 = findViewById<ImageButton>(R.id.us23)
        val b24 = findViewById<ImageButton>(R.id.us24)
        val b25 = findViewById<ImageButton>(R.id.us25)
        val b26 = findViewById<ImageButton>(R.id.us26)
        val b27 = findViewById<ImageButton>(R.id.us27)
        val b28 = findViewById<ImageButton>(R.id.us28)
        val b29 = findViewById<ImageButton>(R.id.us29)
        val b30 = findViewById<ImageButton>(R.id.us30)
        val b31 = findViewById<ImageButton>(R.id.us31)
        val b32 = findViewById<ImageButton>(R.id.us32)
        val b33 = findViewById<ImageButton>(R.id.us33)
        val b34 = findViewById<ImageButton>(R.id.us34)
        val b35 = findViewById<ImageButton>(R.id.us35)
        val b36 = findViewById<ImageButton>(R.id.us36)
        val b37 = findViewById<ImageButton>(R.id.us37)
        b1!!.setOnClickListener(this)
        b2!!.setOnClickListener(this)
        b3!!.setOnClickListener(this)
        b4!!.setOnClickListener(this)
        b5!!.setOnClickListener(this)
        b6!!.setOnClickListener(this)
        b7!!.setOnClickListener(this)
        b8!!.setOnClickListener(this)
        b9!!.setOnClickListener(this)
        b10!!.setOnClickListener(this)
        b11!!.setOnClickListener(this)
        b12!!.setOnClickListener(this)
        b13!!.setOnClickListener(this)
        b14!!.setOnClickListener(this)
        b15!!.setOnClickListener(this)
        b16!!.setOnClickListener(this)
        b17!!.setOnClickListener(this)
        b18!!.setOnClickListener(this)
        b19!!.setOnClickListener(this)
        b20!!.setOnClickListener(this)
        b21!!.setOnClickListener(this)
        b22!!.setOnClickListener(this)
        b23!!.setOnClickListener(this)
        b24!!.setOnClickListener(this)
        b25!!.setOnClickListener(this)
        b26!!.setOnClickListener(this)
        b27!!.setOnClickListener(this)
        b28!!.setOnClickListener(this)
        b29!!.setOnClickListener(this)
        b30!!.setOnClickListener(this)
        b31!!.setOnClickListener(this)
        b32!!.setOnClickListener(this)
        b33!!.setOnClickListener(this)
        b34!!.setOnClickListener(this)
        b35!!.setOnClickListener(this)
        b36!!.setOnClickListener(this)
        b37!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.us1 -> {
                val mp0 = MediaPlayer.create(this, R.raw.s1)
                mp0.start()
                while (mp0.isPlaying) {
                }
                mp0.release()
            }
            R.id.us2 -> {
                val mp1 = MediaPlayer.create(this, R.raw.s2)
                mp1.start()
                while (mp1.isPlaying) {
                }
                mp1.release()
            }
            R.id.us3 -> {
                val mp2 = MediaPlayer.create(this, R.raw.s3)
                mp2.start()
                while (mp2.isPlaying) {
                }
                mp2.release()
            }
            R.id.us4 -> {
                val mp3 = MediaPlayer.create(this, R.raw.s4)
                mp3.start()
                while (mp3.isPlaying) {
                }
                mp3.release()
            }
            R.id.us5 -> {
                val mp4 = MediaPlayer.create(this, R.raw.s5)
                mp4.start()
                while (mp4.isPlaying) {
                }
                mp4.release()
            }
            R.id.us6 -> {
                val mp5 = MediaPlayer.create(this, R.raw.s6)
                mp5.start()
                while (mp5.isPlaying) {
                }
                mp5.release()
            }
            R.id.us7 -> {
                val mp6 = MediaPlayer.create(this, R.raw.s7)
                mp6.start()
                while (mp6.isPlaying) {
                }
                mp6.release()
            }
            R.id.us8 -> {
                val mp7 = MediaPlayer.create(this, R.raw.s8)
                mp7.start()
                while (mp7.isPlaying) {
                }
                mp7.release()
            }
            R.id.us9 -> {
                val mp8 = MediaPlayer.create(this, R.raw.s9)
                mp8.start()
                while (mp8.isPlaying) {
                }
                mp8.release()
            }
            R.id.us10 -> {
                val mp9 = MediaPlayer.create(this, R.raw.s10)
                mp9.start()
                while (mp9.isPlaying) {
                }
                mp9.release()
            }
            R.id.us11 -> {
                val mp10 = MediaPlayer.create(this, R.raw.s11)
                mp10.start()
                while (mp10.isPlaying) {
                }
                mp10.release()
            }
            R.id.us12 -> {
                val mp11 = MediaPlayer.create(this, R.raw.s12)
                mp11.start()
                while (mp11.isPlaying) {
                }
                mp11.release()
            }
            R.id.us13 -> {
                val mp12 = MediaPlayer.create(this, R.raw.s13)
                mp12.start()
                while (mp12.isPlaying) {
                }
                mp12.release()
            }
            R.id.us14 -> {
                val mp13 = MediaPlayer.create(this, R.raw.s14)
                mp13.start()
                while (mp13.isPlaying) {
                }
                mp13.release()
            }
            R.id.us15 -> {
                val mp14 = MediaPlayer.create(this, R.raw.s15)
                mp14.start()
                while (mp14.isPlaying) {
                }
                mp14.release()
            }
            R.id.us16 -> {
                val mp15 = MediaPlayer.create(this, R.raw.s16)
                mp15.start()
                while (mp15.isPlaying) {
                }
                mp15.release()
            }
            R.id.us17 -> {
                val mp16 = MediaPlayer.create(this, R.raw.s17)
                mp16.start()
                while (mp16.isPlaying) {
                }
                mp16.release()
            }
            R.id.us18 -> {
                val mp17 = MediaPlayer.create(this, R.raw.s18)
                mp17.start()
                while (mp17.isPlaying) {
                }
                mp17.release()
            }
            R.id.us19 -> {
                val mp18 = MediaPlayer.create(this, R.raw.s19)
                mp18.start()
                while (mp18.isPlaying) {
                }
                mp18.release()
            }
            R.id.us20 -> {
                val mp19 = MediaPlayer.create(this, R.raw.s20)
                mp19.start()
                while (mp19.isPlaying) {
                }
                mp19.release()
            }
            R.id.us21 -> {
                val mp20 = MediaPlayer.create(this, R.raw.s21)
                mp20.start()
                while (mp20.isPlaying) {
                }
                mp20.release()
            }
            R.id.us22 -> {
                val mp21 = MediaPlayer.create(this, R.raw.s22)
                mp21.start()
                while (mp21.isPlaying) {
                }
                mp21.release()
            }
            R.id.us23 -> {
                val mp22 = MediaPlayer.create(this, R.raw.s23)
                mp22.start()
                while (mp22.isPlaying) {
                }
                mp22.release()
            }
            R.id.us24 -> {
                val mp23 = MediaPlayer.create(this, R.raw.s24)
                mp23.start()
                while (mp23.isPlaying) {
                }
                mp23.release()
            }
            R.id.us25 -> {
                val mp24 = MediaPlayer.create(this, R.raw.s25)
                mp24.start()
                while (mp24.isPlaying) {
                }
                mp24.release()
            }
            R.id.us26 -> {
                val mp25 = MediaPlayer.create(this, R.raw.s26)
                mp25.start()
                while (mp25.isPlaying) {
                }
                mp25.release()
            }
            R.id.us27 -> {
                val mp26 = MediaPlayer.create(this, R.raw.s27)
                mp26.start()
                while (mp26.isPlaying) {
                }
                mp26.release()
            }
            R.id.us28 -> {
                val mp27 = MediaPlayer.create(this, R.raw.s28)
                mp27.start()
                while (mp27.isPlaying) {
                }
                mp27.release()
            }
            R.id.us29 -> {
                val mp28 = MediaPlayer.create(this, R.raw.s29)
                mp28.start()
                while (mp28.isPlaying) {
                }
                mp28.release()
            }
            R.id.us30 -> {
                val mp29 = MediaPlayer.create(this, R.raw.s30)
                mp29.start()
                while (mp29.isPlaying) {
                }
                mp29.release()
            }
            R.id.us31 -> {
                val mp30 = MediaPlayer.create(this, R.raw.s31)
                mp30.start()
                while (mp30.isPlaying) {
                }
                mp30.release()
            }
            R.id.us32 -> {
                val mp31 = MediaPlayer.create(this, R.raw.s32)
                mp31.start()
                while (mp31.isPlaying) {
                }
                mp31.release()
            }
            R.id.us33 -> {
                val mp32 = MediaPlayer.create(this, R.raw.s33)
                mp32.start()
                while (mp32.isPlaying) {
                }
                mp32.release()
            }
            R.id.us34 -> {
                val mp33 = MediaPlayer.create(this, R.raw.s34)
                mp33.start()
                while (mp33.isPlaying) {
                }
                mp33.release()
            }
            R.id.us35 -> {
                val mp34 = MediaPlayer.create(this, R.raw.s35)
                mp34.start()
                while (mp34.isPlaying) {
                }
                mp34.release()
            }
            R.id.us36 -> {
                val mp35 = MediaPlayer.create(this, R.raw.s36)
                mp35.start()
                while (mp35.isPlaying) {
                }
                mp35.release()
            }
            R.id.us37 -> {
                val mp36 = MediaPlayer.create(this, R.raw.s37)
                mp36.start()
                while (mp36.isPlaying) {
                }
                mp36.release()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val i = Intent(this@Urdusounds, KidsDashboard::class.java)
        startActivity(i)
    }

    override fun onStop() {
        super.onStop()
        Utils.postActivityData(this, startTime)
    }

    override fun onDestroy() {
        Utils.loadSound(this, R.raw.backgroundsound, false)
        super.onDestroy()
    }
}