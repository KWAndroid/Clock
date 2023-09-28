package com.example.clock.custom

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.example.clock.databinding.CustomTimePickerBinding

class CustomTimePicker(
    context: Context,
    private val initHour: Int,
    private val initMinute: Int,
    private val initSecond: Int
) : Dialog(context) {

    private lateinit var binding: CustomTimePickerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CustomTimePickerBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        setTimePickerValue()

    }

    private fun setTimePickerValue() {
        binding.hourNumberPicker.value = initHour
        binding.minuteNumberPicker.value = initMinute
        binding.secondNumberPicker.value = initSecond

        binding.hourNumberPicker.minValue = 0
        binding.hourNumberPicker.maxValue = 99
        binding.minuteNumberPicker.minValue = 0
        binding.minuteNumberPicker.maxValue = 59
        binding.secondNumberPicker.minValue = 0
        binding.secondNumberPicker.maxValue = 59

    }

}