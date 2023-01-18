package com.example.juvenilezone;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class display extends View implements Info {
    public static ArrayList<Path> pathList = new ArrayList<Path>();
    public static ArrayList<Integer> colorList = new ArrayList<>();
    public ViewGroup.LayoutParams params;
    public static int current_brush = Color.BLACK;
    private com.example.juvenilezone.MyTouchEventListener listener;

    public display(Context context) {
        super(context);
        init(context);
    }

    public display(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public display(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void setListener(com.example.juvenilezone.MyTouchEventListener listener) {
        this.listener = listener;
    }

    private void init(Context context) {
        ABCTracing.paint_brush.setAntiAlias(true);
        ABCTracing.paint_brush.setColor(Color.BLACK);
        ABCTracing.paint_brush.setStyle(Paint.Style.STROKE);
        ABCTracing.paint_brush.setStrokeCap(Paint.Cap.ROUND);
        ABCTracing.paint_brush.setStrokeWidth(15f);
        params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        listener.onTouch(event);

        if (!listener.shouldDraw(event)) {
            return false;
        } else {

            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                ABCTracing.path.moveTo(x, y);
                invalidate();
                return true;
            } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                ABCTracing.path.lineTo(x, y);
                pathList.add(ABCTracing.path);
                colorList.add(current_brush);
                invalidate();
                return true;
            } else {
                return false;
            }
        }
    }
    @Override
    protected void onDraw(Canvas canvas) {
        for (int i = 0; i < pathList.size(); i++) {
            ABCTracing.paint_brush.setColor(colorList.get(i));
            canvas.drawPath((Path) pathList.get(i), ABCTracing.paint_brush);
            invalidate();
        }
    }
}

