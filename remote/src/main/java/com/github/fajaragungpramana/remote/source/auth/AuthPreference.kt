package com.github.fajaragungpramana.remote.source.auth

import android.content.SharedPreferences
import javax.inject.Inject

class AuthPreference @Inject constructor(private val mSharedPreferences: SharedPreferences) {

    companion object {
        const val DATA_ACCESS_TOKEN = "auth.access_token"
    }

    fun get() = Data(mSharedPreferences.getString(DATA_ACCESS_TOKEN, null))

    fun set(data: Data) {
        mSharedPreferences.edit()
            .putString(DATA_ACCESS_TOKEN, data.accessToken)
            .apply()
    }

    data class Data(
        val accessToken: String? = null
    )

}