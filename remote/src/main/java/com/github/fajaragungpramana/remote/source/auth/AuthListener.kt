package com.github.fajaragungpramana.remote.source.auth

interface AuthListener {

    fun onUnauthorized()

    fun onInternalServerError()
    fun onServiceUnavailable()

}