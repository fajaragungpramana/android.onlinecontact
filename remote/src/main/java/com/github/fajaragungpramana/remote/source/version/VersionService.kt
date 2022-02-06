package com.github.fajaragungpramana.remote.source.version

import com.github.fajaragungpramana.remote.common.response.DataResponse
import com.github.fajaragungpramana.remote.constant.HttpRouteConstant
import com.github.fajaragungpramana.remote.source.version.response.Version
import retrofit2.Response
import retrofit2.http.GET

interface VersionService {

    @GET(HttpRouteConstant.GET_VERSION)
    suspend fun getVersion(): Response<DataResponse<Version>>

}