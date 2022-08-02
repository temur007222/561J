package com.example.a561j.Adapter;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.a561j.Models.ItemRv;
import com.example.a561j.Models.ItemRv3;
import com.example.a561j.R;

import java.util.ArrayList;

public class RvAdapter3 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<ItemRv3> items;

    public RvAdapter3(Context context, ArrayList<ItemRv3> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv3, parent, false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemRv3 itemRv = items.get(position);

        if (holder instanceof ItemViewHolder){

           TextView title = ((ItemViewHolder) holder).title;
            TextView price = ((ItemViewHolder) holder).price;
            TextView price1 = ((ItemViewHolder) holder).price1;
            TextView discount = ((ItemViewHolder) holder).discount;

            Glide.with(context).load(itemRv.image).into(((ItemViewHolder) holder).image);
            discount.setPaintFlags(discount.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

            title.setText(itemRv.title);
            price.setText(itemRv.price);
            price1.setText(itemRv.price1);
            discount.setText(itemRv.discount);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title, price, price1, discount;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image2);
            title = itemView.findViewById(R.id.title);
            price = itemView.findViewById(R.id.price);
            price1 = itemView.findViewById(R.id.price1);
            discount = itemView.findViewById(R.id.discount);
        }
    }
}