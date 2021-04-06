 package com.talib.matrix

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

 class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        click.setOnClickListener {
            val sharedPreferences: SharedPreferences? = activity?.getSharedPreferences("userData", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor? =  sharedPreferences?.edit()
            editor?.putBoolean("isLogged",true)
            editor?.apply()
            editor?.commit()
            it.findNavController().navigate(R.id.action_login_to_blankFragment2)
        }
    }
}