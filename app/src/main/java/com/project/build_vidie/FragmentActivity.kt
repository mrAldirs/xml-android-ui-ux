package com.project.build_vidie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.build_vidie.databinding.FragmentActivityBinding

class FragmentActivity : Fragment() {
    private lateinit var binding: FragmentActivityBinding
    private lateinit var v: View
    private lateinit var adapter: AdapterActivity
    private var dataList: List<DataActivity> = mutableListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentActivityBinding.inflate(inflater, container, false)
        v = binding.root

        adapter = AdapterActivity(dataList)
        binding.rvActivity.layoutManager = LinearLayoutManager(v.context)
        val newDataList = mutableListOf<DataActivity>(
            DataActivity("Proyektor 1", "ID1", "PJ1", "Kelas A", "01/01/2023", "12:00 PM"),
            DataActivity("Proyektor 2", "ID2", "PJ2", "Kelas B", "02/01/2023", "01:00 PM"),
            DataActivity("Proyektor 3", "ID3", "PJ3", "Kelas C", "03/01/2023", "02:00 PM")
        )
        binding.rvActivity.adapter = adapter
        adapter.setData(newDataList)

        return v
    }
}