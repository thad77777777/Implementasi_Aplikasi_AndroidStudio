package com.example.muhammadfarrelardan_32602100006

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.muhammadfarrelardan_32602100006.databinding.ActivityBottomNavigasiBinding

class BottomNavigasiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBottomNavigasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigasi)

        binding = ActivityBottomNavigasiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.profile -> replaceFragment(ProfileFragment())
                R.id.setting -> replaceFragment(SettingFragment())
                R.id.buku -> replaceFragment(BookFragment())
            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}