package com.example.juvenilezone;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Urdusounds extends AppCompatActivity implements View.OnClickListener {
    public Button
            b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setBackgroundDrawableResource(R.drawable.letters_bg);
        setContentView(R.layout.activity_urdusounds);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        b1=(Button) findViewById(R.id.us1);
        b2=(Button) findViewById(R.id.us2);
        b3=(Button) findViewById(R.id.us3);
        b4=(Button) findViewById(R.id.us4);
        b5=(Button) findViewById(R.id.us5);
        b6=(Button) findViewById(R.id.us6);
        b7=(Button) findViewById(R.id.us7);
        b8=(Button) findViewById(R.id.us8);
        b9=(Button) findViewById(R.id.us9);
        b10=(Button) findViewById(R.id.us10);
        b11=(Button) findViewById(R.id.us11);
        b12=(Button) findViewById(R.id.us12);
        b13=(Button) findViewById(R.id.us13);
        b14=(Button) findViewById(R.id.us14);
        b15=(Button) findViewById(R.id.us15);
        b16=(Button) findViewById(R.id.us16);
        b17=(Button) findViewById(R.id.us17);
        b18=(Button) findViewById(R.id.us18);
        b19=(Button) findViewById(R.id.us19);
        b20=(Button) findViewById(R.id.us20);
        b21=(Button) findViewById(R.id.us21);
        b22=(Button) findViewById(R.id.us22);
        b23=(Button) findViewById(R.id.us23);
        b24=(Button) findViewById(R.id.us24);
        b25=(Button) findViewById(R.id.us25);
        b26=(Button) findViewById(R.id.us26);
        b27=(Button) findViewById(R.id.us27);
        b28=(Button) findViewById(R.id.us28);
        b29=(Button) findViewById(R.id.us29);
        b30=(Button) findViewById(R.id.us30);
        b31=(Button) findViewById(R.id.us31);
        b32=(Button) findViewById(R.id.us32);
        b33=(Button) findViewById(R.id.us33);
        b34=(Button) findViewById(R.id.us34);
        b35=(Button) findViewById(R.id.us35);
        b36=(Button) findViewById(R.id.us36);
        b37=(Button) findViewById(R.id.us37);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);
        b26.setOnClickListener(this);
        b27.setOnClickListener(this);
        b28.setOnClickListener(this);
        b29.setOnClickListener(this);
        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);
        b35.setOnClickListener(this);
        b36.setOnClickListener(this);
        b37.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
         switch (v.getId()){
             case R.id.us1:
                 MediaPlayer mp0 = MediaPlayer.create(this, R.raw.s1);
                 mp0.start();
                 while (mp0.isPlaying()) {
                 };
                 mp0.release();
                 break;
             case R.id.us2:
                 MediaPlayer mp1 = MediaPlayer.create(this, R.raw.s2);
                 mp1.start();
                 while (mp1.isPlaying()) {
                 };
                 mp1.release();
                 break;
             case R.id.us3:
                 MediaPlayer mp2 = MediaPlayer.create(this, R.raw.s3);
                 mp2.start();
                 while (mp2.isPlaying()) {
                 };
                 mp2.release();
                 break;


             case R.id.us4:
                 MediaPlayer mp3 = MediaPlayer.create(this, R.raw.s4);
                 mp3.start();
                 while (mp3.isPlaying()) {
                 };
                 mp3.release();
                 break;
             case R.id.us5:
                 MediaPlayer mp4 = MediaPlayer.create(this, R.raw.s5);
                 mp4.start();
                 while (mp4.isPlaying()) {
                 };
                 mp4.release();
                 break;
             case R.id.us6:
                 MediaPlayer mp5 = MediaPlayer.create(this, R.raw.s6);
                 mp5.start();
                 while (mp5.isPlaying()) {
                 };
                 mp5.release();
                 break;
             case R.id.us7:
                 MediaPlayer mp6 = MediaPlayer.create(this, R.raw.s7);
                 mp6.start();
                 while (mp6.isPlaying()) {
                 };
                 mp6.release();
                 break;
             case R.id.us8:
                 MediaPlayer mp7 = MediaPlayer.create(this, R.raw.s8);
                 mp7.start();
                 while (mp7.isPlaying()) {
                 };
                 mp7.release();
                 break;
             case R.id.us9:
                 MediaPlayer mp8 = MediaPlayer.create(this, R.raw.s9);
                 mp8.start();
                 while (mp8.isPlaying()) {
                 };
                 mp8.release();
                 break;
             case R.id.us10:
                 MediaPlayer mp9 = MediaPlayer.create(this, R.raw.s10);
                 mp9.start();
                 while (mp9.isPlaying()) {
                 };
                 mp9.release();
                 break;
             case R.id.us11:
                 MediaPlayer mp10 = MediaPlayer.create(this, R.raw.s11);
                 mp10.start();
                 while (mp10.isPlaying()) {
                 };
                 mp10.release();
                 break;
             case R.id.us12:
                 MediaPlayer mp11 = MediaPlayer.create(this, R.raw.s12);
                 mp11.start();
                 while (mp11.isPlaying()) {
                 };
                 mp11.release();
                 break;
             case R.id.us13:
                 MediaPlayer mp12 = MediaPlayer.create(this, R.raw.s13);
                 mp12.start();
                 while (mp12.isPlaying()) {
                 };
                 mp12.release();
                 break;
             case R.id.us14:
                 MediaPlayer mp13 = MediaPlayer.create(this, R.raw.s14);
                 mp13.start();
                 while (mp13.isPlaying()) {
                 };
                 mp13.release();
                 break;
             case R.id.us15:
                 MediaPlayer mp14 = MediaPlayer.create(this, R.raw.s15);
                 mp14.start();
                 while (mp14.isPlaying()) {
                 };
                 mp14.release();
                 break;
             case R.id.us16:
                 MediaPlayer mp15 = MediaPlayer.create(this, R.raw.s16);
                 mp15.start();
                 while (mp15.isPlaying()) {
                 };
                 mp15.release();
                 break;
             case R.id.us17:
                 MediaPlayer mp16 = MediaPlayer.create(this, R.raw.s17);
                 mp16.start();
                 while (mp16.isPlaying()) {
                 };
                 mp16.release();
                 break;
             case R.id.us18:
                 MediaPlayer mp17 = MediaPlayer.create(this, R.raw.s18);
                 mp17.start();
                 while (mp17.isPlaying()) {
                 };
                 mp17.release();
                 break;

             case R.id.us19:
                 MediaPlayer mp18 = MediaPlayer.create(this, R.raw.s19);
                 mp18.start();
                 while (mp18.isPlaying()) {
                 };
                 mp18.release();
                 break;
             case R.id.us20:
                 MediaPlayer mp19 = MediaPlayer.create(this, R.raw.s20);
                 mp19.start();
                 while (mp19.isPlaying()) {
                 };
                 mp19.release();
                 break;
             case R.id.us21:
                 MediaPlayer mp20 = MediaPlayer.create(this, R.raw.s21);
                 mp20.start();
                 while (mp20.isPlaying()) {
                 };
                 mp20.release();
                 break;
             case R.id.us22:
                 MediaPlayer mp21 = MediaPlayer.create(this, R.raw.s22);
                 mp21.start();
                 while (mp21.isPlaying()) {
                 };
                 mp21.release();
                 break;
             case R.id.us23:
                 MediaPlayer mp22 = MediaPlayer.create(this, R.raw.s23);
                 mp22.start();
                 while (mp22.isPlaying()) {
                 };
                 mp22.release();
                 break;
             case R.id.us24:
                 MediaPlayer mp23 = MediaPlayer.create(this, R.raw.s24);
                 mp23.start();
                 while (mp23.isPlaying()) {
                 };
                 mp23.release();
                 break;
             case R.id.us25:
                 MediaPlayer mp24 = MediaPlayer.create(this, R.raw.s25);
                 mp24.start();
                 while (mp24.isPlaying()) {
                 };
                 mp24.release();
                 break;
             case R.id.us26:
                 MediaPlayer mp25 = MediaPlayer.create(this, R.raw.s26);
                 mp25.start();
                 while (mp25.isPlaying()) {
                 };
                 mp25.release();
                 break;
             case R.id.us27:
                 MediaPlayer mp26 = MediaPlayer.create(this, R.raw.s27);
                 mp26.start();
                 while (mp26.isPlaying()) {
                 };
                 mp26.release();
                 break;
             case R.id.us28:
                 MediaPlayer mp27 = MediaPlayer.create(this, R.raw.s28);
                 mp27.start();
                 while (mp27.isPlaying()) {
                 };
                 mp27.release();
                 break;
             case R.id.us29:
                 MediaPlayer mp28 = MediaPlayer.create(this, R.raw.s29);
                 mp28.start();
                 while (mp28.isPlaying()) {
                 };
                 mp28.release();
                 break;
             case R.id.us30:
                 MediaPlayer mp29 = MediaPlayer.create(this, R.raw.s30);
                 mp29.start();
                 while (mp29.isPlaying()) {
                 };
                 mp29.release();
                 break;
             case R.id.us31:
                 MediaPlayer mp30 = MediaPlayer.create(this, R.raw.s31);
                 mp30.start();
                 while (mp30.isPlaying()) {
                 };
                 mp30.release();
                 break;
             case R.id.us32:
                 MediaPlayer mp31 = MediaPlayer.create(this, R.raw.s32);
                 mp31.start();
                 while (mp31.isPlaying()) {
                 };
                 mp31.release();
                 break;
             case R.id.us33:
                 MediaPlayer mp32 = MediaPlayer.create(this, R.raw.s33);
                 mp32.start();
                 while (mp32.isPlaying()) {
                 };
                 mp32.release();
                 break;
             case R.id.us34:
                 MediaPlayer mp33 = MediaPlayer.create(this, R.raw.s34);
                 mp33.start();
                 while (mp33.isPlaying()) {
                 };
                 mp33.release();
                 break;
             case R.id.us35:
                 MediaPlayer mp34 = MediaPlayer.create(this, R.raw.s35);
                 mp34.start();
                 while (mp34.isPlaying()) {
                 };
                 mp34.release();
                 break;
             case R.id.us36:
                 MediaPlayer mp35 = MediaPlayer.create(this, R.raw.s36);
                 mp35.start();
                 while (mp35.isPlaying()) {
                 };
                 mp35.release();
                 break;
             case R.id.us37:
                 MediaPlayer mp36 = MediaPlayer.create(this, R.raw.s37);
                 mp36.start();
                 while (mp36.isPlaying()) {
                 };
                 mp36.release();
                 break;

         }
    }
    public void onBackPressed() {
        super.onBackPressed();

        Intent i=new Intent(Urdusounds.this, com.example.juvenilezone.Sounds.class);
        startActivity(i);
    }

}

