package com.widya.submissionarchitecturecomponent.data.source

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.widya.submissionarchitecturecomponent.data.FilmEntity
import com.widya.submissionarchitecturecomponent.data.TvshowEntity
import com.widya.submissionarchitecturecomponent.data.source.remote.RemoteDataSoure
import com.widya.submissionarchitecturecomponent.data.source.remote.response.FilmResponse
import com.widya.submissionarchitecturecomponent.data.source.remote.response.TvShowResponse

class FilmRepository private constructor(private val remoteDataSoure: RemoteDataSoure) :
    FilmDataSource {

    companion object {
        @Volatile
        private var instance: FilmRepository? = null

        fun getInstance(remoteDataSoure: RemoteDataSoure): FilmRepository =
            instance ?: synchronized(this) {
                instance ?: FilmRepository(remoteDataSoure).apply { instance = this }
            }
    }

    override fun getMovies(): LiveData<List<FilmEntity>> {
        val moviesResult = MutableLiveData<List<FilmEntity>>()
        remoteDataSoure.getMovies(object : RemoteDataSoure.LoadMoviesCallback {
            override fun onAllMoviesReceived(filmResponse: List<FilmResponse>) {
                val movieList = ArrayList<FilmEntity>()
                for (m in filmResponse) {
                    val movies = FilmEntity(
                        m.filmId,
                        m.title,
                        m.description,
                        m.rilis,
                        m.genre,
                        m.director,
                        m.screenplay,
                        m.image
                    )
                    movieList.add(movies)
                }
                moviesResult.postValue(movieList)
            }
        })
        return moviesResult
    }

    override fun getTvshow(): LiveData<List<TvshowEntity>> {
        val tvResult = MutableLiveData<List<TvshowEntity>>()
        remoteDataSoure.getTvshow(object : RemoteDataSoure.LoadTvshowCallback {
            override fun onAllTvshowReceived(tvShowResponse: List<TvShowResponse>) {
                val tvList = ArrayList<TvshowEntity>()
                for (tv in tvShowResponse) {
                    val tvshow = TvshowEntity(
                        tv.tvshowid,
                        tv.title,
                        tv.description,
                        tv.tahun,
                        tv.genre,
                        tv.image
                    )
                    tvList.add(tvshow)
                }
                tvResult.postValue(tvList)
            }
        })
        return tvResult

    }

    override fun MovieDetails(filmId: String): LiveData<FilmEntity> {
        val detailMovie = MutableLiveData<FilmEntity>()
        remoteDataSoure.getMovies(object : RemoteDataSoure.LoadMoviesCallback {
            override fun onAllMoviesReceived(filmResponse: List<FilmResponse>) {
                lateinit var movies: FilmEntity
                for (md in filmResponse) {
                    if (md.filmId == filmId) {
                        movies = FilmEntity(
                            md.filmId,
                            md.title,
                            md.description,
                            md.rilis,
                            md.genre,
                            md.director,
                            md.screenplay,
                            md.image
                        )
                    }
                }
                detailMovie.postValue(movies)
            }
        })
        return detailMovie

    }


    override fun TvshowDetails(tvshowId: String): LiveData<TvshowEntity> {
        val tvshowDetail = MutableLiveData<TvshowEntity>()
        remoteDataSoure.getTvshow(object : RemoteDataSoure.LoadTvshowCallback {
            override fun onAllTvshowReceived(tvShowResponse: List<TvShowResponse>) {
                lateinit var tshows: TvshowEntity
                for (tv in tvShowResponse) {
                    if (tv.tvshowid == tvshowId) {
                        tshows = TvshowEntity(
                            tv.tvshowid,
                            tv.title,
                            tv.description,
                            tv.tahun,
                            tv.genre,
                            tv.image
                        )
                    }
                }
                tvshowDetail.postValue(tshows)
            }
        })
        return tvshowDetail
    }
}