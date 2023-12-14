package com.project.build_vidie

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.build_vidie.databinding.ActivityItemsBinding

class ItemsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityItemsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.btnProjector.setOnClickListener {
            startActivity(Intent(this, ProjectorActivity::class.java))
        }
        binding.btnCable.setOnClickListener {
            startActivity(Intent(this, CableActivity::class.java))
        }
    }
}