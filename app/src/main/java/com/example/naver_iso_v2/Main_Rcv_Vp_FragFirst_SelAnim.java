package com.example.naver_iso_v2;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;

public class Main_Rcv_Vp_FragFirst_SelAnim {

    static int itemWidthCalc = Utils_Calc.dpToPx(4);

    @SuppressLint("ResourceType")
    static void set_r0(Context ctx, View v, int duration){
        if (v.getId() == 0){
            function_containAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_0, v.getX()+Utils_Calc.dpToPx(2), duration, AnimRectObject.interpolator_easeOut);
        } else {
            function_containAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_0, v.getX()+Utils_Calc.dpToPx(2), duration, AnimRectObject.interpolator_easeOut);
        }
//        function_WidthAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_0, v.getWidth()-itemWidthCalc, duration, AnimRectObject.interpolator_easeOut);
        if (v.getId() == 0){
            Elem_Vars_Def.IN_li0_state = 300;
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r0_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r0_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
        }
        if (v.getId() == 1){
            Elem_Vars_Def.IN_li0_state = 400;
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r0_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r0_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
        }
    }

    @SuppressLint("ResourceType")
    static void set_r1(Context ctx, View v, int duration){
        if (v.getId() == 0){
            function_containAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_1, v.getX()+Utils_Calc.dpToPx(2), 300, AnimRectObject.interpolator_easeOut);
        } else {
            function_containAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_1, v.getX()+Utils_Calc.dpToPx(2), 300, AnimRectObject.interpolator_easeOut);
        }
//        function_WidthAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_1, v.getWidth()-itemWidthCalc, 300, AnimRectObject.interpolator_easeOut);
        if (v.getId() == 0){
            Elem_Vars_Def.IN_li1_state = 0;
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r1_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r1_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r1_c2.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
        }
        if (v.getId() == 1){
            Elem_Vars_Def.IN_li1_state = Utils_Calc.dpToPx(Elem_Vars_Def.bottomPosY);
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r1_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r1_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r1_c2.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
        }
        if (v.getId() == 2){
            Elem_Vars_Def.IN_li1_state = Utils_Calc.dpToPx(-Elem_Vars_Def.bottomPosY);
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r1_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r1_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r1_c2.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
        }
    }

    @SuppressLint("ResourceType")
    static void set_r2(Context ctx, View v, int duration){
        if (v.getId() == 0){
            function_containAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_2, v.getX()+Utils_Calc.dpToPx(2), 300, AnimRectObject.interpolator_easeOut);
        } else {
            function_containAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_2, v.getX()+Utils_Calc.dpToPx(2), 300, AnimRectObject.interpolator_easeOut);
        }
//        function_WidthAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_2, v.getWidth()-itemWidthCalc, 300, AnimRectObject.interpolator_easeOut);
        if (v.getId() == 0){
            Elem_Vars_Def.IN_li2_state = 0;
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r2_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r2_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r2_c2.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
        }
        if (v.getId() == 1){
            Elem_Vars_Def.IN_li2_state = 0.5;
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r2_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r2_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r2_c2.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
        }
        if (v.getId() == 2){
            Elem_Vars_Def.IN_li2_state = 1;
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r2_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r2_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r2_c2.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
        }
    }

    @SuppressLint("ResourceType")
    static void set_r3(Context ctx, View v, int duration){
        if (v.getId() == 0){
            function_containAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_3, v.getX()+Utils_Calc.dpToPx(2), 300, AnimRectObject.interpolator_easeOut);
        } else {
            function_containAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_3, v.getX()+Utils_Calc.dpToPx(2), 300, AnimRectObject.interpolator_easeOut);
        }
//        function_WidthAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_3, v.getWidth()-itemWidthCalc, 300, AnimRectObject.interpolator_easeOut);
        if (v.getId() == 0){
            Elem_Vars_Def.IN_li3_state = 0;
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r3_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r3_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r3_c2.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
        }
        if (v.getId() == 1){
            Elem_Vars_Def.IN_li3_state = 0.5;
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r3_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r3_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r3_c2.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
        }
        if (v.getId() == 2){
            Elem_Vars_Def.IN_li3_state = 1;
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r3_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r3_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r3_c2.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
        }
    }

    @SuppressLint("ResourceType")
    static void set_r4(Context ctx, View v, int duration){
        if (v.getId() == 0){
            function_containAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_4, v.getX()+Utils_Calc.dpToPx(2), 300, AnimRectObject.interpolator_easeOut);
        } else {
            function_containAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_4, v.getX()+Utils_Calc.dpToPx(2), 300, AnimRectObject.interpolator_easeOut);
        }
//        function_WidthAnim(Main_Rcv_Vp_FragFirst.elem_p1_item_sel_4, v.getWidth()-itemWidthCalc, 300, AnimRectObject.interpolator_easeOut);
        if (v.getId() == 0){
            Elem_Vars_Def.IN_li4_state = AnimRectObject.interpolator_easeOut;
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r4_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r4_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
        }
        if (v.getId() == 1){
            Elem_Vars_Def.IN_li4_state = AnimRectObject.interpolator_easeInOut;
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r4_c0.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_norcolor, ctx.getResources().newTheme()));
            Main_Rcv_Vp_FragFirst.elem_p1_item_lst_r4_c1.setTextColor(ctx.getResources().getColor(R.color.main_vp_text_selcolor, ctx.getResources().newTheme()));
        }
    }

    public static void function_containAnim(View view, float n, int duration, Interpolator interpolator){
        ObjectAnimator containAnim = ObjectAnimator.ofFloat(view, "translationX", n);
        containAnim.setInterpolator(interpolator);
        containAnim.setDuration(duration);
        containAnim.start();
    }

    public static void function_WidthAnim(View view, float n, int duration, Interpolator interpolator) {
        final int currentWidth = view.getWidth();
        ObjectAnimator animator = ObjectAnimator.ofInt(view, new WidthProperty(), currentWidth, (int) n);
        animator.setDuration(duration);
        animator.setInterpolator(interpolator);
        animator.start();
    }

    static class WidthProperty extends Property<View, Integer> {
        public WidthProperty() {
            super(Integer.class, "width");
        }
        @Override public Integer get(View view) {
            return view.getWidth();
        }
        @Override public void set(View view, Integer value) {
            view.getLayoutParams().width = value;
            view.setLayoutParams(view.getLayoutParams());
        }
    }
}
