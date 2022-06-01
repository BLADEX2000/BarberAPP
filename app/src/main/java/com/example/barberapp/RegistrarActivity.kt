package com.example.barberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton


class RegistrarActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var btnVolverR:AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getSupportActionBar()?.hide()

        setContentView(R.layout.registrar_activity)

        btnVolverR=findViewById(R.id.btnVolverR)
        btnVolverR.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v==btnVolverR){
            val desplazo= Intent(this,MainActivity::class.java)
            startActivity(desplazo)
        }
    }
}