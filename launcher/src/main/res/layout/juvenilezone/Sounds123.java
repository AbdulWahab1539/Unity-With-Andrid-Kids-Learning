package com.example.juvenilezone;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//import com.jaeger.library.StatusBarUtil;

public class Sounds123 extends AppCompatActivity implements View.OnClickListener {
    Button[] buttons=new Button[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //StatusBarUtil.setTransparent(this);
        getWindow().setBackgroundDrawableResource(R.drawable.numbers_bg);
        setContentView(R.layout.activity_sounds123);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        buttons[0]=(Button) findViewById(R.id.zero);
        buttons[1]=(Button) findViewById(R.id.one);
        buttons[2]=(Button) findViewById(R.id.two);
        buttons[3]=(Button) findViewById(R.id.three);
        buttons[4]=(Button) findViewById(R.id.four);
        buttons[5]=(Button) findViewById(R.id.five);
        buttons[6]=(Button) findViewById(R.id.six);
        buttons[7]=(Button) findViewById(R.id.seven);
        buttons[8]=(Button) findViewById(R.id.eight);
        buttons[9]=(Button) findViewById(R.id.nine);

        buttons[0].setOnClickListener(this);
        buttons[1].setOnClickListener(this);
        buttons[2].setOnClickListener(this);
        buttons[3].setOnClickListener(this);
        buttons[4].setOnClickListener(this);
        buttons[5].setOnClickListener(this);
        buttons[6].setOnClickListener(this);
        buttons[7].setOnClickListener(this);
        buttons[8].setOnClickListener(this);
        buttons[9].setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.zero:


                MediaPlayer mp0 = MediaPlayer.create(this, R.raw.sound0);
                mp0.start();
                while (mp0.isPlaying()) {
                };
                mp0.release();
                break;
            case R.id.one:
                MediaPlayer mp1 = MediaPlayer.create(this, R.raw.sound1);
                mp1.start();
                while (mp1.isPlaying()) {
                };
                mp1.release();
                break;
            case R.id.two:
                MediaPlayer mp2 = MediaPlayer.create(this, R.raw.sound2);
                mp2.start();
                while (mp2.isPlaying()) {
                };
                mp2.release();
                break;
            case R.id.three:
                MediaPlayer mp3 = MediaPlayer.create(this, R.raw.sound3);
                mp3.start();
                while (mp3.isPlaying()) {
                };
                mp3.release();
                break;
            case R.id.four:
                MediaPlayer mp4 = MediaPlayer.create(this, R.raw.sound4);
                mp4.start();
                while (mp4.isPlaying()) {
                };
                mp4.release();
                break;
            case R.id.five:
                MediaPlayer mp5 = MediaPlayer.create(this, R.raw.sound5);
                mp5.start();
                while (mp5.isPlaying()) {
                };
                mp5.release();
                break;
            case R.id.six:
                MediaPlayer mp6 = MediaPlayer.create(this, R.raw.sound6);
                mp6.start();
                while (mp6.isPlaying()) {
                };
                mp6.release();
                break;
            case R.id.seven:
                MediaPlayer mp7 = MediaPlayer.create(this, R.raw.sound7);
                mp7.start();
                while (mp7.isPlaying()) {
                };
                mp7.release();
                break;
            case R.id.eight:
                MediaPlayer mp8 = MediaPlayer.create(this, R.raw.sound8);
                mp8.start();
                while (mp8.isPlaying()) {
                };
                mp8.release();
                break;
            case R.id.nine:
                MediaPlayer mp9 = MediaPlayer.create(this, R.raw.sound9);
                mp9.start();
                while (mp9.isPlaying()) {
                };
                mp9.release();
                break;
        }

    }
    public void onBackPressed() {
        super.onBackPressed();

        Intent i=new Intent(Sounds123.this, Sounds.class);
        startActivity(i);
    }

}