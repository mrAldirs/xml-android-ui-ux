package com.project.build_vidie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton

class AdapterProjector (private var dataList: List<DataItem>):
    RecyclerView.Adapter<AdapterProjector.HolderData>() {
    class HolderData(v: View) : RecyclerView.ViewHolder(v) {
        val name = v.findViewById<TextView>(R.id.item_name)
        val id = v.findViewById<TextView>(R.id.item_id)
        val pinjam = v.findViewById<MaterialButton>(R.id.item_pinjam)
        val dipinjam = v.findViewById<MaterialButton>(R.id.item_dipinjam)
        val image = v.findViewById<ImageView>(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderData {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_items, parent, false)
        return HolderData(v)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: HolderData, position: Int) {
        val data = dataList.get(position)
        holder.name.text = data.name
        holder.id.text = data.id
        holder.image.setBackgroundResource(R.drawable.ic_projector)

        if (data.status) {
            holder.pinjam.visibility = View.GONE
            holder.dipinjam.visibility = View.VISIBLE
        } else {
            holder.pinjam.visibility = View.VISIBLE
            holder.dipinjam.visibility = View.GONE
        }

        holder.pinjam.setOnClickListener {
        }

        holder.dipinjam.setOnClickListener {
            AlertDialog.Builder(holder.itemView.context).apply {
                setTitle("Warning")
                setMessage("Projector ${data.name} has been borrowed!")
                setPositiveButton("Ya") { _, _ -> null }
            }.show()
        }
    }

    fun setData(newDataList: List<DataItem>) {
        dataList = newDataList
        notifyDataSetChanged()
    }
}