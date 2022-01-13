package com.example.correioelegante

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.view.animation.RotateAnimation
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.correioelegante.databinding.FragmentConfirmationBinding


class ConfirmationFragment : Fragment() {
    private lateinit var text : TextView
    private lateinit var binding : FragmentConfirmationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_confirmation, container, false)
        text = binding.textView7
        return binding.root
    }

}