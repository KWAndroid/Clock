package com.example.clock.Alarm

import java.util.Date

data class AlarmItem (
    val time: String,
    val name : String,
    val ampm : String,
    val day: String,
    val repeat: Boolean,
    val repeatDay: ArrayList<String>,
    val checked: Boolean

)