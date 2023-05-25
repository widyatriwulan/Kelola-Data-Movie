package com.widya.submissionarchitecturecomponent.detail


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.widya.submissionarchitecturecomponent.R
import com.widya.submissionarchitecturecomponent.data.FilmEntity
import com.widya.submissionarchitecturecomponent.databinding.ActivityDetailMovieBinding
import com.widya.submissionarchitecturecomponent.viewmodel.ViewModelFactory

class DetailMovieActivity : AppCompatActivity() {

    private lateinit var detailMovieActivity: ActivityDetailMovieBinding

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailMovieActivity = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(detailMovieActivity.root)

        val factory = ViewModelFactory.getInstance(this)
        val movieViewModel = ViewModelProvider(
            this,
            factory
        )[DetailMovieViewModel::class.java]

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setBackgroundDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.actionbar
            )
        )
        supportActionBar?.elevation = 0f
        supportActionBar?.title = ""

        val extra = intent.extras
        if (extra != null) {
            val movieId = extra.getString(EXTRA_DATA)
            if (movieId != null) {
                detailMovieActivity.progressBar.visibility= View.VISIBLE
                movieViewModel.setSelectMovie(movieId)
                movieViewModel.getMovie().observe(this,{movie ->
                    detailMovieActivity.progressBar.visibility = View.GONE
                    populateMovie(movie)
                })

            }
        }


    }


    private fun populateMovie(MovieEntity: FilmEntity) {
        detailMovieActivity.tvTitle.text = MovieEntity.title
        detailMovieActivity.tvRilis.text = MovieEntity.rilis
        detailMovieActivity.tvGenre.text = MovieEntity.genre
        detailMovieActivity.tvDirector.text = MovieEntity.director
        detailMovieActivity.tvScreen.text = MovieEntity.screenplay
        detailMovieActivity.tvDesc.text = MovieEntity.description
        Glide.with(this)
            .load(MovieEntity.image)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error)
            )
            .into(detailMovieActivity.imgMovie)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()

    }

}
