package com.bosquedex.bosquedexcolomos

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager.PERMISSION_GRANTED
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnActivity1: Button
    private lateinit var btnActivity2: Button
    private lateinit var btnActivity3: Button





    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)
        btnActivity1 = findViewById(R.id.btnActivity1)
        btnActivity2 = findViewById(R.id.btnActivity2)
        btnActivity3 = findViewById(R.id.btnActivity3)



        // Define a requestPermissionLauncher using the RequestPermission contract
        val requestPermissionLauncher =
            this.registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
                // Check if the permission is granted
                if (isGranted) {
                    // Show a toast message for permission granted
                    // get image from android device

                } else {
                    // Show a toast message asking the user to grant the permission
                    Toast.makeText(this, "Please grant permission", Toast.LENGTH_LONG).show()
                }
            }


        btnActivity1.setOnClickListener {
            val intent1 = Intent(this, Camera::class.java)
            startActivity(intent1)
        }


        btnActivity2.setOnClickListener {
            if (
                Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU &&
                (
                        ContextCompat.checkSelfPermission(this,
                            Manifest.permission.READ_MEDIA_IMAGES
                        ) == PERMISSION_GRANTED ||
                                ContextCompat.checkSelfPermission(this,
                                    Manifest.permission.READ_MEDIA_VIDEO
                                ) == PERMISSION_GRANTED
                )
            ) {
                // Full access on Android 13 (API level 33) or higher
                val intent2 = Intent(this, CameraActivity::class.java)
                startActivity(intent2)

            } else if (
                Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE &&
                ContextCompat.checkSelfPermission(this,
                    Manifest.permission.READ_MEDIA_VISUAL_USER_SELECTED
                ) == PERMISSION_GRANTED
            ) {
                val intent2 = Intent(this, CameraActivity::class.java)
                startActivity(intent2)
                // Partial access on Android 14 (API level 34) or higher
            }  else if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.READ_EXTERNAL_STORAGE
                ) == PERMISSION_GRANTED) {
                val intent2 = Intent(this, CameraActivity::class.java)
                startActivity(intent2)

                // Full access up to Android 12 (API level 32)
            } else {

                // Permission request logic
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) {
                    requestPermissionLauncher.launch(Manifest.permission.READ_MEDIA_IMAGES)

                    requestPermissionLauncher.launch(Manifest.permission.READ_MEDIA_VISUAL_USER_SELECTED)

                } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    requestPermissionLauncher.launch(Manifest.permission.READ_MEDIA_IMAGES)
                } else {
                    requestPermissionLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE)
                }


            }



        }

        btnActivity3.setOnClickListener {
            val intent3 = Intent(this, ColeccionActivity::class.java)
            startActivity(intent3)
        }
    }
}

