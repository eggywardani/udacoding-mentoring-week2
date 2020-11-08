package com.eggy.mytask2.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.eggy.mytask2.R

class ListViewAdapter(val context: Context, val beach: List<Beach>): BaseAdapter() {
    override fun getCount(): Int = beach.size

    override fun getItem(p0: Int): Any = beach[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val view = LayoutInflater.from(context).inflate(R.layout.item_listview, p2, false)
        val photo = view.findViewById<ImageView>(R.id.iv_image)
        val nama = view.findViewById<TextView>(R.id.tv_nama)
        val item = beach[p0]

        nama.text = item.name

        Glide.with(context)
            .load(item.images)
            .into(photo)


        return view

    }

}