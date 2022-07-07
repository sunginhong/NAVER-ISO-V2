package com.example.naver_iso_v2;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.RelativeLayout;

import androidx.core.view.animation.PathInterpolatorCompat;

public class Element_DragAdapter implements View.OnTouchListener {

    Context mContext;
    public String firstY = "0";
    float moveY = 0;
    boolean move = false;
    static Interpolator interpolator_bounce = PathInterpolatorCompat.create(0.34f, 1.56f, 0.64f, 1f);
    public Element_DragAdapter(Context context){
        mContext = context;
    }
    static float rectCalcHeight;
    static int objHeight_max;
    static int objHeight_min;

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        String curY = String.format("%.2f", event.getY());

        switch (event.getAction() & MotionEvent.ACTION_MASK) {

            case MotionEvent.ACTION_DOWN:
                firstY = curY;
                move = false;
                rectCalcHeight = Vars_Def.posMaxY;
                break;
            case MotionEvent.ACTION_POINTER_DOWN:
                break;
            case MotionEvent.ACTION_POINTER_UP:
                break;
            case MotionEvent.ACTION_MOVE:
                move = true;
                moveY = view.getY() + (Float.parseFloat(curY) - Float.parseFloat(firstY));
                if (move){
                    if (Vars_Def.container_top_margin < moveY) {
                        Element_Pannel_Layout.element_container.setY( moveY );
                        if ((Vars_Def.heightMax-Vars_Def.heightMin) > moveY){
                            rectCalcHeight = Utils_Calc.ModulateCalc(moveY, Vars_Def.posMaxY, Vars_Def.posMinY_drag, Vars_Def.heightMin, Vars_Def.heightMax);
                        }
                        if ((int) rectCalcHeight > Vars_Def.heightMin && (int) rectCalcHeight < Vars_Def.heightMax){

                        }
                    }
                }
                Element_Pannel_Layout.element_container.invalidate();
                break;
            case MotionEvent.ACTION_UP:
                if (move){
                }
                if (moveY < Vars_Def.posMaxY+Element_Pannel_Layout.element_container.getHeight()/2){
                    if (Activity_Element.element_root.getHeight() >= (int) rectCalcHeight){
                        function_containAnim(Element_Pannel_Layout.element_container, Vars_Def.posMaxY, 400, AnimRectObject.interpolator_easeOut);
                        Vars_Def.container_bool = true;

                        Element_Pannel_ListLayout_Top.element_btn_trigger.setRotation(-180);
                        function_HeightAnim(Activity_Element.element_obj_layout, objHeight_min, 400, AnimRectObject.interpolator_easeOut);
                    }
                } else {
                    function_containAnim(Element_Pannel_Layout.element_container, Vars_Def.posMinY, 400, AnimRectObject.interpolator_bounce2);
                    Vars_Def.container_bool = false;
                    Element_Pannel_ListLayout_Top.element_btn_trigger.setRotation(0);
                    function_HeightAnim(Activity_Element.element_obj_layout, objHeight_max, 400, AnimRectObject.interpolator_easeOut);
                }
                move = false;
                break;
        }
        Element_Pannel_Layout.element_container.invalidate();
        return true;
    }

    public static void function_containAnim(View view, float n, int duration, Interpolator interpolator){
        ObjectAnimator containAnim = ObjectAnimator.ofFloat(view, "translationY", n);
        containAnim.setInterpolator(interpolator);
        containAnim.setDuration(duration);
        containAnim.start();
    }

    public static void function_HeightAnim(RelativeLayout view, int n, int duration, Interpolator interpolator) {
        final int currentHeight = view.getHeight();
        ObjectAnimator animator = ObjectAnimator.ofInt(view, new HeightProperty(), currentHeight, n);
        animator.setDuration(300);
        animator.setInterpolator(interpolator);
        animator.start();
    }

    static class HeightProperty extends Property<View, Integer> {

        public HeightProperty() {
            super(Integer.class, "height");
        }

        @Override public Integer get(View view) {
            return view.getHeight();
        }

        @Override public void set(View view, Integer value) {
            view.getLayoutParams().height = value;
            view.setLayoutParams(view.getLayoutParams());
        }
    }

    public static void AlphaAnimCusEase(View view, float n, int duration, Interpolator interpolator) {
        ObjectAnimator containAnim = ObjectAnimator.ofFloat(view, "alpha", n);
        containAnim.setInterpolator(interpolator);
        containAnim.setDuration(duration);
        containAnim.start();
    }
}