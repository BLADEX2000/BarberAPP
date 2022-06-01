package com.example.barberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.widget.AppCompatButton
import com.example.barberapp.funciones.DatePickerFragment
import com.example.barberapp.funciones.TimePickerFragment


class AgendarActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var spnSesion:Spinner
    private lateinit var spnBarbero:Spinner
    private lateinit var edtFecha:EditText
    private lateinit var edtHora:EditText
    private lateinit var btnVolverAC:AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Oculta el actionBar
        getSupportActionBar()?.hide()


        setContentView(R.layout.agendar_activity)

        spnSesion=findViewById(R.id.spnSesion)
        spnBarbero=findViewById(R.id.spnBarbero)

        edtFecha=findViewById(R.id.etdFecha)
        edtFecha.setOnClickListener{mostrarDatePickerDialog()}

        edtHora=findViewById(R.id.edtHora)
        edtHora.setOnClickListener{mostrarTimePickerDialog()}

        btnVolverAC=findViewById(R.id.btnVolverAC)
        btnVolverAC.setOnClickListener(this)
    }

    // Funciones para el TimePicker
    private fun mostrarTimePickerDialog() {
        val timePicker=TimePickerFragment{onTimeSelected(it)}
        timePicker.show(supportFragmentManager, "time")
    }
    private fun onTimeSelected(time:String){
        edtHora.setText("$time")
    }

    //

    // Funciones para el dateTimePicker
    private fun mostrarDatePickerDialog() {
        val datepicker= DatePickerFragment{ dia, mes, year ->  onDateSelected(dia, mes, year)}
        datepicker.show(supportFragmentManager, "datePicker")
    }
    fun onDateSelected(dia:Int, mes:Int, year:Int){
        edtFecha.setText("$dia/$mes/$year")
    }

    override fun onClick(v: View?) {
        if (v==btnVolverAC){
            val desplazo= Intent(this,PrincipalActivity::class.java)
            startActivity(desplazo)
        }
    }
}