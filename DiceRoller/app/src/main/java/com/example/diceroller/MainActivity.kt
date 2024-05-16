package com.example.diceroller

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        binding.btnRoll.setOnClickListener {
            // 랜덤 넘버를 만듦
            var rollResult: Int = (1..6).random()
            binding.diceResult.setText(Integer.toString(rollResult))

            when(rollResult) {
                1 -> binding.diceImage.setImageResource(R.drawable.dice1)
                2 -> binding.diceImage.setImageResource(R.drawable.dice2)
                3 -> binding.diceImage.setImageResource(R.drawable.dice3)
                4 -> binding.diceImage.setImageResource(R.drawable.dice4)
                5 -> binding.diceImage.setImageResource(R.drawable.dice5)
                6 -> binding.diceImage.setImageResource(R.drawable.dice6)

            }

        }

    }
}