package com.bosquedex.bosquedexcolomos

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ColeccionActivity : AppCompatActivity() {

    private val sharedPrefFile = "achievements"
    private val achievement1Key = "ACHIEVEMENT_1"
    private val achievement2Key = "ACHIEVEMENT_2"
    private val achievement3Key = "ACHIEVEMENT_3"

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
        val sharedPreferences = getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE)

        val achievement2Completed = sharedPreferences.getBoolean(achievement2Key, false)
        val achievement3Completed = sharedPreferences.getBoolean(achievement3Key, false)

        imageView1.visibility = if (achievement2Completed) View.VISIBLE else View.GONE
        imageView2.visibility = if (achievement3Completed) View.VISIBLE else View.GONE
    }
}
