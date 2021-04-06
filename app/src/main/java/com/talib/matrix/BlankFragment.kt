package com.talib.matrix

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_blank.*

class BlankFragment : Fragment(R.layout.fragment_blank) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("dasdasdas", activity.toString())

        val user = User("Talib","Ismayilzade",20)

        view.findViewById<Button>(R.id.button).setOnClickListener { buttonView ->
            val directions = BlankFragmentDirections.actionBlankFragmentToBlankFragment2("mail@gmail.com",user)
            buttonView.findNavController().navigate(directions)
        }
    }

}