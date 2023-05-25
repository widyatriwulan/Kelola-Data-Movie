package com.widya.submissionarchitecturecomponent.tvshow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.widya.submissionarchitecturecomponent.R
import com.widya.submissionarchitecturecomponent.data.TvshowEntity
import com.widya.submissionarchitecturecomponent.databinding.FragmentTvShowBinding
import com.widya.submissionarchitecturecomponent.viewmodel.ViewModelFactory


class TvShowFragment : Fragment(), TvshowFragmentCallback {

    lateinit var fragmentTvShowBinding: FragmentTvShowBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentTvShowBinding = FragmentTvShowBinding.inflate(inflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {

            val factory = ViewModelFactory.getInstance(requireActivity())
            val tvshowViewModel = ViewModelProvider(this, factory)[TvShowViewModel::class.java]
            val adapter = TvshowAdapter(this)
            fragmentTvShowBinding.progressBar.visibility = View.VISIBLE
            tvshowViewModel.getTvShow().observe(viewLifecycleOwner, { tv ->
                fragmentTvShowBinding.progressBar.visibility = View.GONE
                adapter.setTvshow(tv)
                adapter.notifyDataSetChanged()
            })

            with(fragmentTvShowBinding.rvTvshow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }



    override fun onShareClick(tvshow: TvshowEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Share Tv Show Now")
                .setText(resources.getString(R.string.share_text, tvshow.title))
                .startChooser()
        }
    }


}