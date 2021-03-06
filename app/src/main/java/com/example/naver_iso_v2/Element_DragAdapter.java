package com.example.naver_iso_v2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
    static int objPos_max;
    static int objPos_min;

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
                        rectCalcHeight = Utils_Calc.ModulateCalc((int) moveY, Vars_Def.posMaxY, Vars_Def.posMinY, objHeight_min, objHeight_max);
                    }
                }
//                Drag Move iMAGE Container
                if (rectCalcHeight > 0){
//                    function_rectObjAnim(Activity_Element.element_obj_layout, (int) rectCalcHeight, (int) rectCalcHeight, 0, interpolator_bounce);
//                    System.out.println((int) rectCalcHeight);
                }
                Element_Pannel_Layout.element_container.invalidate();
                break;
            case MotionEvent.ACTION_UP:
                if (moveY < Vars_Def.posMaxY+Element_Pannel_Layout.element_container.getHeight()/2.5){
                    function_containAnim(Element_Pannel_Layout.element_container, Vars_Def.posMaxY, 400, AnimRectObject.interpolator_easeOut);
                    Vars_Def.container_bool = true;

                    Element_Pannel_ListLayout_Top.element_btn_trigger.setRotation(-180);
                    Element_DragAdapter.function_containAnim(Activity_Element.element_obj_layout, 0, 400, AnimRectObject.interpolator_easeOut);
//                    function_HeightAnim(Activity_Element.element_obj_layout, objHeight_min, 400, AnimRectObject.interpolator_easeOut);
                } else {
                    function_containAnim(Element_Pannel_Layout.element_container, Vars_Def.posMinY, 400, AnimRectObject.interpolator_bounce2);
                    Vars_Def.container_bool = false;
                    Element_Pannel_ListLayout_Top.element_btn_trigger.setRotation(0);
                    Element_DragAdapter.function_containAnim(Activity_Element.element_obj_layout, Element_DragAdapter.objPos_min, 400, AnimRectObject.interpolator_easeOut);
//                    function_HeightAnim(Activity_Element.element_obj_layout, objHeight_max, 400, AnimRectObject.interpolator_easeOut);
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

    public static void function_HeightAnim(RelativeLayout view, float n, int duration, Interpolator interpolator) {
        final int currentHeight = view.getHeight();
        ObjectAnimator animator = ObjectAnimator.ofInt(view, new HeightProperty(), currentHeight, (int) n);
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

    public static void function_rectObjAnim(View view, int currentHeight, int newHeight, int duration, Interpolator interpolator) {
        ValueAnimator slideAnimator = ValueAnimator.ofInt(currentHeight, newHeight).setDuration(duration);
        slideAnimator.addUpdateListener(animation1 -> {
            Integer value = (Integer) animation1.getAnimatedValue();
            view.getLayoutParams().height = value.intValue();
            view.requestLayout();
        });
        AnimatorSet animationSet = new AnimatorSet();
        animationSet.setInterpolator(interpolator);
        animationSet.play(slideAnimator);
        animationSet.start();
    }
}