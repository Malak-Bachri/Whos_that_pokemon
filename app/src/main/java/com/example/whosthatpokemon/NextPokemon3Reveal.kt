package com.example.whosthatpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextPokemon3Reveal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_pokemon3_reveal)

        val next_pokemon_button: Button = findViewById(R.id.next_pokemon_pikachu)
        next_pokemon_button.setOnClickListener {
            val intent = Intent(this@NextPokemon3Reveal, NextPokemon4::class.java)
            startActivity(intent)
        }
    }
}