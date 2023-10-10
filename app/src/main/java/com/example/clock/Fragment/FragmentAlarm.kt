package com.example.clock.Fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.clock.Alarm.AlarmItem
import com.example.clock.Alarm.AlarmItemAdapter
import com.example.clock.R
import com.example.clock.databinding.FragmentAlarmBinding

class FragmentAlarm : Fragment() {

    lateinit var binding: FragmentAlarmBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAlarmBinding.inflate(inflater, container, false)

        binding.alarmAppbar.addOnOffsetChangedListener( { appBarLayout, verticalOffset ->
            val maxScroll = appBarLayout.totalScrollRange
            val percentage = Math.abs(verticalOffset).toFloat() / maxScroll.toFloat()

            // 텍스트뷰의 투명도를 설정합니다.
            binding.alarmText.alpha = percentage
        })

        //알람 아이템 리사이클러뷰
        val itemList = ArrayList<AlarmItem>()

        //임시
        itemList.add(AlarmItem("8:00","시스템소프트웨어","오전","",true,arrayListOf("월"),true))
        itemList.add(AlarmItem("9:00","","오전","",true,arrayListOf("화"),false))

        val alarmItemAdapter = AlarmItemAdapter(itemList)
        binding.alarmRecyclerview.adapter = alarmItemAdapter
        binding.alarmRecyclerview.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)


        //프래그먼트 이동
        binding.alarmBtnPlus.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentAlarm_to_fragmentAlarmAdd)
        }
        return binding.root

    }

}