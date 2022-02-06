package com.github.fajaragungpramana.remote.extension

import com.github.fajaragungpramana.remote.common.DataResult

inline fun <T> dataConnectionResult(run: () -> DataResult<T>): DataResult<T> =
    try {
        run()
    } catch (e: Throwable) {
        DataResult.OnError(e)
    }