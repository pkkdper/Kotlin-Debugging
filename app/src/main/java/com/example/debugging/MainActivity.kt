package com.example.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlin.concurrent.thread

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
        var denominator = 5
        thread(start = true) {
        repeat(5) {
            Thread.sleep(3000)
            runOnUiThread {
            findViewById<TextView>(R.id.division).setText("${numerator / denominator}")
            denominator--
        }}
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