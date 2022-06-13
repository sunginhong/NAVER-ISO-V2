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
    ArrayList<String> titleArryList;
    Context ctx;
    int parentPosition;

    public Haptic_ParentRecyclerAdapter(ArrayList<String> arrayList, Context ctx) {
        this.titleArryList = arrayList;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.haptic_rows,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.ItemName.setText(titleArryList.get(position));

        if (position == 0){
            holder.section_summary.setText("Vibrator 옵션은 Android O(API 26) 미만의 버전에서 제공되는 옵션으로 duration을 지정해 주면 진동이 발생됩니다.");
        }
        if (position == 1){
            holder.section_summary.setText("VibrationEffect 옵션은 Android O(API 26) 이상 버전에서 제공되는 옵션으로 미리 정의되어 있는 값을 지정해 주면 진동이 발생됩니다.");
        }
        if (position == 2){
            holder.section_summary.setText("HapticFeedbackConstants 옵션은 Android O(API 30) 이상 버전에서 제공되는 옵션으로 미리 정의되어 있는 값을 지정해 주면 진동이 발생됩니다.");
        }
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ctx,LinearLayoutManager.VERTICAL,false);
        holder.hapticsRV.setLayoutManager(layoutManager);
        holder.hapticsRV.setHasFixedSize(true);
        holder.hapticsRV.setTag(titleArryList.get(position));
        RecyclerDecoration_Height decoration_height = new RecyclerDecoration_Height(30);
        holder.hapticsRV.addItemDecoration(decoration_height);
        ArrayList<String> subTitleArryList = new ArrayList<>();
        subTitleArryList.clear();

        if(titleArryList.get(position).equals("vibrator")){
            String[] titles = {"1","2", "3", "4", "5", "6", "7", "8", "9", "10"};
            for(int i = 0;i< titles.length;i++){
                subTitleArryList.add("vibrate Duration: " + titles[i] + "ms");
            }
        }

        if(titleArryList.get(position).equals("VibrationEffect")){
            String[] titles = {"EFFECT_CLICK", "EFFECT_DOUBLE_CLICK", "EFFECT_HEAVY_CLICK", "EFFECT_TICK"};
            for(int i = 0;i< titles.length;i++){
                subTitleArryList.add(titles[i]);
            }
        }

        if(titleArryList.get(position).equals("HapticFeedbackConstants")){
            String[] titles = {"CLOCK_TICK", "CONFIRM", "CONTEXT_CLICK","FLAG_IGNORE_VIEW_SETTING", "GESTURE_END", "GESTURE_START", "KEYBOARD_PRESS", "KEYBOARD_TAP","LONG_PRESS", "REJECT", "TEXT_HANDLE_MOVE"};
            for(int i = 0;i< titles.length;i++){
                subTitleArryList.add(titles[i]);
            }
        }

        Haptic_ChildRecyclerAdapter childRecyclerAdapter = new Haptic_ChildRecyclerAdapter(subTitleArryList, titleArryList, holder.hapticsRV);
        holder.hapticsRV.setAdapter(childRecyclerAdapter);
        childRecyclerAdapter.notifyDataSetChanged();


    }

    @Override
    public int getItemCount() {
        return titleArryList.size();
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