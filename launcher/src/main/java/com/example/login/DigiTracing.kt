package com.example.login


import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import android.widget.ImageButton
import android.widget.ImageView


import com.example.login.dPaintview.Companion.CurrentBrush
import com.example.login.dPaintview.Companion.colorlist
import com.example.login.dPaintview.Companion.pathlist
import com.example.login.utils.Utils

class DigiTracing : AppCompatActivity() {
    companion object {
        var path = Path()
        var paintbrush = Paint()
    }

    var startTime: Long = 0

    val Imagecontex = intArrayOf(
        R.drawable.zerotrace,
        R.drawable.onetrace,
        R.drawable.twotrace,
        R.drawable.threetrace,
        R.drawable.fourtrace,
        R.drawable.fivetrace,
        R.drawable.sixtrace,
        R.drawable.seventrace,
        R.drawable.eighttrace,
        R.drawable.ninetrace
    )
    var TAG = "mytag"
    var c = -1
    override fun onCreate(savedInstanceState: Bundle?) {

        startTime = System.currentTimeMillis()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.digi_trace)
        supportActionBar?.hide()

        Utils.releaseMusic()

        val red = findViewById<ImageButton>(R.id.redbt3)
        val eraser = findViewById<ImageButton>(R.id.blackbt3)
        val yellow = findViewById<ImageButton>(R.id.yellowbt3)
        val blue = findViewById<ImageButton>(R.id.bluebt3)
        val left = findViewById<ImageButton>(R.id.leftarrow3)
        val right = findViewById<ImageButton>(R.id.rightarrow3)
        val drawimage = findViewById<ImageView>(R.id.imageButton3)

        red.setOnClickListener {
            //Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.RED
            currentcolor(paintbrush.color)
        }
        eraser.setOnClickListener {
            //Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            pathlist.clear()
            colorlist.clear()
            path.reset()
        }
        yellow.setOnClickListener {
            //Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.YELLOW
            currentcolor(paintbrush.color)

        }
        blue.setOnClickListener {
            //Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            paintbrush.color = Color.BLUE
            currentcolor(paintbrush.color)

        }
        left.setOnClickListener {
            //Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            Log.i(TAG, "Left: " + c)
            if (c > 0) c--
            if (c < 0) left!!.isEnabled = false
            else if (c != -1) {
                right!!.isEnabled = true
                drawimage!!.setBackgroundResource(Imagecontex!![c])
                if (c < 0 || c >= Imagecontex.size) return@setOnClickListener
                pathlist.clear()
                colorlist.clear()
                path.reset()
            }
//            if (c > 0) {
//                pathlist.clear()
//                colorlist.clear()
//                path.reset()
//            }
        }
        right.setOnClickListener {
            //Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            Log.i(TAG, "Right: " + c)
            if (c < Imagecontex.size)
                c++;
            if (c >= Imagecontex!!.size) {
                right!!.isEnabled = false

            } else if (c < Imagecontex!!.size) {
                left!!.isEnabled = true
                drawimage!!.setBackgroundResource(Imagecontex!![c])
                if (c >= Imagecontex.size) return@setOnClickListener
                pathlist.clear()
                colorlist.clear()
                path.reset()
            }
//            if (c >= Imagecontex.size) return@setOnClickListener
//            pathlist.clear()
//            colorlist.clear()
//            path.reset()
        }
    }

    private fun currentcolor(color: Int) {
        CurrentBrush = color
        path = Path()

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

