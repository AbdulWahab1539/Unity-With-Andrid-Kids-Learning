package com.example.juvenilezone

import androidx.appcompat.app.AppCompatActivity
import android.media.SoundPool
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Build
import android.media.AudioAttributes
import com.example.juvenilezone.R
import android.content.Intent
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import com.example.juvenilezone.Sounds
import com.example.juvenilezone.ABCTracing
import java.lang.NullPointerException

//import com.jaeger.library.StatusBarUtil;
//import com.unity3d.player.UnityPlayerActivity;
class MainActivityFrame : AppCompatActivity(), View.OnClickListener {
    private var soundPool: SoundPool? = null
    private var bc1 = 0
    private var bc2 = 0
    private var b1: Button? = null
    private var b2: Button? = null
    private var b3: Button? = null
    private var mediaPlayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val audioAttributes = AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build()
            soundPool = SoundPool.Builder()
                .setMaxStreams(6)
                .setAudioAttributes(audioAttributes)
                .build()
        }
        bc1 = soundPool!!.load(this, R.raw.click, 1)
        bc2 = soundPool!!.load(this, R.raw.learn_trace, 1)
        mediaPlayer = MediaPlayer.create(this@MainActivityFrame, R.raw.abc_song)
        mediaPlayer.setLooping(true)
        mediaPlayer.start()

        //StatusBarUtil.setTransparent(this);
        window.setBackgroundDrawableResource(R.drawable.main_bg)
        setContentView(R.layout.activity_main)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {
        }
        b1 = findViewById<View>(R.id.sound) as Button
        b2 = findViewById<View>(R.id.Tracing) as Button
        b3 = findViewById<View>(R.id.puzzles) as Button
        b1!!.setOnClickListener(this)
        b2!!.setOnClickListener(this)
        b3!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.sound -> {
                soundPool!!.play(bc1, 1f, 1f, 0, 0, 1f)
                val intent = Intent(this, Sounds::class.java)
                startActivity(intent)
            }
            R.id.Tracing -> {
                soundPool!!.play(bc2, 1f, 1f, 0, 0, 1f)
                val intent1 = Intent(this, ABCTracing::class.java)
                startActivity(intent1)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        mediaPlayer!!.start()
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer!!.pause()
        mediaPlayer!!.release()
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            moveTaskToBack(true)
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer!!.release()
        soundPool!!.release()
        mediaPlayer = null
        soundPool = null
    }
}