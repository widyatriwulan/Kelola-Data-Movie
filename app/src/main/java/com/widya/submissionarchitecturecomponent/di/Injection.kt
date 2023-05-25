package com.widya.submissionarchitecturecomponent.di

import android.content.Context
import com.widya.submissionarchitecturecomponent.data.source.FilmRepository
import com.widya.submissionarchitecturecomponent.data.source.remote.RemoteDataSoure
import com.widya.submissionarchitecturecomponent.utils.DataJsonHelper

object Injection {

    fun provideRepository(context: Context): FilmRepository {
        val remodeDataSource = RemoteDataSoure.getInstance(DataJsonHelper(context))

        return FilmRepository.getInstance(remodeDataSource)
    }
}