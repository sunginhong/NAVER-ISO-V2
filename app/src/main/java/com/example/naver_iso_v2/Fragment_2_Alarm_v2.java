package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.naver_iso_v2.PhotoView.PhotoView_Custom;

public class Fragment_2_Alarm_v2 extends Fragment {
    public static Context ctx;
    public static PhotoView_Custom alarm_v2_imageView;

    public Fragment_2_Alarm_v2() {
        init();
    }

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2alarm_v2, container, false);
        ctx = container.getContext();
        alarm_v2_imageView = view.findViewById(R.id.alarm_v2_imageView);
        Element_Pannel_Layout.animView = alarm_v2_imageView;
        AnimRectObject.function_containAnim(alarm_v2_imageView, Float.parseFloat(Elem_Vars_Def.defCase2_IN_li1_def +"f"), Float.parseFloat(Elem_Vars_Def.defCase2_IN_li2_def +"f"), Float.parseFloat(Elem_Vars_Def.defCase2_IN_li3_def +"f"), 0, Elem_Vars_Def.defCase2_IN_li4_def);
        return view;
    }

    private void init() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Element_ResetState.defCaseState02(ctx);
            }
        }, 400);
    }
}