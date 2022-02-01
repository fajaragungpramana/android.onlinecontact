package com.github.fajaragungpramana.remote.source.auth.di

import android.content.SharedPreferences
import com.github.fajaragungpramana.remote.source.auth.AuthInterceptor
import com.github.fajaragungpramana.remote.source.auth.AuthPreference
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AuthModule {

    @Provides
    fun provideAuthPreference(sharedPreferences: SharedPreferences): AuthPreference =
        AuthPreference(sharedPreferences)

    @Provides
    fun provideAuthInterceptor(authPreference: AuthPreference): AuthInterceptor =
        AuthInterceptor(authPreference)

}