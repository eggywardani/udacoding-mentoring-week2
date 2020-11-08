package com.eggy.mytask2.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.eggy.mytask2.R
import kotlinx.android.synthetic.main.activity_detail_recycler.view.*
import kotlinx.android.synthetic.main.item_recycler.view.*

class RecyclerviewAdapter(val movie: List<Movie> ):RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movie: Movie){
            with(itemView){
                tv_title.text = movie.name
                Glide.with(itemView.context)
                    .load(movie.images)
                    .into(img_item_photo)

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailRecyclerActivity::class.java)
                        .putExtra(DetailRecyclerActivity.EXTRA_MOVIE, movie)
                    context.startActivity(intent)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return holder.bind(movie[position])
    }

    override fun getItemCount(): Int = movie.size

}