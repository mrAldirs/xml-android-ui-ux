package com.project.build_vidie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.project.build_vidie.databinding.ContentMainBinding
import com.project.build_vidie.databinding.FragmentMainBinding

class FragmentMain : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var cBbinding: ContentMainBinding
    lateinit var v: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        cBbinding = binding.content
        v = binding.root

        cBbinding.btnPinjam.setOnClickListener {
            startActivity(Intent(activity, BorrowActivity::class.java))
        }

        return v
    }
}