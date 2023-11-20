package com.eduvion_massive.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.core.content.ContextCompat.startActivity
import com.eduvion_massive.R

class OnBoarding1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)

        val btnSignup = findViewById<ImageButton>(R.id.btn_next)
        btnSignup.setOnClickListener(this)
        }
    }

private fun ImageButton.setOnClickListener(onBoarding1Activity: OnBoarding1Activity) {
    fun startActivity(intent: Intent) {

    }

    fun Intent(imageButton: ImageButton, java: Class<OnBoarding2Activity>): Intent {
        TODO("Not yet implemented")
    }

    fun onClick(v: View) {
        when (v.id) {
            R.id.btn_next -> {
                val intent = Intent(this, OnBoarding2Activity::class.java)
                startActivity(intent)
            }
        }
    }
}

