package com.example.kotlinex.LiveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinex.R

class LiveDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        main()
    }
        fun main() {
            val textView = findViewById<TextView>(R.id.textView)
            Log.e("resssss", "resssss")
            val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
            Log.e("lllll", "kkkkkk")
            viewModel.startCounter()
            Log.e("nnnnnnn", "nnnnnn")
            viewModel.Seconds().observe(this, Observer {
                Log.e("mmmmmm", "mmmmmm")
                textView.text = it.toString()
            })

            viewModel.Finish().observe(this, Observer {
                if (it) {
                    textView.text = "Finished"
                }
            })
        }
    }
