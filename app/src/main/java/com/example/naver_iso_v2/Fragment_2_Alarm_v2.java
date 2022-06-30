package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Bundle;
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
        ResetState.defCaseState02();
        AnimRectObject.function_containAnim(alarm_v2_imageView, Float.parseFloat(Vars_Def.inMotion_li1_state +"f"), Float.parseFloat(Vars_Def.inMotion_li2_state +"f"), Float.parseFloat(Vars_Def.inMotion_li3_state +"f"), 0, AnimRectObject.selEase_group1);
        return view;
    }

    private void init() {

    }

}