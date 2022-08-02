package com.example.a561k.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a561k.Models.RvAdapterItem
import com.example.a561k.R

class RvAdapter(var context: Context, var items: ArrayList<RvAdapterItem>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val rvAdapterItem = items[position]

        if (holder is ItemViewHolder){
            Glide.with(context).load(rvAdapterItem.image).into(holder.image)
            holder.text.text = rvAdapterItem.text
        }
    }

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        var text: TextView = view.findViewById(R.id.text)
        var image: ImageView = view.findViewById(R.id.image)
    }

}