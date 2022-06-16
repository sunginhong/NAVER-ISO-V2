package com.example.naver_iso_v2;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Pannel_SetCalc {
    protected Context context;

    public Pannel_SetCalc(Activity activity) {

        Vars_Def.container_top_marginTop = Utils_Calc.dpToPx((int) 16.75);
        ViewGroup.LayoutParams params = Activity_Interactions.interaction_rect_objectFL.getLayoutParams();
        Activity_Interactions.params_copy = Activity_Interactions.interaction_rect_objectFL_contain.getLayoutParams();

        Activity_Interactions.layout_container_top_group.measure(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        Vars_Def.container_top_group_height = Activity_Interactions.layout_container_top_group.getMeasuredHeight();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Vars_Def.bottom_rectHeight = 0;
                Vars_Def.rootHeight = Activity_Interactions.root.getHeight();
                Vars_Def.posMinY = Activity_Interactions.root.getHeight()-(Vars_Def.container_top_group_height+Vars_Def.container_top_marginTop+Vars_Def.shadowHeight);

                Vars_Def.heightMin = Activity_Interactions.interaction_rect_objectFL.getHeight()+Vars_Def.shadowHeight;
                Vars_Def.heightMax = Vars_Def.screenHeight -  Vars_Def.bottom_rectHeight - (Vars_Def.container_top_group_height+Vars_Def.container_top_marginTop+Vars_Def.shadowHeight)-Vars_Def.shadowHeight+Utils_Calc.dpToPx(22);
                Vars_Def.posMinY_drag = Activity_Interactions.root.getHeight()-(Vars_Def.container_top_group_height+Vars_Def.container_top_marginTop+Vars_Def.shadowHeight)-Vars_Def.shadowHeight;

                Activity_Interactions.params_copy.height = Vars_Def.heightMax - Activity_Interactions.frag_header_height;
                Activity_Interactions.interaction_rect_objectFL_contain.setLayoutParams(Activity_Interactions.params_copy);
//                Activity_Interactions.interaction_rect_objectFL.setLayoutParams(new LinearLayout.LayoutParams(Activity_Interactions.params_copy.width, Vars_Def.heightMax));
                Vars_Def.screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;

                Pannel_Layout.setContain();
            }
        }, 300);

    }
}