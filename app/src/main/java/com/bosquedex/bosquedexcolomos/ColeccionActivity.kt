package com.bosquedex.bosquedexcolomos

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ColeccionActivity : AppCompatActivity() {

    private lateinit var imageButton1: ImageView
    private lateinit var imageButton2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coleccion)
        val info1 = Intent(this, Pop::class.java)

        // Initialize button views
        imageButton1 = findViewById(R.id.imageButton1)
        imageButton2 = findViewById(R.id.imageButton2)

        imageButton1.setOnClickListener {
            info1.putExtra("nombre","Abaniquillo Pañuelo del Pacífico/Anolis nebulosus")
            info1.putExtra("descripcion","Lagarto de aprox 32-55mm, grisaceo marron, con un apendice similar a un abanico verde, del cual se desconoce su esperanza de vida exacta")
            info1.putExtra("habitat","Endemico de la costa del pacifico de Mexico")
            info1.putExtra("dieta","Se alimenta de insectos, otros artropodos o incluso su propia piel desprendida")
            info1.putExtra("comportamiento","Diurnos arboreos, suelen ser agresivos para defender su territorio")
            info1.putExtra("reproduccion","Oviparos, ponen huevos en epocas de lluvias")
            info1.putExtra("conservacion","En Preocupacion Menor")
            info1.putExtra("curiosidad","Pueden desprender su cola para escapar de los depredadores, y luego les crece una nueva")
            startActivity(info1)
        }

        imageButton2.setOnClickListener {
            info1.putExtra("message","Boton 2 Seleccionado")
            startActivity(info1)
        }

        // Load achievement statuses
        loadAchievementStatuses()
    }

    private fun loadAchievementStatuses() {
        val sharedPreferences = getSharedPreferences(Utilidades.sharedPrefFile, Context.MODE_PRIVATE)

        val achievement1Completed = sharedPreferences.getBoolean(Utilidades.achievement1Key, false)
        val achievement2Completed = sharedPreferences.getBoolean(Utilidades.achievement2Key, false)
        val achievement3Completed = sharedPreferences.getBoolean(Utilidades.achievement3Key, false)
        val achievement4Completed = sharedPreferences.getBoolean(Utilidades.achievement4Key, false)
        val achievement5Completed = sharedPreferences.getBoolean(Utilidades.achievement5Key, false)
        val achievement6Completed = sharedPreferences.getBoolean(Utilidades.achievement6Key, false)
        val achievement7Completed = sharedPreferences.getBoolean(Utilidades.achievement7Key, false)
        val achievement8Completed = sharedPreferences.getBoolean(Utilidades.achievement8Key, false)
        val achievement9Completed = sharedPreferences.getBoolean(Utilidades.achievement9Key, false)
        val achievement10Completed = sharedPreferences.getBoolean(Utilidades.achievement10Key, false)
        val achievement11Completed = sharedPreferences.getBoolean(Utilidades.achievement11Key, false)
        val achievement12Completed = sharedPreferences.getBoolean(Utilidades.achievement12Key, false)
        val achievement13Completed = sharedPreferences.getBoolean(Utilidades.achievement13Key, false)
        val achievement14Completed = sharedPreferences.getBoolean(Utilidades.achievement14Key, false)
        val achievement15Completed = sharedPreferences.getBoolean(Utilidades.achievement15Key, false)
        val achievement16Completed = sharedPreferences.getBoolean(Utilidades.achievement16Key, false)
        val achievement17Completed = sharedPreferences.getBoolean(Utilidades.achievement17Key, false)
        val achievement18Completed = sharedPreferences.getBoolean(Utilidades.achievement18Key, false)
        val achievement19Completed = sharedPreferences.getBoolean(Utilidades.achievement19Key, false)
        val achievement20Completed = sharedPreferences.getBoolean(Utilidades.achievement20Key, false)
        val achievement21Completed = sharedPreferences.getBoolean(Utilidades.achievement21Key, false)
        val achievement22Completed = sharedPreferences.getBoolean(Utilidades.achievement22Key, false)
        val achievement23Completed = sharedPreferences.getBoolean(Utilidades.achievement23Key, false)
        val achievement24Completed = sharedPreferences.getBoolean(Utilidades.achievement24Key, false)

        imageButton1.visibility = if (achievement1Completed) View.VISIBLE else View.GONE
        imageButton2.visibility = if (achievement2Completed) View.VISIBLE else View.GONE
    }
}
