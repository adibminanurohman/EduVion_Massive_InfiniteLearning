package com.example.bottomnavigation.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import com.example.bottomnavigation.activity.mahasiswa.Barcode1Activity
import com.example.bottomnavigation.databinding.ActivityLoginBinding
import com.example.bottomnavigation.databinding.ActivityOnBoarding1Binding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToBarcode1(view: View) {
        val intent = Intent(this, Barcode1Activity::class.java)
        startActivity(intent)
    }
}