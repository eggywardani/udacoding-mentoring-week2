package com.eggy.mytask2.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.eggy.mytask2.R
import kotlinx.android.synthetic.main.activity_recyclerview.*

class RecyclerviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val movieList = ArrayList<Movie>()

        movieList.add(Movie("Alita", R.drawable.poster_alita, "Action, Science Fiction, Adventure"))
        movieList.add(Movie("Aquaman", R.drawable.poster_aquaman, "Action, Adventure, Fantasy"))
        movieList.add(Movie("Glass", R.drawable.poster_glass, "Thriller, Drama, Science Fiction"))
        movieList.add(Movie("How to Train Your Dragon", R.drawable.poster_how_to_train, "Animation, Family, Adventure"))
        movieList.add(Movie("Avengers: Infinity War", R.drawable.poster_infinity_war,"Adventure, Action, Science Fiction"))
        movieList.add(Movie("Robin Hood", R.drawable.poster_robin_hood, "Adventure, Action, Thriller"))
        movieList.add(Movie("Master Z", R.drawable.poster_master_z, "\"Action\","))
        movieList.add(Movie("Overload", R.drawable.poster_overlord, "Horror, War, Science Fiction"))
        movieList.add(Movie("Serenity", R.drawable.poster_serenity, "Thriller, Mystery, Drama"))
        movieList.add(Movie("Spiderman: into the spider verse", R.drawable.poster_spiderman, "Action, Adventure, Animation, Science Fiction, Comedy"))


        val adapter = RecyclerviewAdapter(movieList)
        recyclerview.layoutManager = GridLayoutManager(this, 2)
        recyclerview.adapter = adapter

    }
}