package com.example.naver_iso_v2.TYPE2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import com.example.naver_iso_v2.Pannel_ListLayout_OutMotion;
import com.example.naver_iso_v2.R;
import com.example.naver_iso_v2.Vars_Def;

public class ClickAdapter_OutMotion_Li0 implements View.OnClickListener{

    Context mContext;
    private double duration = 0;

    public ClickAdapter_OutMotion_Li0(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.out_motion_li0_btncase0:
                Vars_Def.outMotion_li0_state = 200;
                duration = 0.2;
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_radio_trans.startTransition(100);
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase2_radio_trans.resetTransition();
                break;

            case R.id.out_motion_li0_btncase1:
                Vars_Def.outMotion_li0_state = 300;
                duration = 0.3;
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase1_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase1_radio_trans.startTransition(100);
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase2_radio_trans.resetTransition();
                break;

            case R.id.out_motion_li0_btncase2:
                Vars_Def.outMotion_li0_state = 400;
                duration = 0.4;
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase2_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_OutMotion.out_motion_li0_btncase2_radio_trans.startTransition(100);
                break;
        }
//        Pannel_Result.outMotion_result_0.setText(""+duration+"");
    }
}