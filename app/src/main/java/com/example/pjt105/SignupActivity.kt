package com.example.pjt105

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val loginText: TextView = findViewById(R.id.login_text)
        loginText.setOnClickListener() {
            val intent = Intent (this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}