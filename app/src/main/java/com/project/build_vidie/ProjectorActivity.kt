package com.project.build_vidie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.build_vidie.databinding.ActivityItemBinding

class ProjectorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityItemBinding
    private lateinit var adapter: AdapterProjector
    private var dataList: List<DataItem> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        adapter = AdapterProjector(dataList)
        binding.rvItems.layoutManager = LinearLayoutManager(this)
        val newDataList = mutableListOf<DataItem>(
            DataItem("Proyektor 1", "ID1", false),
            DataItem("Proyektor 2", "ID2", true),
            DataItem("Proyektor 3", "ID3", false)
        )
        binding.rvItems.adapter = adapter
        adapter.setData(newDataList)
    }
}