package com.example.whosthatpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextPokemon3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_pokemon3)

        val next_pokemon_button: Button = findViewById(R.id.submit_button2)
        next_pokemon_button.setOnClickListener {
            val intent = Intent(this@NextPokemon3, NextPokemon3Reveal::class.java)
            startActivity(intent)
        }
    }
}