package com.example.login

//import com.example.juvenilezone.R
//import com.example.juvenilezone.Sounds
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.login.utils.Utils

//import com.jaeger.library.StatusBarUtil;
class Sounds123 : AppCompatActivity(), View.OnClickListener {
    //var buttons = arrayOfNulls<Button>(10)
    var startTime: Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Utils.releaseMusic()
        startTime = System.currentTimeMillis()
        //StatusBarUtil.setTransparent(this);
        window.setBackgroundDrawableResource(R.drawable.numbers_bg)
        setContentView(R.layout.activity_sounds123)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        val buttons0 = findViewById<ImageButton>(R.id.zero)
        val buttons1 = findViewById<ImageButton>(R.id.one)
        val buttons2 = findViewById<ImageButton>(R.id.two)
        val buttons3 = findViewById<ImageButton>(R.id.three)
        val buttons4 = findViewById<ImageButton>(R.id.four)
        val buttons5 = findViewById<ImageButton>(R.id.five)
        val buttons6 = findViewById<ImageButton>(R.id.six)
        val buttons7 = findViewById<ImageButton>(R.id.seven)
        val buttons8 = findViewById<ImageButton>(R.id.eight)
        val buttons9 = findViewById<ImageButton>(R.id.nine)
        buttons0!!.setOnClickListener(this)
        buttons1!!.setOnClickListener(this)
        buttons2!!.setOnClickListener(this)
        buttons3!!.setOnClickListener(this)
        buttons4!!.setOnClickListener(this)
        buttons5!!.setOnClickListener(this)
        buttons6!!.setOnClickListener(this)
        buttons7!!.setOnClickListener(this)
        buttons8!!.setOnClickListener(this)
        buttons9!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.zero -> {
                val mp0 = MediaPlayer.create(this, R.raw.sound0)
                mp0.start()
                while (mp0.isPlaying) {
                }
                mp0.release()
            }
            R.id.one -> {
                val mp1 = MediaPlayer.create(this, R.raw.sound1)
                mp1.start()
                while (mp1.isPlaying) {
                }
                mp1.release()
            }
            R.id.two -> {
                val mp2 = MediaPlayer.create(this, R.raw.sound2)
                mp2.start()
                while (mp2.isPlaying) {
                }
                mp2.release()
            }
            R.id.three -> {
                val mp3 = MediaPlayer.create(this, R.raw.sound3)
                mp3.start()
                while (mp3.isPlaying) {
                }
                mp3.release()
            }
            R.id.four -> {
                val mp4 = MediaPlayer.create(this, R.raw.sound4)
                mp4.start()
                while (mp4.isPlaying) {
                }
                mp4.release()
            }
            R.id.five -> {
                val mp5 = MediaPlayer.create(this, R.raw.sound5)
                mp5.start()
                while (mp5.isPlaying) {
                }
                mp5.release()
            }
            R.id.six -> {
                val mp6 = MediaPlayer.create(this, R.raw.sound6)
                mp6.start()
                while (mp6.isPlaying) {
                }
                mp6.release()
            }
            R.id.seven -> {
                val mp7 = MediaPlayer.create(this, R.raw.sound7)
                mp7.start()
                while (mp7.isPlaying) {
                }
                mp7.release()
            }
            R.id.eight -> {
                val mp8 = MediaPlayer.create(this, R.raw.sound8)
                mp8.start()
                while (mp8.isPlaying) {
                }
                mp8.release()
            }
            R.id.nine -> {
                val mp9 = MediaPlayer.create(this, R.raw.sound9)
                mp9.start()
                while (mp9.isPlaying) {
                }
                mp9.release()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val i = Intent(this@Sounds123, KidsDashboard::class.java)
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