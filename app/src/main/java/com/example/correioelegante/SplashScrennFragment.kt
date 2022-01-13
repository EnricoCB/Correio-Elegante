package com.example.correioelegante

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import java.lang.Exception


class SplashScrennFragment : Fragment() {
    lateinit var handler : Handler
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        handler = Handler()
        handler.postDelayed({
            findNavController().navigate(
                SplashScrennFragmentDirections.actionSplashScrennFragmentToHomeFragment())
        }, 3000)

        return inflater.inflate(R.layout.fragment_splash_screnn, container, false)
    }
}
