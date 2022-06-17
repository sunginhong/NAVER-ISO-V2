package com.example.naver_iso_v2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class ClickAdapter_InMotion_Li2 implements View.OnClickListener {

    Context mContext;
    private double duration = 0;

    public ClickAdapter_InMotion_Li2(Context context) {
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.in_motion_li2_btncase0:
                Vars_Def.inMotion_li2_state = 0.0;
                Pannel_ListLayout_InMotion.in_motion_li2_btncase0_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase0_radio_trans.startTransition(100);
                Pannel_ListLayout_InMotion.in_motion_li2_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li2_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li2_btncase3_radio_trans.resetTransition();
                break;

            case R.id.in_motion_li2_btncase1:
                Vars_Def.inMotion_li2_state = 0.5;
                Pannel_ListLayout_InMotion.in_motion_li2_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase1_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li2_btncase1_radio_trans.startTransition(100);
                Pannel_ListLayout_InMotion.in_motion_li2_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li2_btncase3_radio_trans.resetTransition();
                break;

            case R.id.in_motion_li2_btncase2:
                Vars_Def.inMotion_li2_state = 0.7;
                Pannel_ListLayout_InMotion.in_motion_li2_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase2_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li2_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li2_btncase2_radio_trans.startTransition(100);
                Pannel_ListLayout_InMotion.in_motion_li2_btncase3_radio_trans.resetTransition();
                break;

            case R.id.in_motion_li2_btncase3:
                Vars_Def.inMotion_li2_state = 1;
                Pannel_ListLayout_InMotion.in_motion_li2_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase3_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_InMotion.in_motion_li2_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li2_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li2_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li2_btncase3_radio_trans.startTransition(100);
                break;
        }
//        Pannel_Result.inMotion_result_2.setText(String.valueOf(Vars_Def.inMotion_li2_state));
//        if (Vars_Def.inMotion_li2_state == 0){ Pannel_Result.inMotion_result_2.setText("0"); }
//        if (Vars_Def.inMotion_li2_state == 1){ Pannel_Result.inMotion_result_2.setText("1"); }
    }
}