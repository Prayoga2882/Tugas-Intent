package com.example.tugasteori

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.EditText

import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.Button

import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T




class MainActivity : AppCompatActivity() {


    var nim:EditText?= null
    var nama:EditText?= null
    var ipk :EditText?= null
    lateinit var txtgrade: TextView
    private lateinit var hitung: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nim = findViewById(R.id.NIM)
        nama = findViewById(R.id.Nama)
        ipk = findViewById (R.id.IPK)
        hitung = findViewById (R.id.tombolhitung)
        txtgrade = findViewById(R.id.Grade)

        val ipk = IPK.getText().toString().trim()

        val a = java.lang.Double.parseDouble(ipk)

        if (a >= 80) {
            txtgrade.setText("Grade A");
        } else if (a >= 70) {
            txtgrade.setText("Grade B");
        } else if (a >= 60) {
            txtgrade.setText("Grade C");
        } else if (a >= 45) {
            txtgrade.setText("Grade D");
        } else {
            txtgrade.setText("Grade E");
        }

    }

}
