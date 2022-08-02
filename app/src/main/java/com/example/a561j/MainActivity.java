package com.example.a561j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a561j.Adapter.Rv1Adapter;
import com.example.a561j.Adapter.Rv2Adapter;
import com.example.a561j.Adapter.RvAdapter;
import com.example.a561j.Models.ItemRv;
import com.example.a561j.Models.ItemRv1;
import com.example.a561j.Models.ItemRv2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initViews1();
        initViews2();
    }

    void initViews(){
        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        refreshAdapter(getAllChats());
    }

    void refreshAdapter(ArrayList<ItemRv> chats){
        RvAdapter adapter = new RvAdapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    ArrayList<ItemRv> getAllChats() {
        ArrayList<ItemRv> chats = new ArrayList<>();

        chats.add(new ItemRv(R.drawable.birds, "Oculus"));
        chats.add(new ItemRv(R.drawable.gtr, "Sneakers"));
        chats.add(new ItemRv(R.drawable.street, "Boots"));
        chats.add(new ItemRv(R.drawable.mbw, "Shoes"));
        chats.add(new ItemRv(R.drawable.rut, "Boots"));
        chats.add(new ItemRv(R.drawable.mbw, "Shoes"));

        return chats;
    }

    void initViews2(){
        recyclerView = findViewById(R.id.rv2);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        refreshAdapter2(getAllChats2());
    }

    void refreshAdapter2(ArrayList<ItemRv2> chats){
        Rv2Adapter adapter = new Rv2Adapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    ArrayList<ItemRv2> getAllChats2() {
        ArrayList<ItemRv2> chats = new ArrayList<>();

        chats.add(new ItemRv2(R.drawable.birds));
        chats.add(new ItemRv2(R.drawable.gtr));
        chats.add(new ItemRv2(R.drawable.street));
        chats.add(new ItemRv2(R.drawable.mbw));

        return chats;
    }

    void initViews1(){
        recyclerView = findViewById(R.id.rv1);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        refreshAdapter1(getAllChats1());
    }

    void refreshAdapter1(ArrayList<ItemRv1> chats){
        Rv1Adapter adapter = new Rv1Adapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    ArrayList<ItemRv1> getAllChats1() {
        ArrayList<ItemRv1> chats = new ArrayList<>();

        chats.add(new ItemRv1(R.drawable.birds));
        chats.add(new ItemRv1(R.drawable.gtr));
        chats.add(new ItemRv1(R.drawable.street));
        chats.add(new ItemRv1(R.drawable.mbw));

        return chats;
    }
}