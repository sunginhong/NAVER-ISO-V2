package com.example.naver_iso_v2;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment_2_Alarm extends Fragment {

    public static View anim_object_alarm;

    public Fragment_2_Alarm() {
        init();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2_alarm, container, false);
        anim_object_alarm = view.findViewById(R.id.anim_object_alarm);
        AnimRectObject.function_containAnim(anim_object_alarm, Float.parseFloat(Vars_Def.inMotion_li1_state +"f"), Float.parseFloat(Vars_Def.inMotion_li2_state +"f"), Float.parseFloat(Vars_Def.inMotion_li3_state +"f"), 0, AnimRectObject.selEase_group1);
        return view;
    }

    private void init() {

    }

    public static void PlayAnim(String state){
        if (state == "Out"){
            AnimRectObject.function_group1_vibrate();
            AnimRectObject.function_containAnim(anim_object_alarm, Float.parseFloat(Vars_Def.inMotion_li1_state +"f"), Float.parseFloat(Vars_Def.inMotion_li2_state +"f"), Float.parseFloat(Vars_Def.inMotion_li3_state +"f"), 0, AnimRectObject.selEase_group1);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    AnimRectObject.function_containAnim(anim_object_alarm, Float.parseFloat(0+"f"), Float.parseFloat(1+"f"), Float.parseFloat(1+"f"), Vars_Def.inMotion_li0_state, AnimRectObject.selEase_group1);
                }
            }, 1);
        }
        if (state == "In"){
            AnimRectObject.function_group2_vibrate();
            AnimRectObject.function_containAnim(anim_object_alarm, Float.parseFloat(Vars_Def.outMotion_li1_state +"f"), Float.parseFloat(Vars_Def.outMotion_li2_state +"f"), Float.parseFloat(Vars_Def.outMotion_li3_state +"f"), Vars_Def.outMotion_li0_state, AnimRectObject.selEase_group2);
        }
    }


}