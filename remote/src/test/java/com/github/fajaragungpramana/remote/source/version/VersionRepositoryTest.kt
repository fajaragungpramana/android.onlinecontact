package com.github.fajaragungpramana.remote.source.version

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.github.fajaragungpramana.remote.common.DataResult
import com.github.fajaragungpramana.remote.constant.HttpRouteConstant
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@RunWith(MockitoJUnitRunner::class)
class VersionRepositoryTest {

    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var mVersionRepository: VersionRepository

    @Before
    fun setup() {
        val versionService = Retrofit.Builder()
            .baseUrl(HttpRouteConstant.LOCAL_GATEWAY)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(VersionService::class.java)

        mVersionRepository = VersionRepository(versionService)
    }

    @Test
    fun checkVersionIsNotNull() {
        runBlocking {
            val result = mVersionRepository.getVersion()
            Assert.assertNotNull(result)
        }
    }

    @Test
    fun checkVersionCodeIsMoreThanOne() {
        runBlocking {

            when (val result = mVersionRepository.getVersion()) {
                is DataResult.OnSuccess -> {
                    val versionCode = result.data?.versionCode ?: 0
                    Assert.assertTrue(versionCode >= 1)
                }

                is DataResult.OnFailure -> {

                }

                is DataResult.OnError -> {

                }
            }
        }
    }

}