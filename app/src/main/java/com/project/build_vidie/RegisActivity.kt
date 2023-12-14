package com.project.build_vidie

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.build_vidie.databinding.ActivityRegisBinding
import com.project.build_vidie.databinding.ContentRegisBinding

class RegisActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisBinding
    private lateinit var cBinding: ContentRegisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisBinding.inflate(layoutInflater)
        cBinding = binding.content
        setContentView(binding.root)
        supportActionBar?.hide()

        cBinding.btnRegister.setOnClickListener {  }
        cBinding.btnLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}