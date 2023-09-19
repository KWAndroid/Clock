package com.example.clock.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.clock.databinding.FragmentAlarmBinding
import com.example.clock.databinding.FragmentStopwatchBinding

class FragmentStopwatch : Fragment() {

    lateinit var binding: FragmentStopwatchBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStopwatchBinding.inflate(inflater, container, false)


        return binding.root
    }

}