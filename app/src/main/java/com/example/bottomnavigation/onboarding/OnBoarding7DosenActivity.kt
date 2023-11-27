package com.example.bottomnavigation.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R

class OnBoarding7DosenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding7_dosen)
    }
    fun navigateToLoginDosen(view: View) {
        val intent = Intent(this, LoginDosenActivity::class.java)
        startActivity(intent)
    }
    fun navigateToOnBoarding6(view: View) {
        val intent = Intent(this, OnBoarding6Activity::class.java)
        startActivity(intent)
    }
}