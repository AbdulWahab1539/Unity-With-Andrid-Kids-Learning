package com.example.juvenilezone;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//import com.jaeger.library.StatusBarUtil;

public class Sounds extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3;
    MediaPlayer mediaPlayer;
    private SoundPool soundPool;
    private int bc1,bc2,bc3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setMaxStreams(6)
                    .setAudioAttributes(audioAttributes)
                    .build();
        }
        bc1=soundPool.load(this,R.raw.learn_letters ,1);
        bc2=soundPool.load(this,R.raw.lets_count ,1);
        bc3=soundPool.load(this,R.raw.learn_trace ,1);

        mediaPlayer = MediaPlayer.create(Sounds.this, R.raw.abcd);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        //StatusBarUtil.setTransparent(this);
        setContentView(R.layout.activity_sounds);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        b1=findViewById(R.id.soundabc);
        b2=findViewById(R.id.sound123);
        b3=findViewById(R.id.soundurdu);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
}

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.soundabc:
                soundPool.play(bc1,1,1,0,0,1);
                Intent intent=new Intent(this,ABCsounds.class);
                startActivity(intent);

                break;
            case R.id.sound123:
                soundPool.play(bc2,1,1,0,0,1);
                Intent intent1=new Intent(this, com.example.juvenilezone.Sounds123.class);
                startActivity(intent1);
                break;
            case R.id.soundurdu:
                soundPool.play(bc1,1,1,0,0,1);
                Intent intent2=new Intent(this,Urdusounds.class);
                startActivity(intent2);
                break;
        }
    }
    protected void onResume(){
        super.onResume();
        mediaPlayer.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        mediaPlayer.pause();
        mediaPlayer.release();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        soundPool.release();
        soundPool=null;
    }
    public void onBackPressed() {
        super.onBackPressed();

        Intent i=new Intent(Sounds.this, com.example.juvenilezone.MainActivityFrame.class);
        startActivity(i);
    }

    }



