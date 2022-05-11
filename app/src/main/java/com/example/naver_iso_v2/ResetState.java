package com.example.naver_iso_v2;

import android.graphics.Color;
import android.os.Handler;
import android.util.Log;
import android.view.View;

public class ResetState {
    public ResetState(View view){

    }

    public static void defCaseState00(){
        defCaseState();
        Pannel_ListLayout_Top.anim_title.setText("Popup Animation");

        Vars_Def.defCaseState00_inMotion_li4_state_def = Vars_Def.array_string_easeType[1];
        Vars_Def.inMotion_li0_state = Vars_Def.defCaseState00_inMotion_li0_state_def;
        Vars_Def.inMotion_li1_state = Vars_Def.defCaseState00_inMotion_li1_state_def;
        Vars_Def.inMotion_li2_state = Vars_Def.defCaseState00_inMotion_li2_state_def;
        Vars_Def.inMotion_li3_state = Vars_Def.defCaseState00_inMotion_li3_state_def;
        Vars_Def.inMotion_li4_state = Vars_Def.defCaseState00_inMotion_li4_state_def;
        Vars_Def.inMotion_li5_state = Vars_Def.defCaseState00_inMotion_li5_state_def;

        Vars_Def.defCaseState00_outMotion_li4_state_def = Vars_Def.array_string_easeType[1];
        Vars_Def.outMotion_li0_state = Vars_Def.defCaseState00_outMotion_li0_state_def;
        Vars_Def.outMotion_li1_state = Vars_Def.defCaseState00_outMotion_li1_state_def;
        Vars_Def.outMotion_li2_state = Vars_Def.defCaseState00_outMotion_li2_state_def;
        Vars_Def.outMotion_li3_state = Vars_Def.defCaseState00_outMotion_li3_state_def;
        Vars_Def.outMotion_li4_state = Vars_Def.defCaseState00_outMotion_li4_state_def;
        Vars_Def.outMotion_li5_state = Vars_Def.defCaseState00_outMotion_li5_state_def;

        Pannel_ListLayout_InMotion.in_motion_li0_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li0_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li1_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li1_btncase0_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li2_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li2_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li3_btncase0_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li4_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li4_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li5_btncase0_radio_trans.startTransition(0);

        Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li1_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li1_btncase0_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase0_radio_trans.startTransition(0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Pannel_Result.rect_code_anim_title.setText("Popup Animation");
                resetState(0);
            }
        }, 1);

    }

    public static void defCaseState01(){
        defCaseState();
        Pannel_ListLayout_Top.anim_title.setText("Nudge Animation");

        Vars_Def.defCaseState01_inMotion_li4_state_def = Vars_Def.array_string_easeType[1];
        Vars_Def.inMotion_li0_state = Vars_Def.defCaseState01_inMotion_li0_state_def;
        Vars_Def.inMotion_li1_state = Vars_Def.defCaseState01_inMotion_li1_state_def;
        Vars_Def.inMotion_li2_state = Vars_Def.defCaseState01_inMotion_li2_state_def;
        Vars_Def.inMotion_li3_state = Vars_Def.defCaseState01_inMotion_li3_state_def;
        Vars_Def.inMotion_li4_state = Vars_Def.defCaseState01_inMotion_li4_state_def;
        Vars_Def.inMotion_li5_state = Vars_Def.defCaseState01_inMotion_li5_state_def;

        Vars_Def.defCaseState01_outMotion_li4_state_def = Vars_Def.array_string_easeType[1];
        Vars_Def.outMotion_li0_state = Vars_Def.defCaseState01_outMotion_li0_state_def;
        Vars_Def.outMotion_li1_state = Vars_Def.defCaseState01_outMotion_li1_state_def;
        Vars_Def.outMotion_li2_state = Vars_Def.defCaseState01_outMotion_li2_state_def;
        Vars_Def.outMotion_li3_state = Vars_Def.defCaseState01_outMotion_li3_state_def;
        Vars_Def.outMotion_li4_state = Vars_Def.defCaseState01_outMotion_li4_state_def;
        Vars_Def.outMotion_li5_state = Vars_Def.defCaseState01_outMotion_li5_state_def;

        Pannel_ListLayout_InMotion.in_motion_li0_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li0_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li1_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li1_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li2_btncase3_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li2_btncase3_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li3_btncase0_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li4_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li4_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li5_btncase0_radio_trans.startTransition(0);

        Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li1_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li1_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase3_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase3_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase0_radio_trans.startTransition(0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Pannel_Result.rect_code_anim_title.setText("Nudge Animation");
                resetState(1);
            }
        }, 1);

    }

    public static void defCaseState02(){
        defCaseState();
        Pannel_ListLayout_Top.anim_title.setText("Alarm Animation");

        Vars_Def.defCaseState02_inMotion_li4_state_def = Vars_Def.array_string_easeType[1];
        Vars_Def.inMotion_li0_state = Vars_Def.defCaseState02_inMotion_li0_state_def;
        Vars_Def.inMotion_li1_state = Vars_Def.defCaseState02_inMotion_li1_state_def;
        Vars_Def.inMotion_li2_state = Vars_Def.defCaseState02_inMotion_li2_state_def;
        Vars_Def.inMotion_li3_state = Vars_Def.defCaseState02_inMotion_li3_state_def;
        Vars_Def.inMotion_li4_state = Vars_Def.defCaseState02_inMotion_li4_state_def;
        Vars_Def.inMotion_li5_state = Vars_Def.defCaseState02_inMotion_li5_state_def;

        Vars_Def.defCaseState02_outMotion_li4_state_def = Vars_Def.array_string_easeType[1];
        Vars_Def.outMotion_li0_state = Vars_Def.defCaseState02_outMotion_li0_state_def;
        Vars_Def.outMotion_li1_state = Vars_Def.defCaseState02_outMotion_li1_state_def;
        Vars_Def.outMotion_li2_state = Vars_Def.defCaseState02_outMotion_li2_state_def;
        Vars_Def.outMotion_li3_state = Vars_Def.defCaseState02_outMotion_li3_state_def;
        Vars_Def.outMotion_li4_state = Vars_Def.defCaseState02_outMotion_li4_state_def;
        Vars_Def.outMotion_li5_state = Vars_Def.defCaseState02_outMotion_li5_state_def;

        Pannel_ListLayout_InMotion.in_motion_li0_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li0_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li1_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li1_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li2_btncase3_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li2_btncase3_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li3_btncase0_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li4_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li4_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_InMotion.in_motion_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_InMotion.in_motion_li5_btncase0_radio_trans.startTransition(0);

        Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li1_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li1_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase3_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase3_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_radio_trans.startTransition(0);
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase0_radio_trans.startTransition(0);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Pannel_Result.rect_code_anim_title.setText("Alarm Animation");
                resetState(2);
            }
        }, 1);

    }

    public static void defCaseState() {
        AnimRectObject.function_CasePopupReset();
        AnimRectObject.function_CaseNudgeReset();
        AnimRectObject.function_CaseAlarmReset();

        Vars_Def.play_btn_state = false;
        Vars_Def.playMotionState = "In";
        Pannel_ListLayout_Top.button_playmotion.setText("Play in Motion");
        Pannel_ListLayout_Top.button_playmotion_trans.resetTransition();
        Pannel_ListLayout_Top.button_playmotion.setTextColor(Color.parseColor("#ffffff"));

        Pannel_ListLayout_InMotion.in_motion_li0_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li0_btncase0_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li0_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li0_btncase1_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li0_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li0_btncase2_radio_trans.resetTransition();

        Pannel_ListLayout_InMotion.in_motion_li1_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li1_btncase0_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li1_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li1_btncase1_radio_trans.resetTransition();

        Pannel_ListLayout_InMotion.in_motion_li2_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li2_btncase0_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li2_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li2_btncase1_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li2_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li2_btncase2_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li2_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li2_btncase3_radio_trans.resetTransition();

        Pannel_ListLayout_InMotion.in_motion_li3_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li3_btncase0_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li3_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li3_btncase1_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li3_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li3_btncase2_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li3_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li3_btncase3_radio_trans.resetTransition();

        Pannel_ListLayout_InMotion.in_motion_li4_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li4_btncase0_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li4_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li4_btncase1_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li4_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li4_btncase2_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li4_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li4_btncase3_radio_trans.resetTransition();

        Pannel_ListLayout_InMotion.in_motion_li5_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li5_btncase0_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li5_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li5_btncase1_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li5_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li5_btncase2_radio_trans.resetTransition();
        Pannel_ListLayout_InMotion.in_motion_li5_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_InMotion.in_motion_li5_btncase3_radio_trans.resetTransition();

//
        Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li0_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li0_btncase1_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li0_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li0_btncase2_radio_trans.resetTransition();

        Pannel_ListLayout_OutMotion.out_motion_li1_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li1_btncase0_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li1_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li1_btncase1_radio_trans.resetTransition();

        Pannel_ListLayout_OutMotion.out_motion_li2_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase0_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase1_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase2_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li2_btncase3_radio_trans.resetTransition();

        Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase1_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase2_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li3_btncase3_radio_trans.resetTransition();

        Pannel_ListLayout_OutMotion.out_motion_li4_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase0_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase2_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li4_btncase3_radio_trans.resetTransition();

        Pannel_ListLayout_OutMotion.out_motion_li5_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase0_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase1_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase2_radio_trans.resetTransition();
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        Pannel_ListLayout_OutMotion.out_motion_li5_btncase3_radio_trans.resetTransition();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Pannel_Result.rect_code_anim_title.setText("Popup Animation");
                resetState(0);
            }
        }, 1);

    }

    public static void resetState(int nums){
        switch(nums) {
            case 0:
                Pannel_Result.rect_codeObject_case0.setAlpha(1);
                Pannel_Result.rect_codeObject_case1.setAlpha(0);
                Pannel_Result.rect_codeObject_case2.setAlpha(0);

                Pannel_Result.inMotion_result_0.setText(""+0.3+"");
                Pannel_Result.inMotion_result_1.setText("위치 이동 없음");
                Pannel_Result.inMotion_result_2.setText("0.5");
                Pannel_Result.inMotion_result_3.setText("0");
                Pannel_Result.inMotion_result_4.setText("ease" + Vars_Def.array_string_easeType[1] + " - cubic-bezier(0.65, 0, 0.35, 1)");

                Pannel_Result.outMotion_result_0.setText(""+0.2+"");
                Pannel_Result.outMotion_result_1.setText("위치 이동 없음");
                Pannel_Result.outMotion_result_2.setText("0.5");
                Pannel_Result.outMotion_result_3.setText("0");
                Pannel_Result.outMotion_result_4.setText("ease" + Vars_Def.array_string_easeType[1] + " - cubic-bezier(0.65, 0, 0.35, 1)");
                break;

            case 1:
                Pannel_Result.rect_codeObject_case0.setAlpha(0);
                Pannel_Result.rect_codeObject_case1.setAlpha(1);
                Pannel_Result.rect_codeObject_case2.setAlpha(0);

                Pannel_Result.inMotion_result_0.setText(""+0.3+"");
                Pannel_Result.inMotion_result_1.setText("가이드 위치 + 30에서 → 가이드 위치까지 이동");
                Pannel_Result.inMotion_result_2.setText("1");
                Pannel_Result.inMotion_result_3.setText("0");
                Pannel_Result.inMotion_result_4.setText("ease" + Vars_Def.array_string_easeType[1] + " - cubic-bezier(0.65, 0, 0.35, 1)");

                Pannel_Result.outMotion_result_0.setText(""+0.2+"");
                Pannel_Result.outMotion_result_1.setText("가이드 위치 + 30에서 → 가이드 위치까지 이동");
                Pannel_Result.outMotion_result_2.setText("1");
                Pannel_Result.outMotion_result_3.setText("0");
                Pannel_Result.outMotion_result_4.setText("ease" + Vars_Def.array_string_easeType[1] + " - cubic-bezier(0.65, 0, 0.35, 1)");
                break;
            case 2:
                Pannel_Result.rect_codeObject_case0.setAlpha(0);
                Pannel_Result.rect_codeObject_case1.setAlpha(0);
                Pannel_Result.rect_codeObject_case2.setAlpha(1);

                Pannel_Result.inMotion_result_0.setText(""+0.3+"");
                Pannel_Result.inMotion_result_1.setText("가이드 위치 + 30에서 → 가이드 위치까지 이동");
                Pannel_Result.inMotion_result_2.setText("1");
                Pannel_Result.inMotion_result_3.setText("0");
                Pannel_Result.inMotion_result_4.setText("ease" + Vars_Def.array_string_easeType[1] + " - cubic-bezier(0.65, 0, 0.35, 1)");

                Pannel_Result.outMotion_result_0.setText(""+0.2+"");
                Pannel_Result.outMotion_result_1.setText("가이드 위치 + 30에서 → 가이드 위치까지 이동");
                Pannel_Result.outMotion_result_2.setText("1");
                Pannel_Result.outMotion_result_3.setText("0");
                Pannel_Result.outMotion_result_4.setText("ease" + Vars_Def.array_string_easeType[1] + " - cubic-bezier(0.65, 0, 0.35, 1)");
                break;
        }
    }

}