package com.eggy.mytask2.kalkulatorbmi

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.eggy.mytask2.R
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_age_counter.*
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlinx.android.synthetic.main.activity_calculator.btn_hitung
import java.text.DecimalFormat

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        btn_hitung.setOnClickListener {
            val berat = edt_berat.text.toString().toInt()
            val tinggi = edt_tinggi.text.toString().toInt() * 0.01

            val bmi = berat / (tinggi * tinggi)
            val df = DecimalFormat("#.##")
            val bmiResult = df.format(bmi)

            if (rg_jekel.checkedRadioButtonId == R.id.rb_pria){
                when{
                    bmi <18 ->{
                        tv_hasil.text = "Kurus"
                    }
                    bmi in 18.0..25.0 ->{
                        tv_hasil.text = "Normal"
                    }
                    bmi in 25.0..27.0 ->{
                        tv_hasil.text = "Kegemukan"
                    }
                    bmi > 27 ->{
                        tv_hasil.text = "Obesitas"
                    }

                }
            }else{
                when{
                    bmi <17 ->{
                        tv_hasil.text = "Kurus"
                    }
                    bmi in 17.0..23.0 ->{
                        tv_hasil.text = "Normal"
                    }
                    bmi in 23.0..27.0 ->{
                        tv_hasil.text = "Kegemukan"
                    }
                    bmi > 27 ->{
                        tv_hasil.text = "Obesitas"
                    }

                }

            }
            tv_hasil_bmi.text = bmiResult.toString()

        }

    }


}