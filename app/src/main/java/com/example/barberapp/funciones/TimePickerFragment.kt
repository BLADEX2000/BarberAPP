package com.example.barberapp.funciones

import android.app.Dialog
import android.app.TimePickerDialog
import android.content.Context
import android.os.Bundle
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import com.example.barberapp.R
import java.util.*

class TimePickerFragment(val listener:(String)->Unit):DialogFragment(),TimePickerDialog.OnTimeSetListener {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val calendario:Calendar= Calendar.getInstance()
        val hora:Int=calendario.get(Calendar.HOUR_OF_DAY)
        val minuto:Int=calendario.get(Calendar.MINUTE)

        val dialogo=TimePickerDialog(activity as Context, this,hora,minuto,true)

        return dialogo
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        listener("$hourOfDay:$minute")
    }
}