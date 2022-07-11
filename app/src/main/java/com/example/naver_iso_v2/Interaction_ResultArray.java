package com.example.naver_iso_v2;

import java.util.ArrayList;

public class Interaction_ResultArray {

    public static ArrayList<String> ArrData = new ArrayList<>();

    public static void getData(){

        ArrData.add(String.valueOf(Element_Pannel_ListLayout_Top.element_anim_title.getText()));
        ArrData.add(String.valueOf(Elem_Vars_Def.IN_li0_state));
        if (Vars_Def.inMotion_li1_state ==  0){
            ArrData.add("위치 이동 없음");
        } else {
            ArrData.add("가이드 위치 + 30에서 → 가이드 위치까지 이동");
        }
        ArrData.add(String.valueOf(Elem_Vars_Def.IN_li1_state));
        ArrData.add(String.valueOf(Elem_Vars_Def.IN_li2_state));
        ArrData.add(String.valueOf(Elem_Vars_Def.IN_li3_state));
        ArrData.add(String.valueOf(Elem_Vars_Def.IN_li4_state));
        if (Elem_Vars_Def.OUT_li0_state ==  0){
            ArrData.add("위치 이동 없음");
        } else {
            ArrData.add("가이드 위치 + 30에서 → 가이드 위치까지 이동");
        }
        ArrData.add(String.valueOf(Elem_Vars_Def.OUT_li1_state));
        ArrData.add(String.valueOf(Elem_Vars_Def.OUT_li2_state));
        ArrData.add(String.valueOf(Elem_Vars_Def.OUT_li3_state));
        ArrData.add(String.valueOf(Elem_Vars_Def.OUT_li4_state));

    }

}
