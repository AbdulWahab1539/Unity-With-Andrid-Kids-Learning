package com.example.login


import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ImageButton
import android.widget.ImageView
import com.example.login.uPaintview.Companion.CurrentBrush
import com.example.login.uPaintview.Companion.colorlist
import com.example.login.uPaintview.Companion.pathlist
import com.example.login.utils.Utils


class UrduTracing : AppCompatActivity() {
    companion object {
        var path = Path()
        var paintbrush = Paint()
    }

    var startTime: Long = 0
    val Imagecontex = intArrayOf(
        R.drawable.urdu2,
        R.drawable.urdu3,
        R.drawable.urdu4,
        R.drawable.urdu5,
        R.drawable.urdu6,
        R.drawable.urdu7,
        R.drawable.urdu8,
        R.drawable.urdu9,
        R.drawable.urdu10,
        R.drawable.urdu11,
        R.drawable.urdu12,
        R.drawable.urdu13,
        R.drawable.urdu14,
        R.drawable.urdu15,
        R.drawable.urdu16,
        R.drawable.urdu17,
        R.drawable.urdu18,
        R.drawable.urdu19,
        R.drawable.urdu20,
        R.drawable.urdu21,
        R.drawable.urdu22,
        R.drawable.urdu23,
        R.drawable.urdu24,
        R.drawable.urdu25,
        R.drawable.urdu26,
        R.drawable.urdu27,
        R.drawable.urdu28,
        R.drawable.urdu29,
        R.drawable.urdu30,
        R.drawable.urdu31,
        R.drawable.urdu32,
        R.drawable.urdu33,
        R.drawable.urdu34,
        R.drawable.urdu35,
        R.drawable.urdu36,
        R.drawable.urdu37,
        R.drawable.urdu38
    )

    var index = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        startTime = System.currentTimeMillis()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.urdu_trace)
        supportActionBar?.hide()
        Utils.releaseMusic()
        val red = findViewById<ImageButton>(R.id.redbt2)
        val eraser = findViewById<ImageButton>(R.id.blackbt2)
        val yellow = findViewById<ImageButton>(R.id.yellowbt2)
        val blue = findViewById<ImageButton>(R.id.bluebt2)
        val left = findViewById<ImageButton>(R.id.leftarrow2)
        val right = findViewById<ImageButton>(R.id.rightarrow2)
        val drawimage = findViewById<ImageView>(R.id.imagev2)

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

            index--
            if (index < 0) left!!.isEnabled = false
            else if (index != -1) {
                right!!.isEnabled = true
                drawimage!!.setBackgroundResource(Imagecontex!![index])
            }
            pathlist.clear()
            colorlist.clear()
            path.reset()
        }
        right.setOnClickListener {
            //Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            index++;
            if (index >= Imagecontex!!.size) {
                right!!.isEnabled = false
            } else if (index < Imagecontex!!.size) {
                left!!.isEnabled = true
                drawimage!!.setBackgroundResource(Imagecontex!![index])

            }
            pathlist.clear()
            colorlist.clear()
            path.reset()

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

