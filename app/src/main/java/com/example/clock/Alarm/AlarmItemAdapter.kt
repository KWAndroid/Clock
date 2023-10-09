package com.example.clock.Alarm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.clock.R

class AlarmItemAdapter(val itemList: ArrayList<AlarmItem>) :
    RecyclerView.Adapter<AlarmItemAdapter.BoardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.alarm_item, parent, false)
        return BoardViewHolder(view)
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.tv_time.text = itemList[position].time
        holder.tv_name.text = itemList[position].name
        if(itemList[position].name=="")
            holder.tv_name.visibility = View.GONE
        holder.tv_ampm.text = itemList[position].ampm
        holder.tv_switch.isChecked = itemList[position].checked
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }


    inner class BoardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_time = itemView.findViewById<TextView>(R.id.item_time)
        val tv_name = itemView.findViewById<TextView>(R.id.item_name)
        val tv_ampm = itemView.findViewById<TextView>(R.id.item_ampm)
        val tv_switch = itemView.findViewById<Switch>(R.id.item_switch)
        //val tv_repeat_day = itemView.findViewById<TextView>(R.id.item_repeat_day)
    }
}
