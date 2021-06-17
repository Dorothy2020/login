package com.example.loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class SignupActivity : AppCompatActivity() {
    lateinit var btnPrevious:Button
    lateinit var spGender:Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        var btnPrevious=findViewById<Button>(R.id.btnPrevious)
        var spGender=findViewById<Spinner>(R.id.spGender)
        var gender= arrayOf("male","female")
        val adapter=ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_dropdown_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=adapter
        btnPrevious.setOnClickListener {
            var intent=Intent(
                baseContext,
                MainActivity::class.java
            )
            startActivity(intent)
        }
//        var gender= arrayOf("male","female")
//        val adapter=ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_dropdown_item)
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spGender.adapter=adapter






        }
    }
