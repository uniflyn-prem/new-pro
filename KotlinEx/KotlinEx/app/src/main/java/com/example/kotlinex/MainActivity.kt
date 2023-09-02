package com.example.kotlinex

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        main()
        RecycleMethod()
    }
    fun main(){
        val a=20
        val b= 10
        if (a>b){
            print("x is greater than y")
        }
        var day = 4
        val result = when(day){
            1->"monday"
            2->"tuesday"
            3->"wednesday"
            4->"thursday"
            5->"friday"
            6->"saturday"
            7->"sunday"
            else->"invalid days"
        }
        Log.e("ressssss",result)
        MyFunction("rohit")
        MyFunction("prem")
        MyFunction("sharma")
    }
    fun MyFunction(fname:String){
        print(fname + "sham")
    }
    fun RecycleMethod(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemsViewModel>()
       // var context: Context? = null
//        for (i in 1..20){
//        }
//
           data.add(ItemsViewModel(R.drawable.ic_launcher_background,"Kotlin","1"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_foreground,"java","2"))


        val customAdapter = CustomAdapter(data,this@MainActivity)
        recyclerView.adapter = customAdapter
        ListView()
    }
    fun ListView(){
        val button = findViewById<AppCompatButton>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this,ListActivity::class.java)
            startActivity(intent)
        }
    }
}