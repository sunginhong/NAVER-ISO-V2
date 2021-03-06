package com.example.naver_iso_v2.TYPE2;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import androidx.core.view.animation.PathInterpolatorCompat;

import com.example.naver_iso_v2.AnimRectObject;
import com.example.naver_iso_v2.Pannel_ListLayout_InMotion;
import com.example.naver_iso_v2.R;
import com.example.naver_iso_v2.Vars_Def;

public class ClickAdapter_InMotion_Li4 implements View.OnClickListener{

    Context mContext;
    private int idx = 1;
    private String easeCase;

    public ClickAdapter_InMotion_Li4(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.in_motion_li4_btncase0:
                idx = 0;
                Vars_Def.inMotion_li4_state = Vars_Def.array_string_easeType[idx];
                easeCase = " - cubic-bezier(0.32, 0, 0.67, 0)";
                Pannel_ListLayout_InMotion.in_motion_li4_btncase0_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase0_radio_trans.startTransition(100);
                Pannel_ListLayout_InMotion.in_motion_li4_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li4_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li4_btncase3_radio_trans.resetTransition();
                break;

            case R.id.in_motion_li4_btncase1:
                idx = 1;
                Vars_Def.inMotion_li4_state = Vars_Def.array_string_easeType[idx];
                easeCase = " - cubic-bezier(0.65, 0, 0.35, 1)";
                Pannel_ListLayout_InMotion.in_motion_li4_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase1_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li4_btncase1_radio_trans.startTransition(100);
                Pannel_ListLayout_InMotion.in_motion_li4_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li4_btncase3_radio_trans.resetTransition();
                break;

            case R.id.in_motion_li4_btncase2:
                idx = 2;
                Vars_Def.inMotion_li4_state = Vars_Def.array_string_easeType[idx];
                easeCase = " - cubic-bezier(0.33, 1, 0.68, 1)";
                Pannel_ListLayout_InMotion.in_motion_li4_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase2_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li4_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li4_btncase2_radio_trans.startTransition(100);
                Pannel_ListLayout_InMotion.in_motion_li4_btncase3_radio_trans.resetTransition();
                break;

            case R.id.in_motion_li4_btncase3:
                idx = 3;
                Vars_Def.inMotion_li4_state = Vars_Def.array_string_easeType[idx];
                easeCase = " - cubic-bezier(0.34, 1.56, 0.64, 1)";
                Pannel_ListLayout_InMotion.in_motion_li4_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase3_text.setTextColor(Color.parseColor("#000000"));
                Pannel_ListLayout_InMotion.in_motion_li4_btncase0_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li4_btncase1_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li4_btncase2_radio_trans.resetTransition();
                Pannel_ListLayout_InMotion.in_motion_li4_btncase3_radio_trans.startTransition(100);
                break;
        }
        AnimRectObject.function_group1_selEase(Vars_Def.inMotion_li4_state);
//        Pannel_Result.inMotion_result_4.setText("ease" + Vars_Def.array_string_easeType[idx] + easeCase);
    }
}
