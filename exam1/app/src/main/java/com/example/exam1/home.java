package com.example.exam1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {
RecyclerView data;
List<String> title;
List<Integer> images;
Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        data=findViewById(R.id.datalist);
        title=new ArrayList<>();
        images=new ArrayList<>();
        title.add("Banaana");
        title.add("Kiwi");
        title.add("Apple");
        title.add("grapes");
        title.add("Orange");
        title.add("dragun");
        title.add("Gauva");
        images.add(R.drawable.ba);
        images.add(R.drawable.kivi);
        images.add(R.drawable.apple);
        images.add(R.drawable.grap);
        images.add(R.drawable.orange);
        images.add(R.drawable.dragun);
        images.add(R.drawable.guava);
        adapter=new Adapter(this,title,images);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        data.setLayoutManager(gridLayoutManager);
        data.setAdapter(adapter);
    }
}