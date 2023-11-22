package com.example.bottomnavigation.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.ActivityOnBoarding2Binding
import com.example.bottomnavigation.databinding.ActivityOnBoarding7Binding

class OnBoarding7Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding7Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding7Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToLogin(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
    fun navigateToOnBoarding6(view: View) {
        val intent = Intent(this, OnBoarding6Activity::class.java)
        startActivity(intent)
    }
}