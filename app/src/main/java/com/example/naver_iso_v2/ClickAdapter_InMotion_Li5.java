package com.example.naver_iso_v2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class ClickAdapter_InMotion_Li5 implements View.OnClickListener{

    Context mContext;
    private int idx = 1;

    public ClickAdapter_InMotion_Li5(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.in_motion_li5_btncase0:
                Vars_Def.inMotion_li5_state = "None";
                Pannel_ListLayout_InMotion.in_motion_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase0_radio_trans.startTransition(100);
                Pannel_ListLayout_InMotion.in_motion_li5_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li5_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li5_btncase3_radio_trans.resetTransition();
                break;

            case R.id.in_motion_li5_btncase1:
                Vars_Def.inMotion_li5_state = "Light";
                Pannel_ListLayout_InMotion.in_motion_li5_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase1_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li5_btncase1_radio_trans.startTransition(100);
                Pannel_ListLayout_InMotion.in_motion_li5_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li5_btncase3_radio_trans.resetTransition();
                break;

            case R.id.in_motion_li5_btncase2:
                Vars_Def.inMotion_li5_state = "Normal";
                Pannel_ListLayout_InMotion.in_motion_li5_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase2_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li5_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li5_btncase2_radio_trans.startTransition(100);
                Pannel_ListLayout_InMotion.in_motion_li5_btncase3_radio_trans.resetTransition();
                break;

            case R.id.in_motion_li5_btncase3:
                Vars_Def.inMotion_li5_state = "Strong";
                Pannel_ListLayout_InMotion.in_motion_li5_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase3_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_InMotion.in_motion_li5_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li5_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li5_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li5_btncase3_radio_trans.startTransition(100);
                break;
        }
//        MainActivity.result_out_haptic.setText(Vars.group2_li5_state);
    }
}
