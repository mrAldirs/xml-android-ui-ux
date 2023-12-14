package com.project.build_vidie

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.build_vidie.databinding.ActivityLoginBinding
import com.project.build_vidie.databinding.ContentLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var cBinding: ContentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityLoginBinding.inflate(layoutInflater)
        cBinding = binding.content
        setContentView(binding.root)
        supportActionBar?.hide()

        cBinding.btnLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        cBinding.btnRegister.setOnClickListener {
            startActivity(Intent(this, RegisActivity::class.java))
        }
    }
}