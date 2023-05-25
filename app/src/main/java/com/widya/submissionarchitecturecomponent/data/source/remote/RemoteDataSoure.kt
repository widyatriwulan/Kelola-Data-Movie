package com.widya.submissionarchitecturecomponent.data.source.remote

import android.os.Handler
import android.os.Looper
import com.widya.submissionarchitecturecomponent.data.source.remote.response.FilmResponse
import com.widya.submissionarchitecturecomponent.data.source.remote.response.TvShowResponse
import com.widya.submissionarchitecturecomponent.utils.DataJsonHelper
import com.widya.submissionarchitecturecomponent.utils.EspressoIdlingResource

class RemoteDataSoure private constructor(private val dataJsonHelper: DataJsonHelper) {
    private val handler = Handler(Looper.getMainLooper())

    companion object {
        private const val SERVICE_LATENCY_IN_MILLIS: Long = 2000

        @Volatile
        private var instance: RemoteDataSoure? = null

        fun getInstance(helper: DataJsonHelper): RemoteDataSoure =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSoure(helper).apply { instance = this }

            }
    }

    fun getMovies(callback: LoadMoviesCallback) {
        EspressoIdlingResource.increment()
        handler.postDelayed(
            {
                callback.onAllMoviesReceived(dataJsonHelper.loadMovies())
                EspressoIdlingResource.decrement()
            },
            SERVICE_LATENCY_IN_MILLIS
        )
    }

    fun getTvshow(callback: LoadTvshowCallback) {
        EspressoIdlingResource.increment()
        handler.postDelayed(
            {
                callback.onAllTvshowReceived(dataJsonHelper.loadTvShow())
                EspressoIdlingResource.decrement()
            },
            SERVICE_LATENCY_IN_MILLIS
        )
    }

    interface LoadMoviesCallback {
        fun onAllMoviesReceived(filmResponse: List<FilmResponse>)
    }

    interface LoadTvshowCallback {
        fun onAllTvshowReceived(tvShowResponse: List<TvShowResponse>)
    }


}