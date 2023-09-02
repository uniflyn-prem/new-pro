package com.example.kotlinex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        main()
    }
    fun main(){
        val arrayAdapter : ArrayAdapter<*>
        val name = arrayOf(R.drawable.ic_launcher_background,"sachin","dhoni","virat","Rohit","sachin","dhoni","virat")
        val listView =  findViewById<ListView>(R.id.list_view)
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,name)
        listView.adapter = arrayAdapter
    }
}