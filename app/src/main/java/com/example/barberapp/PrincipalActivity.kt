package com.example.barberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class PrincipalActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var btnAgendar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getSupportActionBar()?.hide()

        setContentView(R.layout.principal_activity)
        btnAgendar=findViewById(R.id.btnAgendar)

        btnAgendar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v==btnAgendar){
            val desplazo=Intent(this,AgendarActivity::class.java)
            startActivity(desplazo)
        }
    }
}