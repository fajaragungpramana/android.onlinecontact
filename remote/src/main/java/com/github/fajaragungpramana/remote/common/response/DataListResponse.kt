package com.github.fajaragungpramana.remote.common.response

import com.google.gson.annotations.SerializedName

data class DataListResponse<T>(

    @SerializedName("code")
    val code: Int? = null,

    @SerializedName("message")
    val message: String? = null,

    @SerializedName("data")
    val data: List<T>? = null

)