package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    int[]image;

    public MyAdapter(Context context, int[] image, String[] name, String[] phone) {
        this.context = context;
        this.image = image;
        this.name = name;
        this.phone = phone;
    }

    String[]name;
    String[]phone;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_design,parent, false);
        MyViewHolder viewHolder=new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(name[position]);
        holder.phone.setText(phone[position]);
        holder.imageView.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }
}
