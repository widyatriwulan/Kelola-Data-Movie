package com.widya.submissionarchitecturecomponent.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.widya.submissionarchitecturecomponent.data.source.FilmRepository
import com.widya.submissionarchitecturecomponent.detail.DetailMovieViewModel
import com.widya.submissionarchitecturecomponent.detail.DetailTvShowViewModel
import com.widya.submissionarchitecturecomponent.di.Injection
import com.widya.submissionarchitecturecomponent.movies.MoviesViewModel
import com.widya.submissionarchitecturecomponent.tvshow.TvShowViewModel

class ViewModelFactory private constructor(private val mFilmRepository: FilmRepository):ViewModelProvider.NewInstanceFactory(){
    companion object{
        @Volatile
        private var instance : ViewModelFactory? = null

        fun getInstance(context: Context):ViewModelFactory =
            instance?: synchronized(this){
                instance?:ViewModelFactory(Injection.provideRepository(context)).apply {
                    instance = this
                }

            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        when{
            modelClass.isAssignableFrom(MoviesViewModel::class.java) ->{
                return MoviesViewModel(mFilmRepository) as T
            }
            modelClass.isAssignableFrom(TvShowViewModel::class.java) ->{
                return TvShowViewModel(mFilmRepository) as T
            }
            modelClass.isAssignableFrom(DetailMovieViewModel::class.java) ->{
                return DetailMovieViewModel(mFilmRepository) as T
            }
            modelClass.isAssignableFrom(DetailTvShowViewModel::class.java) ->{
                return DetailTvShowViewModel(mFilmRepository) as T
            }
            else->throw  Throwable("Dont have  ViewModel class: " + modelClass.name)

        }
    }
}