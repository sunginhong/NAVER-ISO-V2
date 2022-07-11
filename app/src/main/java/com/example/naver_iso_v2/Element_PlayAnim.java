package com.example.naver_iso_v2;

import android.os.Handler;
import android.view.View;

public class Element_PlayAnim {

    public  Element_PlayAnim(boolean state, View view){
        if (state){
            AnimRectObject.function_containAnim(view, Float.parseFloat(Elem_Vars_Def.IN_li1_state +"f"), Float.parseFloat(Elem_Vars_Def.IN_li2_state +"f"), Float.parseFloat(Elem_Vars_Def.IN_li3_state +"f"), 0, Elem_Vars_Def.IN_li4_state);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    AnimRectObject.function_containAnim(view, Float.parseFloat(0+"f"), Float.parseFloat(1+"f"), Float.parseFloat(1+"f"), Elem_Vars_Def.IN_li0_state, Elem_Vars_Def.IN_li4_state);
                }
            }, 1);
        } else {

            AnimRectObject.function_containAnim(view, Float.parseFloat(Elem_Vars_Def.OUT_li1_state +"f"), Float.parseFloat(Elem_Vars_Def.OUT_li2_state +"f"), Float.parseFloat(Elem_Vars_Def.OUT_li3_state +"f"), Elem_Vars_Def.OUT_li0_state, Elem_Vars_Def.OUT_li4_state);
        }
    }

}
