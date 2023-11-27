package com.example.bottomnavigation.activity.dosen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import com.example.bottomnavigation.activity.mahasiswa.Barcode1Activity
import com.example.bottomnavigation.activity.mahasiswa.LoadingScreenActivity

class Barcode2DosenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barcode2_dosen)
    }
    fun navigateToLoadingScreenDosen(view: View) {
        val intent = Intent(this, LoadingScreenDosenActivity::class.java)
        startActivity(intent)
    }

    fun navigateToBarcode1Dosen(view: View) {
        val intent = Intent(this, Barcode1DosenActivity::class.java)
        startActivity(intent)
    }
}