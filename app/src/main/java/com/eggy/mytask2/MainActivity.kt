package com.eggy.mytask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_login.setOnClickListener {
            val username = edt_username.text.toString()
            val password = edt_password.text.toString()
            val intent = Intent(this, DashboardActivity::class.java)


            if (username.isEmpty()){
                edt_username.error = "username tidak boleh kosong"
            }else if (password.isEmpty()){
                edt_password.error = "password tidak boleh kosong"
            }else if (username == getString(R.string.username_login) && password == getString(R.string.pass_login)){
                Toasty.success(this, "Anda berhasil login", Toast.LENGTH_SHORT, false).show()
                intent.putExtra(DashboardActivity.EXTRA_USER, username)
                startActivity(intent)
            }else{
                Toasty.error(this, "username atau password salah", Toast.LENGTH_SHORT, false).show()

            }
        }
    }
}