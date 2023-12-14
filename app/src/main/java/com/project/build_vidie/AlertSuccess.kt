package com.project.build_vidie

import android.os.Bundle
import android.os.Handler
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.project.build_vidie.databinding.AlertSuccessBinding

class AlertSuccess : DialogFragment() {
    private lateinit var binding: AlertSuccessBinding
    private lateinit var v: View
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = AlertSuccessBinding.inflate(inflater, container, false)
        v = binding.root

        val window = dialog?.window
        val layoutParams = window?.attributes
        layoutParams?.gravity = Gravity.TOP

        Handler().postDelayed({
            dismiss()
        }, 2000)

        return v
    }
}