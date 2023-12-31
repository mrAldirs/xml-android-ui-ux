package com.project.build_vidie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.build_vidie.databinding.ActivityFormBinding

class FormActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFormBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.inpName.text = intent.getStringExtra("name")
        binding.inpId.text = intent.getStringExtra("id")

        binding.btnSubmit.setOnClickListener {
            AlertSuccess().show(supportFragmentManager, "AlertSuccess")
        }
    }
}