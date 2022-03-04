package com.ikayz.kotlin.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ikayz.kotlin.tiptime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}