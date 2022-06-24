package com.example.naver_iso_v2;

import java.util.ArrayList;

public class Interaction_ResultArray {

    public static ArrayList<String> ArrData = new ArrayList<>();

    public static void getData(){

        ArrData.add(String.valueOf(Pannel_ListLayout_Top.anim_title.getText()));
        ArrData.add(String.valueOf(Vars_Def.inMotion_li0_state));
        if (Vars_Def.inMotion_li1_state ==  0){
            ArrData.add("위치 이동 없음");
        } else {
            ArrData.add("가이드 위치 + 30에서 → 가이드 위치까지 이동");
        }
        ArrData.add(String.valueOf(Vars_Def.inMotion_li2_state));
        ArrData.add(String.valueOf(Vars_Def.inMotion_li3_state));
        ArrData.add(String.valueOf(Vars_Def.inMotion_li4_state));
        ArrData.add(String.valueOf(Vars_Def.inMotion_li5_state));
        ArrData.add(String.valueOf(Vars_Def.outMotion_li0_state));
        if (Vars_Def.outMotion_li1_state ==  0){
            ArrData.add("위치 이동 없음");
        } else {
            ArrData.add("가이드 위치 + 30에서 → 가이드 위치까지 이동");
        }
        ArrData.add(String.valueOf(Vars_Def.outMotion_li2_state));
        ArrData.add(String.valueOf(Vars_Def.outMotion_li3_state));
        ArrData.add(String.valueOf(Vars_Def.outMotion_li4_state));
        ArrData.add(String.valueOf(Vars_Def.outMotion_li5_state));

    }

}
