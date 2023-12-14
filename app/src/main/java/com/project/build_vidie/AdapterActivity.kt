package com.project.build_vidie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class AdapterActivity(private var dataList: List<DataActivity>):
    RecyclerView.Adapter<AdapterActivity.HolderData>(){
    class HolderData (v : View) : RecyclerView.ViewHolder(v) {
        val name = v.findViewById<TextView>(R.id.item_name)
        val id = v.findViewById<TextView>(R.id.item_id)
        val pj = v.findViewById<TextView>(R.id.item_pj)
        val kelas = v.findViewById<TextView>(R.id.item_kelas)
        val tgl = v.findViewById<TextView>(R.id.item_tgl)
        val time = v.findViewById<TextView>(R.id.item_time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderData {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_activity, parent, false)
        return HolderData(v)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: HolderData, position: Int) {
        val data = dataList.get(position)
        holder.name.text = data.name
        holder.id.text = data.id
        holder.pj.text = data.pj
        holder.kelas.text = data.kelas
        holder.tgl.text = data.tgl
        holder.time.text = data.time
    }

    fun setData(newDataList: List<DataActivity>) {
        dataList = newDataList
        notifyDataSetChanged()
    }
}