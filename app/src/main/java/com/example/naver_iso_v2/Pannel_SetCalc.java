package com.example.naver_iso_v2;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.ViewGroup;

public class Pannel_SetCalc {
    protected Context context;

    public Pannel_SetCalc(MainActivity mainActivity) {

        Vars_Def.container_top_marginTop = Utils_Calc.dpToPx((int) 16.75);
        ViewGroup.LayoutParams params = MainActivity.rect_objectFL.getLayoutParams();
        MainActivity.params_copy = MainActivity.rect_objectFL_Copy.getLayoutParams();

        MainActivity.layout_container_top_group.measure(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        Vars_Def.container_top_group_height = MainActivity.layout_container_top_group.getMeasuredHeight();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Vars_Def.bottom_rectHeight = MainActivity.bottom_rect.getHeight();
                Vars_Def.rootHeight = MainActivity.root.getHeight();
                Vars_Def.posMinY = MainActivity.root.getHeight()-(Vars_Def.container_top_group_height+Vars_Def.container_top_marginTop+Vars_Def.shadowHeight);

                Vars_Def.heightMin = MainActivity.rect_objectFL.getHeight()+Vars_Def.shadowHeight;
                Vars_Def.heightMax = Vars_Def.screenHeight -  Vars_Def.bottom_rectHeight - (Vars_Def.container_top_group_height+Vars_Def.container_top_marginTop+Vars_Def.shadowHeight)-Vars_Def.shadowHeight;
                Vars_Def.posMinY_drag = MainActivity.root.getHeight()-(Vars_Def.container_top_group_height+Vars_Def.container_top_marginTop+Vars_Def.shadowHeight)-Vars_Def.shadowHeight;

                MainActivity.params_copy.height = Vars_Def.heightMax;
                MainActivity.rect_objectFL_Copy.setLayoutParams(MainActivity.params_copy);
                Vars_Def.screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;

                Pannel_Layout.setContain();
            }
        }, 300);

    }
}