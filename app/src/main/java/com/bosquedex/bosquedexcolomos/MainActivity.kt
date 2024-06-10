package com.bosquedex.bosquedexcolomos

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)
        val btnActivity1 = findViewById<Button>(R.id.btnActivity1)
        val btnActivity2 = findViewById<Button>(R.id.btnActivity2)
        val btnActivity3 = findViewById<Button>(R.id.btnActivity3)

        btnActivity1.setOnClickListener {
            val intent1 = Intent(this, Camera::class.java)
            startActivity(intent1)
        }


        btnActivity2.setOnClickListener {
            val intent2 = Intent(this, CameraActivity::class.java)
            startActivity(intent2)
        }

        btnActivity3.setOnClickListener {
            val intent3 = Intent(this, ColeccionActivity::class.java)
            startActivity(intent3)
        }
    }
}

