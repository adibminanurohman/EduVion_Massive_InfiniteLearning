package com.example.bottomnavigation.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.ActivityOnBoarding2Binding
import com.example.bottomnavigation.databinding.ActivityOnBoarding4Binding

class OnBoarding4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding4Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToOnBoarding5(view: View) {
        val intent = Intent(this, OnBoarding5Activity::class.java)
        startActivity(intent)
    }
    fun navigateToOnBoarding3(view: View) {
        val intent = Intent(this, OnBoarding3Activity::class.java)
        startActivity(intent)
    }
}