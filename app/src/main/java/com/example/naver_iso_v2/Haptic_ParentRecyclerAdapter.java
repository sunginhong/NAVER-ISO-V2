package com.example.naver_iso_v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Haptic_ParentRecyclerAdapter extends RecyclerView.Adapter<Haptic_ParentRecyclerAdapter.MyViewHolder> {
    ArrayList<String> arrayList;
    Context context;


    public Haptic_ParentRecyclerAdapter(ArrayList<String> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.haptic_rows,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.ItemName.setText(arrayList.get(position));
        if (position == 0){
            holder.section_summary.setText("Selection 햅틱은 UI 요소의 값이 변경될때 사용합니다.");
        }
        if (position == 1){
            holder.section_summary.setText("Impact 햅틱은 UI의 물리적 충돌을 나타낼때 사용합니다.");
        }
        if (position == 2){
            holder.section_summary.setText("Notification 햅틱은 어떤 조치의 결과에 대한 피드백에 사용합니다.");
        }
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false);
        holder.hapticsRV.setLayoutManager(layoutManager);
        holder.hapticsRV.setHasFixedSize(true);
        RecyclerDecoration_Height decoration_height = new RecyclerDecoration_Height(30);
        holder.hapticsRV.addItemDecoration(decoration_height);
        ArrayList<String> daysArryList = new ArrayList<>();
        daysArryList.clear();

        if(arrayList.get(position).equals("Selection")){
            String[] days = {"Selection"};
            for(int i = 0;i< days.length;i++){
                daysArryList.add(days[i]);
            }
        }

        if(arrayList.get(position).equals("Impact")){
            String[] days = {"Light", "Medium", "Heavy", "Rigid", "Soft"};
            for(int i = 0;i< days.length;i++){
                daysArryList.add(days[i]);
            }
        }

        if(arrayList.get(position).equals("Notification")){
            String[] days = {"Success", "Warning", "Error"};
            for(int i = 0;i< days.length;i++){
                daysArryList.add(days[i]);
            }
        }

        Haptic_ChildRecyclerAdapter childRecyclerAdapter = new Haptic_ChildRecyclerAdapter(daysArryList);
        holder.hapticsRV.setAdapter(childRecyclerAdapter);
        childRecyclerAdapter.notifyDataSetChanged();


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView ItemName;
        TextView section_summary;
        RecyclerView hapticsRV;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ItemName = itemView.findViewById(R.id.section_header);
            section_summary = itemView.findViewById(R.id.section_summary);
            hapticsRV = itemView.findViewById(R.id.hapticsRV);

        }
    }
}