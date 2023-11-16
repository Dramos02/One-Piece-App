package com.example.one_pieceappwithfirebase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.one_pieceappwithfirebase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.floatAbtnId.setOnClickListener {
            val intentAddNewRecord = Intent(applicationContext, AddNewRecord::class.java)
            startActivity(intentAddNewRecord)
        }
    }
}