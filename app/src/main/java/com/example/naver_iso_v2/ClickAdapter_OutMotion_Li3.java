package com.example.naver_iso_v2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class ClickAdapter_OutMotion_Li3 implements View.OnClickListener{

    Context mContext;

    public ClickAdapter_OutMotion_Li3(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.out_motion_li3_btncase0:
                Vars_Def.outMotion_li3_state = 0;
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_radio_trans.startTransition(100);
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase3_radio_trans.resetTransition();
                break;

            case R.id.out_motion_li3_btncase1:
                Vars_Def.outMotion_li3_state = 0.5;
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase1_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase1_radio_trans.startTransition(100);
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase3_radio_trans.resetTransition();
                break;
            case R.id.out_motion_li3_btncase2:
                Vars_Def.outMotion_li3_state = 0.7;
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase2_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase2_radio_trans.startTransition(100);
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase3_radio_trans.resetTransition();
                break;
            case R.id.out_motion_li3_btncase3:
                Vars_Def.outMotion_li3_state = 1;
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase3_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li3_btncase3_radio_trans.startTransition(100);
                break;
        }
//        Pannel_Result.outMotion_result_3.setText(String.valueOf(Vars_Def.outMotion_li3_state));
//        if (Vars_Def.outMotion_li3_state == 0){ Pannel_Result.outMotion_result_3.setText("0"); }
//        if (Vars_Def.outMotion_li3_state == 1){ Pannel_Result.outMotion_result_3.setText("1"); }
    }
}