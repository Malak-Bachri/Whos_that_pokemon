package com.example.whosthatpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextPokemone2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_pokemon2)

        val next_pokemon_button: Button = findViewById(R.id.next_pokemon_pikachu)
        next_pokemon_button.setOnClickListener {
            val intent = Intent(this@NextPokemone2, NextPokemon3::class.java)
            startActivity(intent)
        }
    }
}