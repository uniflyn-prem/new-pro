package com.example.kotlinex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.kotlinex.Connstraint.ContraintActivity
import com.example.kotlinex.LiveData.LiveDataActivity
import com.example.kotlinex.databinding.ActivityDragAndDropBinding

class DragAndDrop : AppCompatActivity() {
    private lateinit var binding:ActivityDragAndDropBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding= DataBindingUtil.setContentView(this,R.layout.activity_drag_and_drop)
        val user = User("Rohit","sharma","36")
        Log.e("userrrr", user.toString())
        binding.user=user
        val button = findViewById<Button>(R.id.button5)
        val button_done = findViewById<Button>(R.id.button6)
        button.setOnClickListener {
            val intent = Intent(this,LiveDataActivity::class.java)
            startActivity(intent)
        }
        button_done.setOnClickListener {
            val intent = Intent(this,ContraintActivity::class.java)
            startActivity(intent)
        }
    }
}