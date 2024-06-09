package com.bosquedex.bosquedexcolomos

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.compose.setContent
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.bosquedex.bosquedexcolomos.Camera.Companion.CAMERA_PERMISSION
import com.bosquedex.bosquedexcolomos.presentation.CameraScreen
import com.bosquedex.bosquedexcolomos.ui.theme.CameraXAppTheme
import android.Manifest
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val btnActivity1 = findViewById<Button>(R.id.btnActivity1)
        val btnActivity2 = findViewById<Button>(R.id.btnActivity2)

        btnActivity1.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)

        }

        btnActivity2.setOnClickListener {
            val intent2 = Intent(this, Camera::class.java)
            startActivity(intent2)

        }


    }

}


