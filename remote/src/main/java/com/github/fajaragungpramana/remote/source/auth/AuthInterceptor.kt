package com.github.fajaragungpramana.remote.source.auth

import com.github.fajaragungpramana.remote.constant.RemoteConstant
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(private val mAuthPreference: AuthPreference) :
    Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
        if (mAuthPreference.get().accessToken != null)
            request.addHeader("Authorization", "Bearer ${mAuthPreference.get().accessToken}")

        val response = chain.proceed(request.build())
        when (response.code) {
            RemoteConstant.HTTP_UNAUTHORIZED -> Auth.listener?.onUnauthorized()
            RemoteConstant.HTTP_INTERNAL_SERVER_ERROR -> Auth.listener?.onInternalServerError()
            RemoteConstant.HTTP_SERVICE_UNAVAILABLE -> Auth.listener?.onServiceUnavailable()
        }

        return response
    }

}