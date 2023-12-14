package com.project.build_vidie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.project.build_vidie.databinding.FragmentAccountBinding

class FragmentAccount : Fragment() {
    private lateinit var binding: FragmentAccountBinding
    private lateinit var v: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAccountBinding.inflate(inflater, container, false)
        v = binding.root

        return v
    }
}