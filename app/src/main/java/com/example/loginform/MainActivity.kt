package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext=findViewById(R.id.btnNext)

        btnNext.setOnClickListener {

            val intent= Intent(baseContext,SignupActivity::class.java)
            startActivity(intent)
        }



    }
}

