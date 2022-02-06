package com.github.fajaragungpramana.remote.source.auth

import android.annotation.SuppressLint
import android.content.Context

@SuppressLint("StaticFieldLeak")
object Auth {

    var context: Context? = null
    var listener: AuthListener? = null

}