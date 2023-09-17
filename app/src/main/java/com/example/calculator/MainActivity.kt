package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.resultButton.setOnClickListener {
            var firstNumber = binding.firstNumberEditText
            var secondNumber = binding.secondNumberEditText

            if(firstNumber.text.toString() == ""){
                firstNumber.error = "No Input!"
            }

            if(secondNumber.text.toString() == ""){
                secondNumber.error = "No Input!"
                return@setOnClickListener
            }

            var result = firstNumber.text.toString().toDouble() + secondNumber.text.toString().toDouble()
            binding.resultView.text = result.toString()
        }
    }
}