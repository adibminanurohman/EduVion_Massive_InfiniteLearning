package com.eduvion_massive.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.bottomnavigation.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            // Arahkan ke activity utama setelah delay selesai
            val intent = Intent(this@SplashScreen, OnBoarding1Activity::class.java)
            startActivity(intent)
            finish()
        }, 2000) // Delay dalam milidetik (misalnya, 3000ms atau 3 detik)
    }
}
