package com.github.fajaragungpramana.remote.di

import android.content.Context
import android.content.SharedPreferences
import com.github.fajaragungpramana.remote.constant.RemoteConstant
import com.github.fajaragungpramana.remote.source.auth.Auth
import com.github.fajaragungpramana.remote.source.auth.AuthInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object RemoteModule {

    @Provides
    fun provideRestClient(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl(RemoteConstant.LOCAL_GATEWAY)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

    @Provides
    fun provideRestClientInterceptor(authInterceptor: AuthInterceptor): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .addInterceptor(authInterceptor)
            .build()

    @Provides
    fun provideSharedPreference(): SharedPreferences {
        val context = Auth.context

        return if (context != null)
            context.getSharedPreferences(
                RemoteConstant.DATA_SHARED_PREFERENCES,
                Context.MODE_PRIVATE
            )
        else
            throw NullPointerException("Auth context is not initialized.")
    }

}