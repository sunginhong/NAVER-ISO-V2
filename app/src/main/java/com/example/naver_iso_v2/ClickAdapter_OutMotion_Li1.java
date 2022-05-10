package com.example.naver_iso_v2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;


public class ClickAdapter_OutMotion_Li1 implements View.OnClickListener{

    Context mContext;

    public ClickAdapter_OutMotion_Li1(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.out_motion_li1_btncase0:
                Vars_Def.outMotion_li1_state = 0;
//                MainActivity.group2_result_2.setText("위치 이동 없음");
                Pannel_ListLayout_OutMotion.out_motion_li1_btncase0_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li1_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li1_btncase0_radio_trans.startTransition(100);
                Pannel_ListLayout_OutMotion.out_motion_li1_btncase1_radio_trans.resetTransition();
                break;

            case R.id.out_motion_li1_btncase1:
                Vars_Def.outMotion_li1_state = Utils_Calc.dpToPx(Vars_Def.bottomPosY);
//                MainActivity.group2_result_2.setText("가이드 위치 + 30에서 → 가이드 위치까지 이동");
                Pannel_ListLayout_OutMotion.out_motion_li1_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li1_btncase1_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li1_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li1_btncase1_radio_trans.startTransition(100);
                break;
        }
    }
}