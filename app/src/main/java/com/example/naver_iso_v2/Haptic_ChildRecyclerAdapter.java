package com.example.naver_iso_v2;

import static androidx.core.content.ContextCompat.getSystemService;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import android.util.Printer;
import android.view.HapticFeedbackConstants;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Haptic_ChildRecyclerAdapter extends RecyclerView.Adapter<Haptic_ChildRecyclerAdapter.MyViewHolder> {

    Context ctx;
    private RecyclerView recyclerView;
    ArrayList<String> subTitleArryList;
    ArrayList<String> titleArryList;
    public static LinearLayout row_titlell;

    public Haptic_ChildRecyclerAdapter(ArrayList<String> subTitleArryList, ArrayList<String> titleArryList, RecyclerView recyclerView) {
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
                        if ("vibrator".equals(tag)) {
                            switch (pos){
                                case 0:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                       Haptic_Vibrate.case0_rows0();
                                    }
                                    break;
                                case 1:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case0_rows1();
                                    }
                                    break;
                                case 2:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                       Haptic_Vibrate.case0_rows2();
                                    }
                                    break;
                                case 3:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case0_rows3();
                                    }
                                    break;
                                case 4:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case0_rows4();
                                    }
                                    break;
                                case 5:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                       Haptic_Vibrate.case0_rows5();
                                    }
                                    break;
                                case 6:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case0_rows6();
                                    }
                                    break;
                                case 7:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case0_rows7();
                                    }
                                    break;
                                case 8:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case0_rows8();
                                    }
                                    break;
                                case 9:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case0_rows9();
                                    }
                                    break;
                            }
                        } else if ("VibrationEffect".equals(tag)) {
                            switch (pos){
                                case 0:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case1_rows0();
                                    }
                                    break;
                                case 1:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case1_rows1();
                                    }
                                    break;
                                case 2:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case1_rows2();
                                    }
                                    break;
                                case 3:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case1_rows3();
                                    }
                                    break;
                            }
                        } else if ("HapticFeedbackConstants".equals(tag)) {
                            switch (pos){
                                case 0:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case2_rows0();
                                    }
                                    break;
                                case 1:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case2_rows1();
                                    }
                                    break;
                                case 2:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case2_rows2();
                                    }
                                    break;
                                case 3:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case2_rows3();
                                    }
                                    break;
                                case 4:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case2_rows4();
                                    }
                                    break;
                                case 5:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case2_rows5();
                                    }
                                    break;
                                case 6:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case2_rows6();
                                    }
                                    break;
                                case 7:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case2_rows7();
                                    }
                                    break;
                                case 8:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case2_rows8();
                                    }
                                    break;
                                case 9:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case2_rows9();
                                    }
                                    break;
                                case 10:
                                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                                        Haptic_Vibrate.case2_rows10();
                                    }
                                    break;
                            }
                        }
                    }
                }
            });

            row_codell.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getAdapterPosition() ;
                    Log.d("ssss", ""+pos);
                }
            });
        }
    }
}