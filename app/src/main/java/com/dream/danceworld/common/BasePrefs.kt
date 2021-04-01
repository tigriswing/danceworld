package com.dream.danceworld.common

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor

open class BasePrefs protected constructor(context: Context, prefsName: String?) {
    private val prefs: SharedPreferences
    private var editor: Editor? = null

    protected fun getBoolean(key: String?, defValue: Boolean): Boolean {
        return prefs.getBoolean(key, defValue)
    }

    protected fun getFloat(key: String?, defValue: Float): Float {
        return prefs.getFloat(key, defValue)
    }

    protected fun getInt(key: String?, defValue: Int): Int {
        return prefs.getInt(key, defValue)
    }

    protected fun getLong(key: String?, defValue: Long): Long {
        return prefs.getLong(key, defValue)
    }

    protected fun getString(key: String?, defValue: String?): String? {
        return prefs.getString(key, defValue)
    }

    protected fun putBoolean(key: String?, v: Boolean) {
        ensureEditorAvailability()
        editor!!.putBoolean(key, v)
    }

    protected fun putFloat(key: String?, v: Float) {
        ensureEditorAvailability()
        editor!!.putFloat(key, v)
    }

    protected fun putInt(key: String?, v: Int) {
        ensureEditorAvailability()
        editor!!.putInt(key, v)
    }

    protected fun putLong(key: String?, v: Long) {
        ensureEditorAvailability()
        editor!!.putLong(key, v)
    }

    protected fun putString(key: String?, v: String?) {
        ensureEditorAvailability()
        editor!!.putString(key, v)
    }

    fun save() {
        if (editor != null) {
            editor!!.commit()
        }
    }

    private fun ensureEditorAvailability() {
        if (editor == null) {
            editor = prefs.edit()
        }
    }

    init {
        prefs = context.getSharedPreferences(prefsName, Context.MODE_PRIVATE)
    }
}