package com.project.build_vidie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.project.build_vidie.databinding.FragmentActivityBinding

class FragmentActivity : Fragment() {
    private lateinit var binding: FragmentActivityBinding
    private lateinit var v: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentActivityBinding.inflate(inflater, container, false)
        v = binding.root

        return v
    }
}