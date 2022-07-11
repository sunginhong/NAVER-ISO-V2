package com.example.naver_iso_v2;

import java.util.ArrayList;

public class Element_ResultArray {
    public static ArrayList<String> ArrData = new ArrayList<>();

    public static void getData(){

        ArrData.add(String.valueOf(Element_Pannel_ListLayout_Top.element_anim_title.getText()));
        ArrData.add(String.valueOf(Elem_Vars_Def.IN_li0_state) + "ms");
        if (Elem_Vars_Def.IN_li1_state ==  0){
            ArrData.add("None");
        }
        if (Elem_Vars_Def.IN_li1_state ==  Utils_Calc.dpToPx(Elem_Vars_Def.bottomPosY)){
            ArrData.add("30 → 0");
        }
        if (Elem_Vars_Def.IN_li1_state ==  Utils_Calc.dpToPx(-Elem_Vars_Def.bottomPosY)){
            ArrData.add("-30 → 0");
        }
        if (Elem_Vars_Def.IN_li2_state ==  0){
            ArrData.add("0% → 100%");
        }
        if (Elem_Vars_Def.IN_li2_state ==  0.5){
            ArrData.add("50% → 100%");
        }
        if (Elem_Vars_Def.IN_li2_state ==  1){
            ArrData.add("100% → 100%");
        }
        if (Elem_Vars_Def.IN_li3_state ==  0){
            ArrData.add("0% → 100%");
        }
        if (Elem_Vars_Def.IN_li3_state ==  0.5){
            ArrData.add("50% → 100%");
        }
        if (Elem_Vars_Def.IN_li3_state ==  1){
            ArrData.add("100% → 100%");
        }
        if (Elem_Vars_Def.IN_li4_state ==  AnimRectObject.interpolator_easeOut){
            ArrData.add("Out / cubic-bezier(0.33, 1, 0.68, 1)");
        }
        if (Elem_Vars_Def.IN_li4_state ==  AnimRectObject.interpolator_easeInOut){
            ArrData.add("In-Out / cubic-bezier(0.65, 0, 0.35, 1)");
        }

        ArrData.add(String.valueOf(Elem_Vars_Def.OUT_li0_state) + "ms");
        if (Elem_Vars_Def.OUT_li1_state ==  0){
            ArrData.add("None");
        }
        if (Elem_Vars_Def.OUT_li1_state ==  Utils_Calc.dpToPx(Elem_Vars_Def.bottomPosY)){
            ArrData.add("30 → 0");
        }
        if (Elem_Vars_Def.OUT_li1_state ==  Utils_Calc.dpToPx(-Elem_Vars_Def.bottomPosY)){
            ArrData.add("-30 → 0");
        }
        if (Elem_Vars_Def.OUT_li2_state ==  0){
            ArrData.add("100% → 0%");
        }
        if (Elem_Vars_Def.OUT_li2_state ==  0.5){
            ArrData.add("100% → 50%");
        }
        if (Elem_Vars_Def.OUT_li2_state ==  1){
            ArrData.add("100% → 100%");
        }
        if (Elem_Vars_Def.OUT_li3_state ==  0){
            ArrData.add("100% → 0%");
        }
        if (Elem_Vars_Def.OUT_li3_state ==  0.5){
            ArrData.add("100% → 50%");
        }
        if (Elem_Vars_Def.OUT_li3_state ==  1){
            ArrData.add("100% → 100%");
        }
        if (Elem_Vars_Def.OUT_li4_state ==  AnimRectObject.interpolator_easeOut){
            ArrData.add("Out / cubic-bezier(0.33, 1, 0.68, 1)");
        }
        if (Elem_Vars_Def.OUT_li4_state ==  AnimRectObject.interpolator_easeInOut){
            ArrData.add("In-Out / cubic-bezier(0.65, 0, 0.35, 1)");
        }

    }

}
