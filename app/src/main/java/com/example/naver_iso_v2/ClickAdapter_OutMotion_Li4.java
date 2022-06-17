package com.example.naver_iso_v2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class ClickAdapter_OutMotion_Li4 implements View.OnClickListener{

    Context mContext;
    private int idx = 1;
    private String easeCase;

    public ClickAdapter_OutMotion_Li4(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.out_motion_li4_btncase0:
                idx = 0;
                Vars_Def.outMotion_li4_state = Vars_Def.array_string_easeType[idx];
                easeCase = " - cubic-bezier(0.32, 0, 0.67, 0)";
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase0_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase0_radio_trans.startTransition(100);
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase3_radio_trans.resetTransition();
                break;

            case R.id.out_motion_li4_btncase1:
                idx = 1;
                Vars_Def.outMotion_li4_state = Vars_Def.array_string_easeType[idx];
                easeCase = " - cubic-bezier(0.65, 0, 0.35, 1)";
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_radio_trans.startTransition(100);
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase3_radio_trans.resetTransition();
                break;

            case R.id.out_motion_li4_btncase2:
                idx = 2;
                Vars_Def.outMotion_li4_state = Vars_Def.array_string_easeType[idx];
                easeCase = " - cubic-bezier(0.33, 1, 0.68, 1)";
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase2_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase2_radio_trans.startTransition(100);
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase3_radio_trans.resetTransition();
                break;

            case R.id.out_motion_li4_btncase3:
                idx = 3;
                Vars_Def.outMotion_li4_state = Vars_Def.array_string_easeType[idx];
                easeCase = " - cubic-bezier(0.34, 1.56, 0.64, 1)";
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase3_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li4_btncase3_radio_trans.startTransition(100);
                break;
        }
        AnimRectObject.function_group2_selEase(Vars_Def.outMotion_li4_state);
//        Pannel_Result.outMotion_result_4.setText("ease" + Vars_Def.array_string_easeType[idx] + easeCase);
    }
}