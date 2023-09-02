package com.example.kotlinex.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinex.Connstraint.Games
import com.example.kotlinex.R

class MyAdapter(private val list : List<Games>, val context : Context) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.live_casino,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val Games = list[position]
        holder.image.setImageResource(Games.image)
    }
    override fun getItemCount(): Int {
        return list.size
    }
    class MyViewHolder(ItemView : View) : RecyclerView.ViewHolder(ItemView) {
        val image : ImageView =  itemView.findViewById(R.id.image2)

    }

}