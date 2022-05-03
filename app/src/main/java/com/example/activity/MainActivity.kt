package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            Toast.makeText(this, "Connected", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }

        val btnRegister = findViewById<Button>(R.id.tzRegister)
        btnRegister.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        
    }
}