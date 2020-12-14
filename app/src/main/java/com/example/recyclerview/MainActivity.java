package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter adapter;
    String[]name={"Elora","Meem","Nafim","Niloy","Rafi","Maya","Misti"};
    String[]phone={"01908857338","01987765263","01875675432","01975675432","01375675451","01673673435","01775674221"};
    int[]image={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerviewid);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter=new MyAdapter(this,image,name,phone);
        recyclerView.setAdapter(adapter);

    }
}