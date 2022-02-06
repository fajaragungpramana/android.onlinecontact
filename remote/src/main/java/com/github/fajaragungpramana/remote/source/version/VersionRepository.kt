package com.github.fajaragungpramana.remote.source.version

import com.github.fajaragungpramana.remote.common.DataResult
import com.github.fajaragungpramana.remote.extension.dataConnectionResult
import com.github.fajaragungpramana.remote.source.version.response.Version
import javax.inject.Inject

class VersionRepository @Inject constructor(private val mVersionService: VersionService) {

    suspend fun getVersion(): DataResult<Version> = dataConnectionResult {
        val response = mVersionService.getVersion()
        if (response.isSuccessful)
            DataResult.OnSuccess(response.body()?.data)
        else
            DataResult.OnFailure()
    }

}