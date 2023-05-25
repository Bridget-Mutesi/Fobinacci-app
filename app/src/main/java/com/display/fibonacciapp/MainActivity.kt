package com.display.fibonacciapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.display.fibonacciapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }



    override fun onResume() {
        super.onResume()
        fibonacciNumbers()

    }


     fun fibonacciNumbers(): List<Int> {
        val fibonacciNumbers = mutableListOf<Int>()
         binding.rvFibonacciNumbers.layoutManager = LinearLayoutManager(this)

        var fibMinus2 = 0
        var fibMinus1 = 1

        fibonacciNumbers.add(fibMinus2)
        fibonacciNumbers.add(fibMinus1)

        for (i in 2 until 100) {
            val fib = fibMinus1 + fibMinus2
            fibonacciNumbers.add(fib)
            fibMinus2 = fibMinus1
            fibMinus1 = fib
        }

        return fibonacciNumbers
    }
}


