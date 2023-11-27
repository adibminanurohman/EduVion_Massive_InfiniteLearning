package com.example.bottomnavigation.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import com.example.bottomnavigation.activity.dosen.Barcode1DosenActivity
import com.example.bottomnavigation.activity.dosen.LoadingScreenDosenActivity
import com.example.bottomnavigation.activity.mahasiswa.Barcode1Activity
import com.example.bottomnavigation.activity.mahasiswa.LoadingScreenActivity
import com.example.bottomnavigation.databinding.ActivityLoginBinding
import com.example.bottomnavigation.databinding.ActivityOnBoarding1Binding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToBarcode1Dosen(view: View) {
        val intent = Intent(this, Barcode1DosenActivity::class.java)
        startActivity(intent)
    }
    fun navigateLoginToLoadingScreenDosen(view: View) {
        val intent = Intent(this, LoadingScreenDosenActivity::class.java)
        startActivity(intent)
    }
}