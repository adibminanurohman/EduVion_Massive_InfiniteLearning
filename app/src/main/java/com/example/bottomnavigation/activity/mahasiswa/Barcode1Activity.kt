package com.example.bottomnavigation.activity.mahasiswa

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.ActivityBarcode1Binding

class Barcode1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityBarcode1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarcode1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToBarcode2(view: View) {
        val intent = Intent(this, Barcode2Activity::class.java)
        startActivity(intent)
    }
}