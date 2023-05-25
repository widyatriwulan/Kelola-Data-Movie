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
import com.widya.submissionarchitecturecomponent.data.TvshowEntity
import com.widya.submissionarchitecturecomponent.databinding.ActivityDetailTvShowBinding
import com.widya.submissionarchitecturecomponent.viewmodel.ViewModelFactory

class DetailTvShowActivity : AppCompatActivity() {

    private lateinit var detailtvshowActivity: ActivityDetailTvShowBinding

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailtvshowActivity = ActivityDetailTvShowBinding.inflate(layoutInflater)
        setContentView(detailtvshowActivity.root)

        val factory = ViewModelFactory.getInstance(this)
        val tvVieModel = ViewModelProvider(
            this,
            factory
        )[DetailTvShowViewModel::class.java]
        supportActionBar?.elevation = 0f
        supportActionBar?.title = ""
        supportActionBar?.setBackgroundDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.actionbar
            )
        )

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val extra = intent.extras
        if (extra != null) {
            val tvshowid = extra.getString(EXTRA_DATA)
            if (tvshowid != null) {

                detailtvshowActivity.progressBar.visibility = View.VISIBLE
                tvVieModel.setSelectTvshow(tvshowid)
                tvVieModel.getTvshow().observe(this, { tv ->
                    detailtvshowActivity.progressBar.visibility = View.GONE
                    populateTvshow(tv)
                })

            }
        }


    }

    private fun populateTvshow(tvshowEntity: TvshowEntity) {
        detailtvshowActivity.tvTitle.text = tvshowEntity.title
        detailtvshowActivity.tvTahun.text = tvshowEntity.tahun
        detailtvshowActivity.tvGenre.text = tvshowEntity.genre
        detailtvshowActivity.tvDesc.text = tvshowEntity.description
        Glide.with(this)
            .load(tvshowEntity.image)
            .transform(RoundedCorners(20))
            .apply(
                RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error)
            )
            .into(detailtvshowActivity.imgMovie)


    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()

    }
}





