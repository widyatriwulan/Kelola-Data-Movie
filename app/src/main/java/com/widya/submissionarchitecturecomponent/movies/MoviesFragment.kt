package com.widya.submissionarchitecturecomponent.movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.widya.submissionarchitecturecomponent.R
import com.widya.submissionarchitecturecomponent.data.FilmEntity
import com.widya.submissionarchitecturecomponent.databinding.FragmentMoviesBinding
import com.widya.submissionarchitecturecomponent.viewmodel.ViewModelFactory


class MoviesFragment : Fragment() , MoviesFragmentCallback{

    private lateinit var fragmentMoviesBinding: FragmentMoviesBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentMoviesBinding = FragmentMoviesBinding.inflate(layoutInflater)
       return fragmentMoviesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            val moviesViewModel = ViewModelProvider(this,factory)[MoviesViewModel::class.java]
            val moviesAdapter = MoviesAdapter(this)
            fragmentMoviesBinding.progressBar.visibility = View.VISIBLE
            moviesViewModel.getMovies().observe(viewLifecycleOwner,{movie ->
                fragmentMoviesBinding.progressBar.visibility = View.GONE
                moviesAdapter.setMovies(movie)
                moviesAdapter.notifyDataSetChanged()
            })

            with(fragmentMoviesBinding.rvMovies) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = moviesAdapter
            }
        }
    }
    override fun onShareClic(movies: FilmEntity) {
        if (activity != null){
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Share Tv Show Now")
                .setText(resources.getString(R.string.share_text, movies.title))
                .startChooser()
        }
    }
    }

