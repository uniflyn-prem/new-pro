package com.example.kotlinex

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mList: List<ItemsViewModel>,val context :Context) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = mList[position]
        val id = mList.get(position).id
        Log.e("idddd",id)
        holder.imageview.setImageResource(ItemsViewModel.image)
        holder.textView.setText(ItemsViewModel.text)
holder.itemView.setOnClickListener {
    if (id.equals("1")){
        val intent = Intent(context,ListActivity::class.java)
        context!!.startActivity(intent)
    }
    else if (id.equals("2")){
        val intent = Intent(context,DragAndDrop::class.java)
        context!!.startActivity(intent)
    }

}

    }

    override fun getItemCount(): Int {
return mList.size
    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageview: ImageView = itemView.findViewById(R.id.imageview)
        val textView:TextView = itemView.findViewById(R.id.textview)
    }
}