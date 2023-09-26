package com.example.clock.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.clock.databinding.FragmentAlarmBinding
import com.example.clock.databinding.FragmentTimerBinding

class FragmentTimer : Fragment() {

   private lateinit var binding: FragmentTimerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTimerBinding.inflate(inflater, container, false)

        return binding.root
    }

}