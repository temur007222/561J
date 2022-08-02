package com.example.a561j.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.a561j.Models.ItemRv;
import com.example.a561j.Models.ItemRv4;
import com.example.a561j.R;

import java.util.ArrayList;

public class RvAdapter4 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<ItemRv4> items;

    public RvAdapter4(Context context, ArrayList<ItemRv4> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv4, parent, false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemRv4 itemRv = items.get(position);

        if (holder instanceof ItemViewHolder){

           TextView textView = ((ItemViewHolder) holder).textView;

            Glide.with(context).load(itemRv.image).into(((ItemViewHolder) holder).image);

            textView.setText(itemRv.text);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView textView;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image3);
            textView = itemView.findViewById(R.id.text3);
        }
    }
}
