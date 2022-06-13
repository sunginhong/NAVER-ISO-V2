package com.example.naver_iso_v2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Haptic_ChildRecyclerAdapter extends RecyclerView.Adapter<Haptic_ChildRecyclerAdapter.MyViewHolder> {

    ArrayList<String> arrayList;

    public Haptic_ChildRecyclerAdapter(ArrayList<String> arrayList) {

        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.haptic_row_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.row_title.setText(arrayList.get(position));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView row_title;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            row_title = itemView.findViewById(R.id.row_title);
        }
    }
}