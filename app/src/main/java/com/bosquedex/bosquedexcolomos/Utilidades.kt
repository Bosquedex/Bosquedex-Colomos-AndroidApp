package com.bosquedex.bosquedexcolomos

// En un archivo separado, por ejemplo, AchievementUtils.kt
import android.content.Context
import android.content.SharedPreferences

object Utilidades {


    const val sharedPrefFile = "achievements"
    const val achievement1Key = "ACHIEVEMENT_1"
    const val achievement2Key = "ACHIEVEMENT_2"
    const val achievement3Key = "ACHIEVEMENT_3"
    const val achievement4Key = "ACHIEVEMENT_4"
    const val achievement5Key = "ACHIEVEMENT_5"
    const val achievement6Key = "ACHIEVEMENT_6"
    const val achievement7Key = "ACHIEVEMENT_7"
    const val achievement8Key = "ACHIEVEMENT_8"
    const val achievement9Key = "ACHIEVEMENT_9"
    const val achievement10Key = "ACHIEVEMENT_10"
    const val achievement11Key = "ACHIEVEMENT_11"
    const val achievement12Key = "ACHIEVEMENT_12"
    const val achievement13Key = "ACHIEVEMENT_13"
    const val achievement14Key = "ACHIEVEMENT_14"
    const val achievement15Key = "ACHIEVEMENT_15"
    const val achievement16Key = "ACHIEVEMENT_16"
    const val achievement17Key = "ACHIEVEMENT_17"
    const val achievement18Key = "ACHIEVEMENT_18"
    const val achievement19Key = "ACHIEVEMENT_19"
    const val achievement20Key = "ACHIEVEMENT_20"
    const val achievement21Key = "ACHIEVEMENT_21"
    const val achievement22Key = "ACHIEVEMENT_22"
    const val achievement23Key = "ACHIEVEMENT_23"
    const val achievement24Key = "ACHIEVEMENT_24"


    fun completarLogro(logroKey: String, context: Context) {
        val sharedPreferences = context.getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putBoolean(logroKey, false)
        editor.apply()
    }
}