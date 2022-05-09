package com.example.naver_iso_v2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.animation.Interpolator;

import androidx.core.view.animation.PathInterpolatorCompat;

public class AnimRectObject {
    Context mContext;
    public static View view_item0;
    public static View view_item1;
    public static View view_item2;
    public static Interpolator interpolator_easeInOut = PathInterpolatorCompat.create(0.65f, 0f, 0.35f, 1f);
    public static Interpolator interpolator_easeOut = PathInterpolatorCompat.create(0.33f, 1f, 0.68f, 1f);
    public static Interpolator interpolator_easeIn = PathInterpolatorCompat.create(0.32f, 0f, 0.67f, 0f);
    public static Interpolator interpolator_bounce = PathInterpolatorCompat.create(0.34f, 1.56f, 0.64f, 1f);
    public static Interpolator selEase_group1;
    public static Interpolator selEase_group2;

    public AnimRectObject(View view0, View view1, View view2){
        view_item0 = view0;
        view_item1 = view1;
        view_item2 = view2;
        selEase_group1 = interpolator_easeOut;
        selEase_group2 = interpolator_easeOut;
        function_containAnim(view_item0, Float.parseFloat(0+"f"), Float.parseFloat(Vars_Def.group1_li2_state+"f"), Float.parseFloat(Vars_Def.group1_li3_state+"f"), 0, selEase_group1);
    }

    public static void function_CasePopupAnim(){
        if (Vars_Def.playMotionState == "Out"){
            function_containAnim(view_item0, Float.parseFloat(Vars_Def.group1_li1_state+"f"), Float.parseFloat(Vars_Def.group1_li2_state+"f"), Float.parseFloat(Vars_Def.group1_li3_state+"f"), 0, selEase_group1);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    function_containAnim(view_item0, Float.parseFloat(0+"f"), Float.parseFloat(1+"f"), Float.parseFloat(1+"f"), Vars_Def.group1_li0_state, selEase_group1);
                }
            }, 1);
        }
        if (Vars_Def.playMotionState == "In"){
            function_containAnim(view_item0, Float.parseFloat(Vars_Def.group2_li1_state+"f"), Float.parseFloat(Vars_Def.group2_li2_state+"f"), Float.parseFloat(Vars_Def.group2_li3_state+"f"), Vars_Def.group2_li0_state, selEase_group2);
        }
    }


    public static void function_CaseNudgeAnim(){
        if (Vars_Def.playMotionState == "Out"){
            function_containAnim(view_item1, Float.parseFloat(Vars_Def.group1_li1_state+"f"), Float.parseFloat(Vars_Def.group1_li2_state+"f"), Float.parseFloat(Vars_Def.group1_li3_state+"f"), 0, selEase_group1);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    function_containAnim(view_item1, Float.parseFloat(0+"f"), Float.parseFloat(1+"f"), Float.parseFloat(1+"f"), Vars_Def.group1_li0_state, selEase_group1);
                }
            }, 1);
        }
        if (Vars_Def.playMotionState == "In"){
            function_containAnim(view_item1, Float.parseFloat(Vars_Def.group2_li1_state+"f"), Float.parseFloat(Vars_Def.group2_li2_state+"f"), Float.parseFloat(Vars_Def.group2_li3_state+"f"), Vars_Def.group2_li0_state, selEase_group2);
        }
    }

    public static void function_CaseAlarmAnim(){
        if (Vars_Def.playMotionState == "Out"){
            function_containAnim(view_item2, Float.parseFloat(Vars_Def.group1_li1_state+"f"), Float.parseFloat(Vars_Def.group1_li2_state+"f"), Float.parseFloat(Vars_Def.group1_li3_state+"f"), 0, selEase_group1);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    function_containAnim(view_item2, Float.parseFloat(0+"f"), Float.parseFloat(1+"f"), Float.parseFloat(1+"f"), Vars_Def.group1_li0_state, selEase_group1);
                }
            }, 1);
        }
        if (Vars_Def.playMotionState == "In"){
            function_containAnim(view_item2, Float.parseFloat(Vars_Def.group2_li1_state+"f"), Float.parseFloat(Vars_Def.group2_li2_state+"f"), Float.parseFloat(Vars_Def.group2_li3_state+"f"), Vars_Def.group2_li0_state, selEase_group2);
        }
    }
    public static void function_CasePopupReset(){
        function_containAnim(view_item0, Float.parseFloat(0+"f"), Float.parseFloat(1+"f"), Float.parseFloat(0+"f"), 0, selEase_group2);
    }

    public static void function_CaseNudgeReset(){
        function_containAnim(view_item1, Float.parseFloat(0+"f"), Float.parseFloat(1+"f"), Float.parseFloat(0+"f"), 0, selEase_group2);
    }

    public static void function_CaseAlarmReset(){
        function_containAnim(view_item2, Float.parseFloat(0+"f"), Float.parseFloat(1+"f"), Float.parseFloat(0+"f"), 0, selEase_group2);
    }

    public static void function_containAnim(View view, float posN, float scaleN, float alphaN, int duration, Interpolator interpolator){
        AnimatorSet containAnim = new AnimatorSet();
        containAnim.playTogether(
                ObjectAnimator.ofFloat(view,"translationY",posN),
                ObjectAnimator.ofFloat(view,"scaleX",scaleN),
                ObjectAnimator.ofFloat(view,"scaleY",scaleN),
                ObjectAnimator.ofFloat(view,"alpha",alphaN)
        );

        containAnim.setInterpolator(interpolator);
        containAnim.setDuration(duration);
        containAnim.start();
    }

    public static void function_group1_selEase(String string){
        if (string == Vars_Def.array_string_easeType[0]){
            selEase_group1 = interpolator_easeInOut;
        }
        if (string == Vars_Def.array_string_easeType[1]){
            selEase_group1 = interpolator_easeOut;
        }
        if (string == Vars_Def.array_string_easeType[2]){
            selEase_group1 = interpolator_easeIn;
        }
        if (string == Vars_Def.array_string_easeType[3]){
            selEase_group1 = interpolator_bounce;
        }
    }
    public static void function_group2_selEase(String string){
        if (string == Vars_Def.array_string_easeType[0]){
            selEase_group2 = interpolator_easeInOut;
        }
        if (string == Vars_Def.array_string_easeType[1]){
            selEase_group2 = interpolator_easeOut;
        }
        if (string == Vars_Def.array_string_easeType[2]){
            selEase_group2 = interpolator_easeIn;
        }
        if (string == Vars_Def.array_string_easeType[3]){
            selEase_group2 = interpolator_bounce;
        }
    }
    public static void function_group1_vibrate(){

    }

    public static void function_group2_vibrate(){

    }
}