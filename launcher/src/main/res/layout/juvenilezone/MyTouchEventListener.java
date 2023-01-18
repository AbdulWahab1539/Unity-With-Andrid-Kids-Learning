package com.example.juvenilezone;

import android.view.MotionEvent;

public interface MyTouchEventListener {
    void onTouch(MotionEvent event);
    boolean shouldDraw(MotionEvent event);
}
