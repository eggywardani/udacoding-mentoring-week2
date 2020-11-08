package com.eggy.mytask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eggy.mytask2.hitungumur.AgeCounterActivity
import com.eggy.mytask2.kalkulatorbmi.CalculatorActivity
import com.eggy.mytask2.listview.ListViewActivity
import com.eggy.mytask2.recyclerview.RecyclerviewActivity
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_USER = "extra_user"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val data = intent.getStringExtra(EXTRA_USER)
        tv_username.text = "Hai $data"

        ll_umur.setOnClickListener{
            startActivity(Intent(this, AgeCounterActivity::class.java))
        }
        ll_kalkulator.setOnClickListener{
            startActivity(Intent(this, CalculatorActivity::class.java))
        }
        ll_list.setOnClickListener{
            startActivity(Intent(this, ListViewActivity::class.java))
        }
        ll_recycler.setOnClickListener{
            startActivity(Intent(this, RecyclerviewActivity::class.java))
        }




    }
}