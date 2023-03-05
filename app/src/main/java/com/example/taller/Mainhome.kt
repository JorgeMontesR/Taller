package com.example.taller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mainhome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val boton2=findViewById<Button>(R.id.button2)
        boton2.setOnClickListener {
            val lanzar = Intent(this,Mainhome::class.java)
            startActivity(lanzar)
        }

    }
}