package com.bosquedex.bosquedexcolomos

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.bosquedex.bosquedexcolomos.presentation.CameraScreen
import com.bosquedex.bosquedexcolomos.ui.theme.CameraXAppTheme
//import com.ahmed_apps.camerax_app.presentation.CameraScreen
//import com.ahmed_apps.camerax_app.ui.theme.CameraXAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class Camera : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!arePermissionsGranted()) {
            ActivityCompat.requestPermissions(
                this, CAMERA_PERMISSION, 100
            )
        }

        setContent {
            CameraXAppTheme {
                CameraScreen(this)
            }
        }
    }

    fun arePermissionsGranted(): Boolean {
        return CAMERA_PERMISSION.all { perssion ->
            ContextCompat.checkSelfPermission(
                applicationContext,
                perssion
            ) == PackageManager.PERMISSION_GRANTED
        }
    }

    companion object {
        val CAMERA_PERMISSION = arrayOf(
            Manifest.permission.CAMERA,
            Manifest.permission.RECORD_AUDIO
        )
    }

}