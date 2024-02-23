package com.example.whosthatpokemon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton

class NextPokemone1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_pokemone1)

        val next_pokemon_button: Button = findViewById(R.id.submit_button4)
        next_pokemon_button.setOnClickListener {
            val intent = Intent(this@NextPokemone1, NextPokemone2::class.java)
            startActivity(intent)
        }
    }
}
