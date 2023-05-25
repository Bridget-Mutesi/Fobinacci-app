package com.display.fibonacciapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class fibonacci_recycler_view_adaptor(var fibonacc: List<String>): RecyclerView.Adapter<NamesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fibonacci_layout,parent,false)
        return NamesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val currentName = fibonacc.get(position)
        holder.tvitemNumber.text = currentName


    }

    override fun getItemCount(): Int {
        return fibonacc.size
    }
}
class NamesViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvitemNumber = itemView.findViewById<TextView>(R.id.tvitemnumber)
}
