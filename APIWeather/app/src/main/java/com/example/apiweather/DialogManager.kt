package com.example.apiweather

import android.app.AlertDialog
import android.content.Context
import android.widget.EditText

object DialogManager {
    fun Dialog(context: Context, listener: Listener){
        val builder = AlertDialog.Builder(context)
        val dialog = builder.create()
        dialog.setTitle("Местоположение выключено")
        dialog.setMessage("Включить определение местоположения?")
        dialog.setButton(AlertDialog.BUTTON_POSITIVE,"ОК"){_,_ ->
            listener.onClick(null)
            dialog.dismiss()
        }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE,"Нет"){_,_ ->
            dialog.dismiss()
        }
        dialog.show()
    }
    fun searchDialog(context: Context, listener: Listener){
        val builder = AlertDialog.Builder(context)
        val edName = EditText(context)
        builder.setView(edName)
        val dialog = builder.create()
        dialog.setTitle("Название города: ")
        dialog.setButton(AlertDialog.BUTTON_POSITIVE,"ОК"){_,_ ->
            listener.onClick(edName.text.toString())
            dialog.dismiss()
        }
        dialog.setButton(AlertDialog.BUTTON_NEGATIVE,"Нет"){_,_ ->
            dialog.dismiss()
        }
        dialog.show()
    }

    interface Listener{
        fun onClick(name: String?)
    }
}