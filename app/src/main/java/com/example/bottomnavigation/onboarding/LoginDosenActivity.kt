package com.example.bottomnavigation.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import com.example.bottomnavigation.activity.dosen.Barcode1DosenActivity
import com.example.bottomnavigation.activity.mahasiswa.Barcode1Activity
import com.example.bottomnavigation.activity.mahasiswa.LoadingScreenActivity

class LoginDosenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_dosen)
    }
    fun navigateToBarcode1Dosen(view: View) {
        val intent = Intent(this, Barcode1DosenActivity::class.java)
        startActivity(intent)
    }
    fun navigateLoginToLoadingScreenDosen(view: View) {
        val intent = Intent(this, LoadingScreenActivity::class.java)
        startActivity(intent)
    }
}