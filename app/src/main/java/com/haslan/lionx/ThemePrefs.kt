package com.haslan.lionx

import android.content.Context
import androidx.preference.PreferenceManager

class ThemePrefs(context: Context) {

    companion object {
        private const val PREF_DARK_MODE = "pref_dark_mode"
    }

    private val preferences = PreferenceManager.getDefaultSharedPreferences(context)

    var darkMode = preferences.getInt(PREF_DARK_MODE, 0)
        set(value) = preferences.edit().putInt(PREF_DARK_MODE, value).apply()
}