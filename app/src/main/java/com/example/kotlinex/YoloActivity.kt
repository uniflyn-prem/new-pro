package com.example.kotlinex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinex.Adapter.AdapterGame
import com.example.kotlinex.Adapter.MyAdapter
import com.example.kotlinex.Connstraint.CustomAdapter
import com.example.kotlinex.Connstraint.Games

class YoloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yolo)
        supportActionBar?.hide()
        main()
    }
    fun main(){
        val recyclerview = findViewById<RecyclerView>(R.id.recyc)
        val layoutManager = LinearLayoutManager(this@YoloActivity,
            LinearLayoutManager.HORIZONTAL,false)
        recyclerview.layoutManager = layoutManager

        val data =  ArrayList<Games>()
        data.add(Games(R.drawable.rectangleeee))
        data.add(Games(R.drawable.jetx))
        data.add(Games(R.drawable.capadacha))
        data.add(Games(R.drawable.rectangleeee))
        data.add(Games(R.drawable.jetx))
        data.add(Games(R.drawable.capadacha))
        data.add(Games(R.drawable.rectangleeee))
        data.add(Games(R.drawable.jetx))
        data.add(Games(R.drawable.capadacha))
        data.add(Games(R.drawable.rectangleeee))
        val customAdapter = CustomAdapter(data,this@YoloActivity)
        recyclerview.adapter = customAdapter
        Game()

    }
    fun Game(){
        val recyclerview = findViewById<RecyclerView>(R.id.recycl)
        val layoutManager = LinearLayoutManager(this@YoloActivity,
            LinearLayoutManager.HORIZONTAL,false)
        recyclerview.layoutManager = layoutManager

        val data =  ArrayList<Games>()
        data.add(Games(R.drawable.anpark))
        data.add(Games(R.drawable.live_black))
        data.add(Games(R.drawable.blackk))
        data.add(Games(R.drawable.anpark))
        data.add(Games(R.drawable.live_black))
        data.add(Games(R.drawable.blackk))
        data.add(Games(R.drawable.anpark))
        data.add(Games(R.drawable.live_black))
        data.add(Games(R.drawable.blackk))
        val customAdapter = MyAdapter(data,this@YoloActivity)
        recyclerview.adapter = customAdapter
        Bingo()
    }
    fun Bingo(){
        val recyclerview = findViewById<RecyclerView>(R.id.recycle)
        val layoutManager = LinearLayoutManager(this@YoloActivity,
            LinearLayoutManager.HORIZONTAL,false)
        recyclerview.layoutManager = layoutManager

        val data =  ArrayList<Games>()
        data.add(Games(R.drawable.livee))
        data.add(Games(R.drawable.liv2))
        data.add(Games(R.drawable.liv3))
        data.add(Games(R.drawable.livee))
        data.add(Games(R.drawable.liv2))
        data.add(Games(R.drawable.liv3))
        data.add(Games(R.drawable.livee))
        data.add(Games(R.drawable.liv2))
        data.add(Games(R.drawable.liv3))
        val customAdapter = AdapterGame(data,this@YoloActivity)
        recyclerview.adapter = customAdapter
    }
}