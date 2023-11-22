package com.example.bottomnavigation.activity.mahasiswa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.ActivityBarcode1Binding
import com.example.bottomnavigation.databinding.ActivityBarcode2Binding

class Barcode2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityBarcode2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarcode2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToLoadingScreen(view: View) {
        val intent = Intent(this, LoadingScreenActivity::class.java)
        startActivity(intent)
    }

    fun navigateToBarcode1(view: View) {
        val intent = Intent(this, Barcode1Activity::class.java)
        startActivity(intent)
    }
}