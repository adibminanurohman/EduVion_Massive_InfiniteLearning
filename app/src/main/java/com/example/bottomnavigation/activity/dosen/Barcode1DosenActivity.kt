package com.example.bottomnavigation.activity.dosen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.bottomnavigation.R
import com.example.bottomnavigation.activity.mahasiswa.Barcode2Activity

class Barcode1DosenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barcode1_dosen)
    }
    fun navigateToBarcode2Dosen(view: View) {
        val intent = Intent(this, Barcode2DosenActivity::class.java)
        startActivity(intent)
    }
}