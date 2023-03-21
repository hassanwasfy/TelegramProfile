package com.cheesecake.telegramprofile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cheesecake.telegramprofile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.notificationSwitch.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                binding.notificationTip.text = "On"
            }
            else{
                binding.notificationTip.text = "Off"
            }
        }
    }
}