package com.example.naver_iso_v2;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.ViewGroup;

public class Element_Pannel_SetCalc {

    protected Context ctx;

    public Element_Pannel_SetCalc(Activity activity, Context ctx) {
        this.ctx = ctx;
        Vars_Def.container_top_marginTop = Utils_Calc.dpToPx((int) 16.75);

        Activity_Element.layout_container_top_group.measure(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        Vars_Def.container_top_group_height = Element_Pannel_Layout.element_title_top.getMeasuredHeight(); //200정도?

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Vars_Def.bottom_rectHeight = 0;
                Vars_Def.rootHeight = Activity_Element.element_root.getHeight();
                Vars_Def.posMinY = (int) 0 + Element_Pannel_Layout.element_container_top.getHeight();
                Vars_Def.posMaxY = (int) 0;

                Vars_Def.screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;

                Element_DragAdapter.objHeight_max = Activity_Element.element_obj_layout.getMeasuredHeight() - Element_Pannel_Layout.element_title_top.getMeasuredHeight();
                Element_DragAdapter.objHeight_min = Vars_Def.screenHeight - Activity_Element.element_root.getMeasuredHeight() - Utils_Calc.dpToPx(16) + Element_Pannel_Layout.element_title_top.getHeight();
                Element_DragAdapter.objPos_max = 0;
                Element_DragAdapter.objPos_min = (Vars_Def.screenHeight/2 - (Activity_Element.element_obj_layout.getHeight()/2 - (int)ctx.getResources().getDimension(R.dimen.main_bottom_menu_height)));
                Element_DragAdapter.function_HeightAnim(Activity_Element.element_obj_layout, Element_DragAdapter.objHeight_max, 0, AnimRectObject.interpolator_easeOut);
                Element_Pannel_Layout.setContain();
            }
        }, 100);

    }
}