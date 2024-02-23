package com.example.whosthatpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result1)

        val next_pokemon_button: Button = findViewById(R.id.next_pokemon_pikachu)
        next_pokemon_button.setOnClickListener {
            val intent = Intent(this@ResultActivity1, NextPokemone1::class.java)
            startActivity(intent)
        }
    }
}