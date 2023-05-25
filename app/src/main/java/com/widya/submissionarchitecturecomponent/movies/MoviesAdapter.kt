package com.widya.submissionarchitecturecomponent.movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.widya.submissionarchitecturecomponent.R
import com.widya.submissionarchitecturecomponent.data.FilmEntity
import com.widya.submissionarchitecturecomponent.databinding.ItemsMoviesBinding
import com.widya.submissionarchitecturecomponent.detail.DetailMovieActivity

class MoviesAdapter(private val callback: MoviesFragmentCallback) :
    RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    private lateinit var itemsMoviesBinding: ItemsMoviesBinding
    private var listMovies = ArrayList<FilmEntity>()

    fun setMovies(movies: List<FilmEntity>?) {
        if (movies == null) return
        this.listMovies.clear()
        this.listMovies.addAll(movies)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        itemsMoviesBinding =
            ItemsMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMoviesBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movies = listMovies[position]
        holder.bind(movies)
    }

    override fun getItemCount(): Int = listMovies.size

    inner class MovieViewHolder(private val binding: ItemsMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movies: FilmEntity) {
            with(binding) {
                tvTitle.text = movies.title
                tvGenre.text = movies.genre
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_DATA, movies.filmId)
                    itemMovies.context.startActivity(intent)
                }
                ibShare.setOnClickListener {
                    callback.onShareClic(movies)
                }
                Glide.with(itemView.context)
                    .load(movies.image)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(imageMovie)
            }
        }

    }

}