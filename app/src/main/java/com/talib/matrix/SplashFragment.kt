package com.talib.matrix

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController


class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val r = Runnable {
            val sharedPreferences: SharedPreferences? = activity?.getSharedPreferences("userData", Context.MODE_PRIVATE)
            val isLogged = sharedPreferences?.getBoolean("isLogged",false)
            if (isLogged == true){
                view.findNavController().navigate(R.id.action_splash_to_blankFragment2)
            }else{
                view.findNavController().navigate(R.id.action_splah_to_login)
            }
        }
        Handler(Looper.getMainLooper()).postDelayed(r,3000)
    }

}