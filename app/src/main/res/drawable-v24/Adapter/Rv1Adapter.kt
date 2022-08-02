package com.example.a561k.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.a561k.Models.Rv1AdapterItem
import com.example.a561k.Models.RvAdapterItem
import com.example.a561k.R

class Rv1Adapter(var context: Context, var items: ArrayList<Rv1AdapterItem>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv1, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val rv1AdapterItem = items[position]

        if (holder is ItemViewHolder){
            Glide.with(context).load(rv1AdapterItem.image).into(holder.image)
        }
    }

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view){
        var image: ImageView = view.findViewById(R.id.image1)
    }
}