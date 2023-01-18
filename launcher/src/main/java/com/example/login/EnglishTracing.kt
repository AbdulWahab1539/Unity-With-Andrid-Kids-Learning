package com.example.login


import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ImageButton
import android.widget.ImageView
import com.example.login.ePaintview.Companion.CurrentBrush
import com.example.login.ePaintview.Companion.colorlist
import com.example.login.ePaintview.Companion.pathlist
import com.example.login.utils.Utils


class EnglishTracing : AppCompatActivity() {
    companion object {
        var path = Path()
        var paintbrush = Paint()
    }

    var startTime: Long = 0
    val Imagecontex = intArrayOf(
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i,
        R.drawable.j,
        R.drawable.k,
        R.drawable.l,
        R.drawable.m,
        R.drawable.n,
        R.drawable.o,
        R.drawable.p,
        R.drawable.qq,
        R.drawable.r,
        R.drawable.s,
        R.drawable.t,
        R.drawable.u,
        R.drawable.v,
        R.drawable.w,
        R.drawable.x,
        R.drawable.y,
        R.drawable.z
    )
    var c = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        Utils.releaseMusic()
        startTime = System.currentTimeMillis()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.eng_trace)
        supportActionBar?.hide()
        val red = findViewById<ImageButton>(R.id.redbt)
        val eraser = findViewById<ImageButton>(R.id.blackbt)
        val yellow = findViewById<ImageButton>(R.id.yellowbt)
        val blue = findViewById<ImageButton>(R.id.bluebt)
        val left = findViewById<ImageButton>(R.id.leftarrow)
        val right = findViewById<ImageButton>(R.id.rightarrow)
        val drawimage = findViewById<ImageView>(R.id.imagev)

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
            c--;

            if (c < 0) left!!.isEnabled = false

            else if(c!=-1) {
                right!!.isEnabled = true
                drawimage!!.setBackgroundResource(Imagecontex!![c])
            }
            pathlist.clear()
            colorlist.clear()
            path.reset()

        }
        right.setOnClickListener {
            //Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
            c++;
            if (c >= Imagecontex!!.size) {
                right!!.isEnabled = false

            } else if (c < Imagecontex!!.size) {
                left!!.isEnabled = true

                drawimage!!.setBackgroundResource(Imagecontex!![c])

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

