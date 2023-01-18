package com.example.login


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val buttonClick = findViewById<ImageButton>(R.id.imageButton)
        val buttonClick2 = findViewById<ImageButton>(R.id.imageButton2)

        buttonClick.setOnClickListener {
            val intent = Intent(this, GuardianDashboard::class.java)
            startActivity(intent)
        }
        buttonClick2.setOnClickListener {
            val intent = Intent(this, Preschooler::class.java)
            startActivity(intent)
        }
    }

    }
