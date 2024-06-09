package com.bosquedex.bosquedexcolomos

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ColeccionActivity : AppCompatActivity() {

    private lateinit var imageView1: ImageView
    private lateinit var imageView2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coleccion)

        // Initialize image views
        imageView1 = findViewById(R.id.imageView1)
        imageView2 = findViewById(R.id.imageView2)

        // Load achievement statuses
        loadAchievementStatuses()
    }

    private fun loadAchievementStatuses() {
        val sharedPreferences = getSharedPreferences(Utilidades.sharedPrefFile, Context.MODE_PRIVATE)

        val achievement1Completed = sharedPreferences.getBoolean(Utilidades.achievement1Key, false)
        val achievement2Completed = sharedPreferences.getBoolean(Utilidades.achievement2Key, false)

        imageView1.visibility = if (achievement1Completed) View.VISIBLE else View.GONE
        imageView2.visibility = if (achievement2Completed) View.VISIBLE else View.GONE
    }
}
