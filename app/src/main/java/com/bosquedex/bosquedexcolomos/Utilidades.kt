package com.bosquedex.bosquedexcolomos

// En un archivo separado, por ejemplo, AchievementUtils.kt
import android.content.Context
import android.content.SharedPreferences

object Utilidades {


    const val sharedPrefFile = "achievements"
    const val achievement1Key = "ACHIEVEMENT_1"
    const val achievement2Key = "ACHIEVEMENT_2"

    fun completarLogro(logroKey: String, context: Context) {
        val sharedPreferences = context.getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean(logroKey, false)
        editor.apply()
    }
}