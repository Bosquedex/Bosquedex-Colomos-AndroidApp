package com.bosquedex.bosquedexcolomos

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Pop : AppCompatActivity() {
    private lateinit var texto:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popp)

        texto=findViewById(R.id.nombre)
        texto.text = intent.getStringExtra("nombre")
        texto=findViewById(R.id.descripcion)
        texto.text = intent.getStringExtra("descripcion")
        texto=findViewById(R.id.habitat)
        texto.text = intent.getStringExtra("habitat")
        texto=findViewById(R.id.dieta)
        texto.text = intent.getStringExtra("dieta")
        texto=findViewById(R.id.comportamiento)
        texto.text = intent.getStringExtra("comportamiento")
        texto=findViewById(R.id.reproduccion)
        texto.text = intent.getStringExtra("reproduccion")
        texto=findViewById(R.id.conservacion)
        texto.text = intent.getStringExtra("conservacion")
        texto=findViewById(R.id.curiosidad)
        texto.text = intent.getStringExtra("curiosidad")

        val dm = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(dm)

        val width = dm.widthPixels
        val height = dm.heightPixels

        window.setLayout((width * 0.8).toInt(), (height * 0.7).toInt())

    }
}
