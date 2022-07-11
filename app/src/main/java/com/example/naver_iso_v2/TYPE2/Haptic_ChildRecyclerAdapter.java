package com.example.naver_iso_v2.TYPE2;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.naver_iso_v2.AnimRectObject;
import com.example.naver_iso_v2.HapticFunction;
import com.example.naver_iso_v2.R;
import com.example.naver_iso_v2.Utils_Anim;

import java.util.ArrayList;

public class Haptic_ChildRecyclerAdapter extends RecyclerView.Adapter<Haptic_ChildRecyclerAdapter.MyViewHolder> {

    Context ctx;
    private RecyclerView recyclerView;
    ArrayList<String> subTitleArryList;
    ArrayList<String> titleArryList;
    public static LinearLayout row_titlell;
    private String Data;

    public Haptic_ChildRecyclerAdapter(Context ctx, ArrayList<String> subTitleArryList, ArrayList<String> titleArryList, RecyclerView recyclerView) {
        this.ctx = ctx;
        this.recyclerView = recyclerView;
        this.subTitleArryList = subTitleArryList;
        this.titleArryList = titleArryList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.haptic_row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.row_title.setText(subTitleArryList.get(position));
    }

    @Override
    public int getItemCount() {
        return subTitleArryList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        LinearLayout haptic_row_dimmed;
        TextView row_title;
        LinearLayout row_codell;
        View row_code;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            haptic_row_dimmed = itemView.findViewById(R.id.haptic_row_dimmed);
            Utils_Anim.AlphaAnim(haptic_row_dimmed, 0, 0, 0);
            row_titlell = itemView.findViewById(R.id.row_titlell);
            row_title = itemView.findViewById(R.id.row_title);
            row_codell = itemView.findViewById(R.id.row_codell);
            row_code = itemView.findViewById(R.id.row_code);

            row_titlell.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition() ;

                    if (pos != RecyclerView.NO_POSITION) {
                        Object tag = recyclerView.getTag();
                        float SCALE_MIN = 0.97f;
                        float ALPHA_MIN = 0.1f;
                        Utils_Anim.SclaeAnimCusEase(itemView, 1, SCALE_MIN, 1, SCALE_MIN, 0.5f, 0.5f, 150, AnimRectObject.interpolator_easeInOut);
                        Utils_Anim.AlphaAnimCusEase(haptic_row_dimmed, 0, ALPHA_MIN, 150, AnimRectObject.interpolator_easeInOut);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                Utils_Anim.SclaeAnimCusEase(itemView, SCALE_MIN, 1, SCALE_MIN, 1, 0.5f, 0.5f, 300, AnimRectObject.interpolator_easeOut);
                                Utils_Anim.AlphaAnimCusEase(haptic_row_dimmed, ALPHA_MIN, 0, 300, AnimRectObject.interpolator_easeOut);
                            }
                        }, 200);
                        HapticFunction.VibeSet(tag, pos);
                    }
                }
            });

            row_codell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition();
                    ArrayList<String> ArrData = new ArrayList<>();
                    ArrData.add((String) recyclerView.getTag());
                    ArrData.add((String) row_title.getText());

                    Object tag = recyclerView.getTag();
                    HapticFunction.VibeSet(tag, pos);

                    Intent intent = new Intent(ctx, Haptic_PopupActivity.class);
//                    intent.putExtra("String",Data);
                    intent.putStringArrayListExtra("ArrayList", ArrData);

                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}