package com.github.fajaragungpramana.onlinecontact.di

import android.app.Application
import com.github.fajaragungpramana.remote.source.auth.Auth
import com.github.fajaragungpramana.remote.source.auth.AuthListener
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application(), AuthListener {

    override fun onCreate() {
        super.onCreate()

        Auth.context = applicationContext
        Auth.listener = this
    }

    override fun onUnauthorized() {
        // TODO: Make user re login if request get 401
    }

    override fun onInternalServerError() {
        // TODO: Show toast message if request get 500
    }

    override fun onServiceUnavailable() {
        // TODO: Show toast message if request get 503
    }

}