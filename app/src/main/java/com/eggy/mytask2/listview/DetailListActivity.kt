package com.eggy.mytask2.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.eggy.mytask2.R
import kotlinx.android.synthetic.main.activity_detail_list.*

class DetailListActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_DATA = "extra_data"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_list)

        val data = intent.getParcelableExtra<Beach>(EXTRA_DATA) as Beach

        tv_nama.text = data.name
        tv_kota.text = data.city
        Glide.with(this)
            .load(data.images)
            .into(iv_image)


    }
}