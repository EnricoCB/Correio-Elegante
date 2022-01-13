package com.example.correioelegante

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.correioelegante.databinding.FragmentRegisterMessageBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class RegisterMessageFragment : Fragment() {
    private lateinit var binding : FragmentRegisterMessageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_register_message, container, false)
        binding.button2.setOnClickListener{
            findNavController().navigate(RegisterMessageFragmentDirections.actionRegisterMessageFragmentToConfirmationFragment())
        }
        return binding.root
    }


}