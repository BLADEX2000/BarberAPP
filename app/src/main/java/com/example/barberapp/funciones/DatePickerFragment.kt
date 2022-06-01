package com.example.barberapp.funciones

import android.app.DatePickerDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.widget.DatePicker
import androidx.fragment.app.DialogFragment
import com.example.barberapp.R
import java.util.*

// Clase donde se crea la funcion que muestra el datepicker

class DatePickerFragment(val listener:(dia:Int, mes:Int, year:Int) ->Unit):DialogFragment(),
    DatePickerDialog.OnDateSetListener {

    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {
        listener(dayOfMonth,month,year)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c=Calendar.getInstance()

        val dia=c.get(Calendar.DAY_OF_MONTH)
        val mes=c.get(Calendar.MONTH)
        val year=c.get(Calendar.YEAR)

        val picker=DatePickerDialog(activity as Context,this, year,mes,dia)
        picker.datePicker.minDate=c.timeInMillis
        return picker
    }
}