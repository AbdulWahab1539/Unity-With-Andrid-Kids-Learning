package com.example.juvenilezone;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

//import com.jaeger.library.StatusBarUtil;

public class ABCTracing extends AppCompatActivity implements View.OnClickListener, com.example.juvenilezone.Info, com.example.juvenilezone.MyTouchEventListener {
    public static Path path = new Path();
    public static Paint paint_brush = new Paint();
    private ImageButton next, pre;
    int c = 0;
    int temp = c;
    int[] h;


    static ImageView eimageView;
    ImageView constraintLayoutBg;
    Bitmap bitmap;
    String hex;
    private com.example.juvenilezone.display display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //StatusBarUtil.setTransparent(this);
        setContentView(R.layout.activity_a_b_c_tracing);

        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
            Log.i(TAG, "some thing is wrong");
        }

        display = findViewById(R.id.conn);
        eimageView = findViewById(R.id.imagev);
        eimageView.buildDrawingCache(true);
        eimageView.setDrawingCacheEnabled(true);
        next = findViewById(R.id.rightArrow);
        pre = findViewById(R.id.leftArrow);
        next.setVisibility(View.GONE);
        pre.setVisibility(View.GONE);
        constraintLayoutBg = findViewById(R.id.imagev);

        setListeners();
    }


    private void setListeners() {
        pre.setOnClickListener(this);
        next.setOnClickListener(this);
        display.setListener(this);
    }

    public void redColor(View view) {
        paint_brush.setColor(Color.RED);
        currentColor(paint_brush.getColor());
    }

    public void yellowColor(View view) {
        paint_brush.setColor(Color.YELLOW);
        currentColor(paint_brush.getColor());
    }

    public void greenColor(View view) {
        paint_brush.setColor(Color.GREEN);
        currentColor(paint_brush.getColor());
    }

    private void currentColor(int c) {
        display.current_brush = c;
        path = new Path();
    }

    public void eraser(View view) {
        display.pathList.clear();
        display.colorList.clear();
        path.reset();
    }

    public void pencil(View view) {
        paint_brush.setColor(Color.BLACK);
        currentColor(paint_brush.getColor());
    }

    public void Engi(View view) {

        next.setVisibility(View.VISIBLE);
        pre.setVisibility(View.VISIBLE);
        int[] Imagecontex = {R.drawable.a, R.drawable.b, R.drawable.c,
                R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g,
                R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k,
                R.drawable.l, R.drawable.m, R.drawable.n, R.drawable.o,
                R.drawable.p, R.drawable.qq, R.drawable.r, R.drawable.s
                , R.drawable.t, R.drawable.u, R.drawable.v, R.drawable.w
                , R.drawable.x, R.drawable.y, R.drawable.z};
        h = null;
        h = Imagecontex.clone();
        constraintLayoutBg.setBackgroundResource(h[0]);

        c = 0;
        next.setEnabled(true);
        pre.setEnabled(true);
        bitmap = eimageView.getDrawingCache();
    }

    public void Digi(View view) {

        next.setVisibility(View.VISIBLE);
        pre.setVisibility(View.VISIBLE);

        int[] Imagecontex = {R.drawable.zerotrace, R.drawable.onetrace, R.drawable.twotrace
                , R.drawable.threetrace, R.drawable.fourtrace, R.drawable.fivetrace, R.drawable.sixtrace
                , R.drawable.seventrace, R.drawable.eighttrace, R.drawable.ninetrace};

        h = null;
        h = Imagecontex.clone();
        constraintLayoutBg.setBackgroundResource(h[0]);
        c = 0;
        next.setEnabled(true);
        pre.setEnabled(true);
        bitmap = eimageView.getDrawingCache();
    }

    public void Urdu(View view) {

        next.setVisibility(View.VISIBLE);
        pre.setVisibility(View.VISIBLE);

        int[] Imagecontex = {R.drawable.urdu2, R.drawable.urdu3, R.drawable.urdu4
                , R.drawable.urdu5, R.drawable.urdu6, R.drawable.urdu7, R.drawable.urdu8, R.drawable.urdu9
                , R.drawable.urdu10, R.drawable.urdu11, R.drawable.urdu12, R.drawable.urdu13, R.drawable.urdu14
                , R.drawable.urdu15, R.drawable.urdu16, R.drawable.urdu17, R.drawable.urdu18, R.drawable.urdu19
                , R.drawable.urdu20, R.drawable.urdu21, R.drawable.urdu22, R.drawable.urdu23, R.drawable.urdu24
                , R.drawable.urdu25, R.drawable.urdu26, R.drawable.urdu27, R.drawable.urdu28, R.drawable.urdu29
                , R.drawable.urdu30, R.drawable.urdu31, R.drawable.urdu32, R.drawable.urdu33, R.drawable.urdu34
                , R.drawable.urdu35, R.drawable.urdu36, R.drawable.urdu37, R.drawable.urdu38};
        h = null;
        h = Imagecontex.clone();
        constraintLayoutBg.setBackgroundResource(h[0]);
        c = 0;

        next.setEnabled(true);
        pre.setEnabled(true);
        bitmap = eimageView.getDrawingCache();
    }

    @Override

    public void onClick(View v) {

        if (v == pre) {
            c--;
            temp = c;

            if (temp == -1) {
                pre.setEnabled(false);
            } else if (temp != -1) {
                next.setEnabled(true);
                constraintLayoutBg.setBackgroundResource(h[temp]);
            }
            eraser(v);
            bitmap = eimageView.getDrawingCache();
        } else if (v == next) {
            c++;
            temp = c;
            if (temp >= h.length) {
                next.setEnabled(false);
            } else if (temp < h.length) {
                pre.setEnabled(true);
                constraintLayoutBg.setBackgroundResource(h[temp]);
            }
            eraser(v);
            bitmap = eimageView.getDrawingCache();
        }
    }

    @Override
    public void onTouch(MotionEvent event) {
        Log.i(TAG, "onTouch: X : " + event.getX() + " Y : " + event.getY());
    }

    @Override
    public boolean shouldDraw(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        if (bitmap == null || x < 0 || y < 0)

            return false;

        int pixel = bitmap.getPixel((int) event.getX(), (int) event.getY());
        hex = '#' + Integer.toHexString(pixel);
        Log.i(TAG, "hex for pixel " + pixel + " is " + hex);
        return hex.equals("#ffcecece");
    }

    public void onBackPressed() {
        super.onBackPressed();

        Intent i = new Intent(ABCTracing.this, com.example.juvenilezone.MainActivityFrame.class);
        startActivity(i);
    }
}
