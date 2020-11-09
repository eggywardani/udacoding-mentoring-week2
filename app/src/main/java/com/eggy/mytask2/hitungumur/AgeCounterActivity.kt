package com.eggy.mytask2.hitungumur

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.eggy.mytask2.R
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_age_counter.*
import java.util.*

class AgeCounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age_counter)

        btn_hitung.setOnClickListener {

            val tahunSekarang = Calendar.getInstance().get(Calendar.YEAR)
            val tahunLahir = edt_tahun_lahir.text.toString().toInt()

            val umur = tahunSekarang.toInt() - tahunLahir.toInt()
            if (tahunLahir <= tahunSekarang){
                tv_umur.text = umur.toString()
            } else{
                Toasty.error(this, "Tahun Tidak Valid", Toast.LENGTH_SHORT, false).show()
            }

        }
    }


}