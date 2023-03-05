package com.example.taller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.LoginFilter
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1=findViewById<Button>(R.id.Login)
boton1.setOnClickListener {
    val lanzar = Intent(this,Mainhome::class.java)
    startActivity(lanzar)
}
        }
    }