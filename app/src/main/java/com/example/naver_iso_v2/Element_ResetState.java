package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Handler;
import android.view.View;

public class Element_ResetState {
    Context ctx;

    public Element_ResetState(View view, Context ctx){
        this.ctx = ctx;
    }

    public static void defCaseState00(Context ctx){
        defCaseState();
        Main_Rcv_Vp_StateReset.setListPos(0, ctx);
        Elem_Vars_Def.IN_li0_state = Elem_Vars_Def.defCase0_IN_li0_def;
        Elem_Vars_Def.IN_li1_state = Elem_Vars_Def.defCase0_IN_li1_def;
        Elem_Vars_Def.IN_li2_state = Elem_Vars_Def.defCase0_IN_li2_def;
        Elem_Vars_Def.IN_li3_state = Elem_Vars_Def.defCase0_IN_li3_def;
        Elem_Vars_Def.IN_li4_state = Elem_Vars_Def.defCase0_IN_li4_def;

        Elem_Vars_Def.OUT_li0_state = Elem_Vars_Def.defCase0_OUT_li0_def;
        Elem_Vars_Def.OUT_li1_state = Elem_Vars_Def.defCase0_OUT_li1_def;
        Elem_Vars_Def.OUT_li2_state = Elem_Vars_Def.defCase0_OUT_li2_def;
        Elem_Vars_Def.OUT_li3_state = Elem_Vars_Def.defCase0_OUT_li3_def;
        Elem_Vars_Def.OUT_li4_state = Elem_Vars_Def.defCase0_OUT_li4_def;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                resetState(0);
            }
        }, 1);

    }

    public static void defCaseState01(Context ctx){
        defCaseState();
        Main_Rcv_Vp_StateReset.setListPos(1, ctx);
        Elem_Vars_Def.IN_li0_state = Elem_Vars_Def.defCase1_IN_li0_def;
        Elem_Vars_Def.IN_li1_state = Elem_Vars_Def.defCase1_IN_li1_def;
        Elem_Vars_Def.IN_li2_state = Elem_Vars_Def.defCase1_IN_li2_def;
        Elem_Vars_Def.IN_li3_state = Elem_Vars_Def.defCase1_IN_li3_def;
        Elem_Vars_Def.IN_li4_state = Elem_Vars_Def.defCase1_IN_li4_def;

        Elem_Vars_Def.OUT_li0_state = Elem_Vars_Def.defCase1_OUT_li0_def;
        Elem_Vars_Def.OUT_li1_state = Elem_Vars_Def.defCase1_OUT_li1_def;
        Elem_Vars_Def.OUT_li2_state = Elem_Vars_Def.defCase1_OUT_li2_def;
        Elem_Vars_Def.OUT_li3_state = Elem_Vars_Def.defCase1_OUT_li3_def;
        Elem_Vars_Def.OUT_li4_state = Elem_Vars_Def.defCase1_OUT_li4_def;


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                resetState(1);
            }
        }, 1);

    }

    public static void defCaseState02(Context ctx){
        defCaseState();
        Main_Rcv_Vp_StateReset.setListPos(2, ctx);
        Elem_Vars_Def.IN_li0_state = Elem_Vars_Def.defCase2_IN_li0_def;
        Elem_Vars_Def.IN_li1_state = Elem_Vars_Def.defCase2_IN_li1_def;
        Elem_Vars_Def.IN_li2_state = Elem_Vars_Def.defCase2_IN_li2_def;
        Elem_Vars_Def.IN_li3_state = Elem_Vars_Def.defCase2_IN_li3_def;
        Elem_Vars_Def.IN_li4_state = Elem_Vars_Def.defCase2_IN_li4_def;

        Elem_Vars_Def.OUT_li0_state = Elem_Vars_Def.defCase2_OUT_li0_def;
        Elem_Vars_Def.OUT_li1_state = Elem_Vars_Def.defCase2_OUT_li1_def;
        Elem_Vars_Def.OUT_li2_state = Elem_Vars_Def.defCase2_OUT_li2_def;
        Elem_Vars_Def.OUT_li3_state = Elem_Vars_Def.defCase2_OUT_li3_def;
        Elem_Vars_Def.OUT_li4_state = Elem_Vars_Def.defCase2_OUT_li4_def;

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                resetState(2);
            }
        }, 1);

    }

    public static void defCaseState() {
        AnimRectObject.function_CasePopupReset();
        AnimRectObject.function_CaseNudgeReset();
        AnimRectObject.function_CaseAlarmReset();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                resetState(0);
            }
        }, 1);

    }

    public static void resetState(int nums){
        switch(nums) {
            case 0:

                break;

            case 1:

                break;
            case 2:

                break;
        }
    }

}