package com.project.build_vidie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.build_vidie.databinding.ActivityMainBinding
import com.project.build_vidie.databinding.ContentMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.menu_home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, FragmentMain()).commit()
                    true
                }
                R.id.menu_activity -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout, FragmentActivity()).commit()
                    true
                }
                else -> false
            }
        }

        binding.menuAccount.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frameLayout, FragmentAccount()).commit()
        }

        binding.bottomNavigationView.selectedItemId = R.id.menu_home
    }
}