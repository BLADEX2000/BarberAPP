package com.example.barberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.AppCompatButton


class MainActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var btnRegistrarC:AppCompatButton
    private lateinit var btnIngresar:AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        getSupportActionBar()?.hide()

        setContentView(R.layout.activity_main)

        btnRegistrarC=findViewById(R.id.btnRegistrarC)
        btnRegistrarC.setOnClickListener(this)

        btnIngresar=findViewById(R.id.btnIngresar)
        btnIngresar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v==btnRegistrarC){
            val desplazo= Intent(this,RegistrarActivity::class.java)
            startActivity(desplazo)
        }
        else if (v==btnIngresar){
            val desplazo= Intent(this,PrincipalActivity::class.java)
            startActivity(desplazo)
        }
    }
}