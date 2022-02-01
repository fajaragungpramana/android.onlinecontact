package com.github.fajaragungpramana.remote.source.version.di

import com.github.fajaragungpramana.remote.source.version.VersionService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class VersionModule {

    @Provides
    fun provideVersionService(retrofit: Retrofit): VersionService =
        retrofit.create(VersionService::class.java)

}