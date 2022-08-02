package com.example.a561j.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.a561j.Models.ItemRv1;
import com.example.a561j.Models.ItemRv2;
import com.example.a561j.R;

import java.util.ArrayList;

public class Rv2Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<ItemRv2> items;

    public Rv2Adapter(Context context, ArrayList<ItemRv2> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv2, parent, false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemRv2 itemRv2 = items.get(position);

        if (holder instanceof ItemViewHolder){

            Glide.with(context).load(itemRv2.image).into(((ItemViewHolder) holder).image);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{

        ImageView image;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image1);
        }
    }
}
