package com.widya.submissionarchitecturecomponent.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.widya.submissionarchitecturecomponent.R
import com.widya.submissionarchitecturecomponent.data.TvshowEntity
import com.widya.submissionarchitecturecomponent.databinding.ItemsTvshowBinding
import com.widya.submissionarchitecturecomponent.detail.DetailTvShowActivity

class TvshowAdapter(private val callback: TvshowFragmentCallback) :
    RecyclerView.Adapter<TvshowAdapter.TvShowViewHolder>() {

    private val listTvshow = ArrayList<TvshowEntity>()

    fun setTvshow(tvshow: List<TvshowEntity>?) {
        if (tvshow == null) return
        this.listTvshow.clear()
        this.listTvshow.addAll(tvshow)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TvShowViewHolder {
        val itemsTvshowBinding =
            ItemsTvshowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsTvshowBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvshow = listTvshow[position]
        holder.bind(tvshow)
    }

    override fun getItemCount(): Int = listTvshow.size

    inner class TvShowViewHolder(private val binding: ItemsTvshowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshow: TvshowEntity) {
            with(binding) {
                tvTitle.text = tvshow.title
                tvGenre.text = tvshow.genre
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTvShowActivity::class.java)
                    intent.putExtra(DetailTvShowActivity.EXTRA_DATA, tvshow.tvshowid)
                    itemTvshow.context.startActivity(intent)
                }
                ibShare.setOnClickListener {
                    callback.onShareClick(tvshow)
                }
                Glide.with(itemView.context)
                    .load(tvshow.image)
                    .apply(
                        RequestOptions.placeholderOf(R.drawable.ic_loading)
                            .error(R.drawable.ic_error)
                    )
                    .into(imagetvshow)
            }

        }
    }

}