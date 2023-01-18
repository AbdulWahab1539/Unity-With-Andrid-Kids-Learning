package com.example.login

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup

import com.example.login.UrduTracing.Companion.paintbrush
import com.example.login.UrduTracing.Companion.path

class uPaintview:View {
    var params : ViewGroup.LayoutParams? =null
    companion object{
        var pathlist=ArrayList<android.graphics.Path>()
        var colorlist=ArrayList<Int>()
        var CurrentBrush=Color.BLACK;
    }
    constructor(context: Context) : this(context, null){
      init()
    }

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0){
      init()

    }
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
     init()
    }

    private fun init(){
        paintbrush.isAntiAlias=true
        paintbrush.color= CurrentBrush
        paintbrush.style= Paint.Style.STROKE
        paintbrush.strokeJoin=Paint.Join.ROUND
        paintbrush.strokeWidth=33f
   params=ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
           var x=event.x
            var y=event.y
        when(event.action){
            MotionEvent.ACTION_DOWN ->{
                path.moveTo(x,y)
                return true
            }
            MotionEvent.ACTION_MOVE ->{
                path.lineTo(x,y)
                pathlist.add(path)
                colorlist.add(CurrentBrush)
            }
            else-> return false

        }
        postInvalidate()
        return false;
    }
    override fun onDraw(canvas: Canvas){
        for(i in pathlist.indices){
            paintbrush.setColor(colorlist[i])
            canvas.drawPath(pathlist[i],paintbrush)
            invalidate()

        }

    }
}