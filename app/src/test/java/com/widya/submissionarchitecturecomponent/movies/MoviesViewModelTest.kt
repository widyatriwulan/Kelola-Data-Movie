package com.widya.submissionarchitecturecomponent.movies

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.nhaarman.mockitokotlin2.verify
import com.widya.submissionarchitecturecomponent.data.FilmEntity
import com.widya.submissionarchitecturecomponent.data.source.FilmRepository
import com.widya.submissionarchitecturecomponent.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MoviesViewModelTest {
    private lateinit var moVieModel : MoviesViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var observer: Observer<List<FilmEntity>>

    @Before
    fun setUp(){
        moVieModel = MoviesViewModel(filmRepository)
    }

    @Test
    fun getMovies() {
        val dummyMovies = DataDummy.generateDummyMovies()
        val movies = MutableLiveData<List<FilmEntity>>()
        movies.value = dummyMovies
        `when`(filmRepository.getMovies()).thenReturn(movies)
        val movieEntities = moVieModel.getMovies().value
        verify(filmRepository).getMovies()
        assertNotNull(movieEntities)
        assertEquals(10,movieEntities?.size)

        moVieModel.getMovies().observeForever(observer)
        verify(observer).onChanged(dummyMovies)
    }
}