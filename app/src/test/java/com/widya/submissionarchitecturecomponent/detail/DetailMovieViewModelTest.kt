package com.widya.submissionarchitecturecomponent.detail

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
class DetailMovieViewModelTest {
    private lateinit var movieViewModel: DetailMovieViewModel
    private val dummyMovie = DataDummy.generateDummyMovies()[0]
    private val movieId = dummyMovie.filmId

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var moviesObserver: Observer<FilmEntity>

    @Before
    fun setUp() {
        movieViewModel = DetailMovieViewModel(filmRepository)
        movieViewModel.setSelectMovie(movieId)
    }

    @Test
    fun getMovie() {
        val movies = MutableLiveData<FilmEntity>()
        movies.value = dummyMovie

        `when`(filmRepository.MovieDetails(movieId)).thenReturn(movies)
        val movieEntity = movieViewModel.getMovie().value as FilmEntity
        verify(filmRepository).MovieDetails(movieId)
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.filmId, movieEntity.filmId)
        assertEquals(dummyMovie.title, movieEntity.title)
        assertEquals(dummyMovie.rilis, movieEntity.rilis)
        assertEquals(dummyMovie.genre, movieEntity.genre)
        assertEquals(dummyMovie.director, movieEntity.director)
        assertEquals(dummyMovie.screenplay, movieEntity.screenplay)
        assertEquals(dummyMovie.description, movieEntity.description)
        assertEquals(dummyMovie.image, movieEntity.image)

        movieViewModel.getMovie().observeForever(moviesObserver)
        verify(moviesObserver).onChanged(dummyMovie)


    }

}