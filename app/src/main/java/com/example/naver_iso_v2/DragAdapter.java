package com.example.naver_iso_v2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Interpolator;

import androidx.core.view.animation.PathInterpolatorCompat;

public class DragAdapter implements View.OnTouchListener {

    Context mContext;
    public String firstY = "0";
    float moveY = 0;
    boolean move = false;
    static Interpolator interpolator_bounce = PathInterpolatorCompat.create(0.34f, 1.56f, 0.64f, 1f);
    public DragAdapter(Context context){
        mContext = context;
    }
    static float rectCalcHeight;

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        String curY = String.format("%.2f", event.getY());

        switch (event.getAction() & MotionEvent.ACTION_MASK) {

            case MotionEvent.ACTION_DOWN:
                firstY = curY;
                move = false;
//                Activity_Interactions.interaction_rect_objectFL_contain.setY( Vars_Def.posMaxY + Activity_Interactions.frag_header_height );
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
                        Pannel_Layout.container.setY( moveY );
                        if ((Vars_Def.heightMax-Vars_Def.heightMin) > moveY){
                            rectCalcHeight = Utils_Calc.ModulateCalc(moveY, Vars_Def.posMaxY, Vars_Def.posMinY_drag, Vars_Def.heightMin, Vars_Def.heightMax);
                        }
                        if ((int) rectCalcHeight > Vars_Def.heightMin && (int) rectCalcHeight < Vars_Def.heightMax){
//                            function_rectObjAnim(Activity_Interactions.interaction_rect_objectFL_contain, (int) rectCalcHeight, (int) rectCalcHeight, 0, interpolator_bounce);
                        }
                    }
                }
                Pannel_Layout.container.invalidate();
                break;
            case MotionEvent.ACTION_UP:
                if (move){
                }
                if (((Vars_Def.heightMax-Vars_Def.heightMin)/1.75) > moveY){
                    if (Activity_Interactions.interaction_rect_objectFL_contain.getHeight() >= (int) rectCalcHeight){
                        AlphaAnimCusEase(Activity_Interactions.interaction_dimmed, 1, 400, AnimRectObject.interpolator_easeOut);
                        function_containAnim(Pannel_Layout.container, Vars_Def.posMaxY, 400, AnimRectObject.interpolator_easeOut);
                        if (rectCalcHeight >= Vars_Def.posMinY){
//                            function_containAnim(Activity_Interactions.interaction_rect_objectFL, 0, 400, interpolator_bounce);
//                            function_rectObjAnim(Activity_Interactions.interaction_rect_objectFL_contain, (int) rectCalcHeight, Vars_Def.heightMin, 400, interpolator_bounce);
                        }
                        Vars_Def.container_bool = true;
                        Pannel_ListLayout_Top.container_btn_updown.setRotation(-180);
                    }
                } else {
                    AlphaAnimCusEase(Activity_Interactions.interaction_dimmed, 0, 400, AnimRectObject.interpolator_easeOut);
                    function_containAnim(Pannel_Layout.container, Vars_Def.posMinY, 400, AnimRectObject.interpolator_bounce2);
                    if (Pannel_Layout.container.getY() <= Vars_Def.posMinY){
//                        function_containAnim(Activity_Interactions.interaction_rect_objectFL, 0, 400, interpolator_bounce);
//                        function_rectObjAnim(Activity_Interactions.interaction_rect_objectFL_contain, (int) rectCalcHeight, Vars_Def.heightMax, 400, interpolator_bounce);
                    }
                    Vars_Def.container_bool = false;
                    Pannel_ListLayout_Top.container_btn_updown.setRotation(0);
                }
                move = false;
                break;
        }
        Pannel_Layout.container.invalidate();
        return true;
    }

    public static void function_containAnim(View view, float n, int duration, Interpolator interpolator){
        ObjectAnimator containAnim = ObjectAnimator.ofFloat(view, "translationY", n);
        containAnim.setInterpolator(interpolator);
        containAnim.setDuration(duration);
        containAnim.start();
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