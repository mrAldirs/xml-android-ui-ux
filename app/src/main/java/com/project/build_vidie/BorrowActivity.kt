package com.project.build_vidie

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.build_vidie.databinding.ActivityBorrowBinding

class BorrowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBorrowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBorrowBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnPinjam.setOnClickListener {
            startActivity(Intent(this, ItemsActivity::class.java))
        }
    }
}