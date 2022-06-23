package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Handler;
import android.view.View;

public class Interaction_PlayAnim {

    public  Interaction_PlayAnim(boolean state, View view){
        if (state){
            AnimRectObject.function_group1_vibrate();
            AnimRectObject.function_containAnim(view, Float.parseFloat(Vars_Def.inMotion_li1_state +"f"), Float.parseFloat(Vars_Def.inMotion_li2_state +"f"), Float.parseFloat(Vars_Def.inMotion_li3_state +"f"), 0, AnimRectObject.selEase_group1);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    AnimRectObject.function_containAnim(view, Float.parseFloat(0+"f"), Float.parseFloat(1+"f"), Float.parseFloat(1+"f"), Vars_Def.inMotion_li0_state, AnimRectObject.selEase_group1);
                }
            }, 1);
        } else {
            AnimRectObject.function_group2_vibrate();
            AnimRectObject.function_containAnim(view, Float.parseFloat(Vars_Def.outMotion_li1_state +"f"), Float.parseFloat(Vars_Def.outMotion_li2_state +"f"), Float.parseFloat(Vars_Def.outMotion_li3_state +"f"), Vars_Def.outMotion_li0_state, AnimRectObject.selEase_group2);
        }
    }

}
