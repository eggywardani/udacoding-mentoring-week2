package com.eggy.mytask2.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import com.eggy.mytask2.R
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)


        val list = ArrayList<Beach>()

        list.add(Beach("Pantai Parang Tritis", R.drawable.parangtritis, "Bantul"))
        list.add(Beach("Pantai Goa Cina", R.drawable.goa_cina, "Malang"))
        list.add(Beach("Pantai Carita", R.drawable.carita, "Pandeglang"))
        list.add(Beach("Pantai Santolo", R.drawable.santolo, "Garut"))
        list.add(Beach("Pantai Klayar", R.drawable.klayar,"Pacitan"))
        list.add(Beach("Pantai Tambakrejo", R.drawable.tambakrejo, "Blitar"))
        list.add(Beach("Pantai Wedi Ireng", R.drawable.wedi_ireng, "Banyuwangi"))
        list.add(Beach("Pantai Pangi", R.drawable.pangi, "Blitar"))
        list.add(Beach("Pantai Kuta", R.drawable.kuta, "Badung"))
        list.add(Beach("Pantai DreamLand", R.drawable.dreamland, "Badung"))

        val adapter = ListViewAdapter(this,list )
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, DetailListActivity::class.java)
            intent.putExtra(DetailListActivity.EXTRA_DATA, list[position])
            startActivity(intent)
        }

    }
}