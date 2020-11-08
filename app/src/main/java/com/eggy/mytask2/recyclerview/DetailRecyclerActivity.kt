package com.eggy.mytask2.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.eggy.mytask2.R
import kotlinx.android.synthetic.main.activity_detail_recycler.*

class DetailRecyclerActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_MOVIE = "extra_movie"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_recycler)



        val data = intent.getParcelableExtra<Movie>(EXTRA_MOVIE) as Movie

        tv_judul.text = data.name
        tv_genre.text = data.genre
        Glide.with(this)
            .load(data.images)
            .into(iv_image)
        Glide.with(this)
            .load(data.images)
            .into(circleImageView)


    }
}