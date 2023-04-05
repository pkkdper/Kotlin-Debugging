package com.example.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        division()
    }

    fun division() {
        val numerator = 50
        var denominator = 0
        repeat(5) {
            Log.v(TAG, "${numerator / denominator--}")
        }
    }

    fun logging() {
        Log.v(TAG, "Verbose")
        Log.d(TAG, "Debug")
        Log.i(TAG, "Info")
        Log.w(TAG, "Warn")
        Log.e(TAG, "Error")
    }
}