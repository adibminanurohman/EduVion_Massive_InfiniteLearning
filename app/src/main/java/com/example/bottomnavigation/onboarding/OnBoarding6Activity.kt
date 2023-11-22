package com.example.bottomnavigation.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.ActivityOnBoarding2Binding
import com.example.bottomnavigation.databinding.ActivityOnBoarding6Binding

class OnBoarding6Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding6Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToOnBoarding5(view: View) {
        val intent = Intent(this, OnBoarding5Activity::class.java)
        startActivity(intent)
    }
    fun navigateToOnBoarding7(view: View) {
        val intent = Intent(this, OnBoarding7Activity::class.java)
        startActivity(intent)
    }
}