package com.example.juvenilezone;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//import com.unity3d.player.UnityPlayerActivity;

public class PuzzleGames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_games);
        Button button=findViewById(R.id.puzzles);

    }
    public void onBackPressed() {
        super.onBackPressed();

        Intent i=new Intent(PuzzleGames.this, com.example.juvenilezone.MainActivityFrame.class);
        startActivity(i);
    }
}