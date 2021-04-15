package com.talib.matrix

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment

class CustomDialog: DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val layoutInflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.my_custom_layout,container,false)

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            dismiss()
        }
        return view
    }
}