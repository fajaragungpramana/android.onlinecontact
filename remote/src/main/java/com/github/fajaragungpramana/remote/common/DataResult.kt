package com.github.fajaragungpramana.remote.common

sealed class DataResult<T> {

    data class OnSuccess<T>(val data: T?) : DataResult<T>()
    data class OnFailure<T>(val code: Int? = null, val data: T? = null) : DataResult<T>()
    data class OnError<T>(val throwable: Throwable) : DataResult<T>()

}