package com.example.naver_iso_v2;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment;

public class Main_Rcv_Vp_FragFirst extends Fragment {
    public static Context ctx;
    private int frag_num;
    private TextView data_t;
    static TextView elem_p1_item_lst_r0_c0;
    static TextView elem_p1_item_lst_r0_c1;
    static TextView elem_p1_item_lst_r1_c0;
    static TextView elem_p1_item_lst_r1_c1;
    static TextView elem_p1_item_lst_r1_c2;
    static TextView elem_p1_item_lst_r2_c0;
    static TextView elem_p1_item_lst_r2_c1;
    static TextView elem_p1_item_lst_r2_c2;
    static TextView elem_p1_item_lst_r3_c0;
    static TextView elem_p1_item_lst_r3_c1;
    static TextView elem_p1_item_lst_r3_c2;
    static TextView elem_p1_item_lst_r4_c0;
    static TextView elem_p1_item_lst_r4_c1;
    static View elem_p1_item_sel_0;
    static View elem_p1_item_sel_1;
    static View elem_p1_item_sel_2;
    static View elem_p1_item_sel_3;
    static View elem_p1_item_sel_4;

    public Main_Rcv_Vp_FragFirst() {
    }

    public static Main_Rcv_Vp_FragFirst newInstance(int num, Context context){
        Main_Rcv_Vp_FragFirst fragment = new Main_Rcv_Vp_FragFirst();
        Bundle args = new Bundle();
        args.putInt("num",num);
        fragment.setArguments(args);
        ctx = context;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        frag_num = getArguments().getInt("num",0);
    }

    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1p,container,false);
        elem_p1_item_lst_r0_c0 = view.findViewById(R.id.elem_p1_item_lst_r0_c0);
        elem_p1_item_lst_r0_c1 = view.findViewById(R.id.elem_p1_item_lst_r0_c1);
        elem_p1_item_lst_r0_c0.setId(0);
        elem_p1_item_lst_r0_c1.setId(1);
        elem_p1_item_lst_r0_c0.setOnClickListener(btn_elem_p1_row0Listener);
        elem_p1_item_lst_r0_c1.setOnClickListener(btn_elem_p1_row0Listener);
        elem_p1_item_sel_0 = view.findViewById(R.id.elem_p1_item_sel_0);

        elem_p1_item_lst_r1_c0 = view.findViewById(R.id.elem_p1_item_lst_r1_c0);
        elem_p1_item_lst_r1_c1 = view.findViewById(R.id.elem_p1_item_lst_r1_c1);
        elem_p1_item_lst_r1_c2 = view.findViewById(R.id.elem_p1_item_lst_r1_c2);
        elem_p1_item_lst_r1_c0.setId(0);
        elem_p1_item_lst_r1_c1.setId(1);
        elem_p1_item_lst_r1_c2.setId(2);
        elem_p1_item_lst_r1_c0.setOnClickListener(btn_elem_p1_row1Listener);
        elem_p1_item_lst_r1_c1.setOnClickListener(btn_elem_p1_row1Listener);
        elem_p1_item_lst_r1_c2.setOnClickListener(btn_elem_p1_row1Listener);
        elem_p1_item_sel_1 = view.findViewById(R.id.elem_p1_item_sel_1);

        elem_p1_item_lst_r2_c0 = view.findViewById(R.id.elem_p1_item_lst_r2_c0);
        elem_p1_item_lst_r2_c1 = view.findViewById(R.id.elem_p1_item_lst_r2_c1);
        elem_p1_item_lst_r2_c2 = view.findViewById(R.id.elem_p1_item_lst_r2_c2);
        elem_p1_item_lst_r2_c0.setId(0);
        elem_p1_item_lst_r2_c1.setId(1);
        elem_p1_item_lst_r2_c2.setId(2);
        elem_p1_item_lst_r2_c0.setOnClickListener(btn_elem_p1_row2Listener);
        elem_p1_item_lst_r2_c1.setOnClickListener(btn_elem_p1_row2Listener);
        elem_p1_item_lst_r2_c2.setOnClickListener(btn_elem_p1_row2Listener);
        elem_p1_item_sel_2 = view.findViewById(R.id.elem_p1_item_sel_2);

        elem_p1_item_lst_r3_c0 = view.findViewById(R.id.elem_p1_item_lst_r3_c0);
        elem_p1_item_lst_r3_c1 = view.findViewById(R.id.elem_p1_item_lst_r3_c1);
        elem_p1_item_lst_r3_c2 = view.findViewById(R.id.elem_p1_item_lst_r3_c2);
        elem_p1_item_lst_r3_c0.setId(0);
        elem_p1_item_lst_r3_c1.setId(1);
        elem_p1_item_lst_r3_c2.setId(2);
        elem_p1_item_lst_r3_c0.setOnClickListener(btn_elem_p1_row3Listener);
        elem_p1_item_lst_r3_c1.setOnClickListener(btn_elem_p1_row3Listener);
        elem_p1_item_lst_r3_c2.setOnClickListener(btn_elem_p1_row3Listener);
        elem_p1_item_sel_3 = view.findViewById(R.id.elem_p1_item_sel_3);

        elem_p1_item_lst_r4_c0 = view.findViewById(R.id.elem_p1_item_lst_r4_c0);
        elem_p1_item_lst_r4_c1 = view.findViewById(R.id.elem_p1_item_lst_r4_c1);
        elem_p1_item_lst_r4_c0.setId(0);
        elem_p1_item_lst_r4_c1.setId(1);
        elem_p1_item_lst_r4_c0.setOnClickListener(btn_elem_p1_row4Listener);
        elem_p1_item_lst_r4_c1.setOnClickListener(btn_elem_p1_row4Listener);
        elem_p1_item_sel_4 = view.findViewById(R.id.elem_p1_item_sel_4);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                elem_p1_item_lst_r0_c0.setTextColor(getResources().getColor(R.color.main_vp_text_selcolor, getResources().newTheme()));
                Utils_Anim.function_containAnim(elem_p1_item_sel_0, elem_p1_item_lst_r0_c0.getX()+Utils_Calc.dpToPx(2), 0, AnimRectObject.interpolator_easeOut);
                Utils_Anim.function_WidthAnim(elem_p1_item_sel_0, elem_p1_item_lst_r0_c0.getWidth(), 0, AnimRectObject.interpolator_easeOut);
                elem_p1_item_lst_r1_c0.setTextColor(getResources().getColor(R.color.main_vp_text_selcolor, getResources().newTheme()));
                Utils_Anim.function_containAnim(elem_p1_item_sel_1, elem_p1_item_lst_r1_c0.getX()+Utils_Calc.dpToPx(2), 0, AnimRectObject.interpolator_easeOut);
                Utils_Anim.function_WidthAnim(elem_p1_item_sel_1, elem_p1_item_lst_r1_c0.getWidth(), 0, AnimRectObject.interpolator_easeOut);
                elem_p1_item_lst_r2_c0.setTextColor(getResources().getColor(R.color.main_vp_text_selcolor, getResources().newTheme()));
                Utils_Anim.function_containAnim(elem_p1_item_sel_2, elem_p1_item_lst_r1_c0.getX()+Utils_Calc.dpToPx(2), 0, AnimRectObject.interpolator_easeOut);
                Utils_Anim.function_WidthAnim(elem_p1_item_sel_2, elem_p1_item_lst_r2_c0.getWidth(), 0, AnimRectObject.interpolator_easeOut);
                elem_p1_item_lst_r3_c0.setTextColor(getResources().getColor(R.color.main_vp_text_selcolor, getResources().newTheme()));
                Utils_Anim.function_containAnim(elem_p1_item_sel_3, elem_p1_item_lst_r3_c0.getX()+Utils_Calc.dpToPx(2), 0, AnimRectObject.interpolator_easeOut);
                Utils_Anim.function_WidthAnim(elem_p1_item_sel_3, elem_p1_item_lst_r3_c0.getWidth(), 0, AnimRectObject.interpolator_easeOut);
                elem_p1_item_lst_r4_c0.setTextColor(getResources().getColor(R.color.main_vp_text_selcolor, getResources().newTheme()));
                Utils_Anim.function_containAnim(elem_p1_item_sel_4, elem_p1_item_lst_r4_c0.getX()+Utils_Calc.dpToPx(2), 0, AnimRectObject.interpolator_easeOut);
                Utils_Anim.function_WidthAnim(elem_p1_item_sel_4, elem_p1_item_lst_r4_c0.getWidth(), 0, AnimRectObject.interpolator_easeOut);
            }
        }, 100);
        return view;
    }

    View.OnClickListener btn_elem_p1_row0Listener = new View.OnClickListener() {
        @SuppressLint("ResourceType")
        @Override
        public void onClick(View v) {
            Main_Rcv_Vp_FragFirst_SelAnim.set_r0(ctx, v, 300);
        }
    };

    View.OnClickListener btn_elem_p1_row1Listener = new View.OnClickListener() {
        @SuppressLint("ResourceType")
        @Override
        public void onClick(View v) {
            Main_Rcv_Vp_FragFirst_SelAnim.set_r1(ctx, v, 300);
        }
    };

    View.OnClickListener btn_elem_p1_row2Listener = new View.OnClickListener() {
        @SuppressLint("ResourceType")
        @Override
        public void onClick(View v) {
            Main_Rcv_Vp_FragFirst_SelAnim.set_r2(ctx, v, 300);
        }
    };

    View.OnClickListener btn_elem_p1_row3Listener = new View.OnClickListener() {
        @SuppressLint("ResourceType")
        @Override
        public void onClick(View v) {
            Main_Rcv_Vp_FragFirst_SelAnim.set_r3(ctx, v, 300);
        }
    };

    View.OnClickListener btn_elem_p1_row4Listener = new View.OnClickListener() {
        @SuppressLint("ResourceType")
        @Override
        public void onClick(View v) {
            Main_Rcv_Vp_FragFirst_SelAnim.set_r4(ctx, v, 300);
        }
    };

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstancdState){
        super.onViewCreated(view,savedInstancdState);
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}