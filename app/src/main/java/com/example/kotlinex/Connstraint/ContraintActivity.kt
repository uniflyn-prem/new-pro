package com.example.kotlinex.Connstraint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinex.R

class ContraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contraint)
        supportActionBar?.hide()
         main()
    }
    fun main(){
        val recyclerview = findViewById<RecyclerView>(R.id.recycler_view)
        val layoutManager = LinearLayoutManager(this@ContraintActivity,LinearLayoutManager.HORIZONTAL,false)
        recyclerview.layoutManager = layoutManager

        val data =  ArrayList<Games>()
        data.add(Games(R.drawable.coss))
        data.add(Games(R.drawable.card2))
        data.add(Games(R.drawable.card3))
        data.add(Games(R.drawable.coss))
        val customAdapter = CustomAdapter(data,this@ContraintActivity)
        recyclerview.adapter = customAdapter

    }
}