package com.example.whosthatpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextPokemon4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_pokemon4)

        val next_pokemon_button: Button = findViewById(R.id.submit_button3)
        next_pokemon_button.setOnClickListener {
            val intent = Intent(this@NextPokemon4, NextPokemon4Reveal::class.java)
            startActivity(intent)
        }
    }
}