package com.github.fajaragungpramana.remote.source.version.response

import com.google.gson.annotations.SerializedName

data class Version(

    @SerializedName("version_code")
    val versionCode: Int? = null

)