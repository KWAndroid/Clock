package com.example.clock.Alarm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.clock.R
import com.example.clock.databinding.FragmentAlarmAddBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class FragmentAlarmAdd : Fragment() {
    lateinit var binding: FragmentAlarmAddBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlarmAddBinding.inflate(inflater, container, false)
        hideBootomNavigation(true)

        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        hideBootomNavigation(false)
    }


    fun hideBootomNavigation(bool : Boolean){
        val bottomNavigation = activity?.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        if(bool){
            bottomNavigation?.visibility = View.GONE
        }
        else {
            bottomNavigation?.visibility = View.VISIBLE
        }
    }
}