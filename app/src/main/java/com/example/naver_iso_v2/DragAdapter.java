package com.example.naver_iso_v2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
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
                MainActivity.rect_objectFL_Copy.setY( Vars_Def.posMaxY );
                rectCalcHeight = Vars_Def.posMaxY;
                break;
            case MotionEvent.ACTION_POINTER_DOWN:
                firstY = curY;
                move = false;
                MainActivity.rect_objectFL_Copy.setY( Vars_Def.posMaxY );
                rectCalcHeight = Vars_Def.posMaxY;
                break;
            case MotionEvent.ACTION_POINTER_UP:
                if (move){
                    if (((Vars_Def.heightMax-Vars_Def.heightMin)/1.75) > moveY){
                        if (MainActivity.rect_objectFL_Copy.getHeight() >= (int) rectCalcHeight){
                            function_containAnim(Pannel_Layout.container, Vars_Def.posMaxY, 400, interpolator_bounce);
                            if (rectCalcHeight >= Vars_Def.posMinY){
                                function_containAnim(MainActivity.rect_objectFL, 0, 400, interpolator_bounce);
                                function_rectObjAnim(MainActivity.rect_objectFL_Copy, (int) rectCalcHeight, Vars_Def.heightMin, 400, interpolator_bounce);
                            }
                            Vars_Def.container_bool = true;
                            Pannel_ListLayout_Top.container_btn_updown.setRotation(-180);
                        }
                    } else {
                        function_containAnim(Pannel_Layout.container, Vars_Def.posMinY, 400, interpolator_bounce);
                        if (Pannel_Layout.container.getY() <= Vars_Def.posMinY){
                            function_containAnim(MainActivity.rect_objectFL, 0, 400, interpolator_bounce);
                            function_rectObjAnim(MainActivity.rect_objectFL_Copy, (int) rectCalcHeight, Vars_Def.heightMax, 400, interpolator_bounce);
                        }
                        Vars_Def.container_bool = false;
                        Pannel_ListLayout_Top.container_btn_updown.setRotation(0);
                    }
                }
                move = false;
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
                            function_rectObjAnim(MainActivity.rect_objectFL_Copy, (int) rectCalcHeight, (int) rectCalcHeight, 0, interpolator_bounce);
                        }
                    }
                }
                Pannel_Layout.container.invalidate();
                break;
            case MotionEvent.ACTION_UP:
                if (move){
                    if (((Vars_Def.heightMax-Vars_Def.heightMin)/1.75) > moveY){
                        if (MainActivity.rect_objectFL_Copy.getHeight() >= (int) rectCalcHeight){
                            function_containAnim(Pannel_Layout.container, Vars_Def.posMaxY, 400, interpolator_bounce);
                            if (rectCalcHeight >= Vars_Def.posMinY){
                                function_containAnim(MainActivity.rect_objectFL, 0, 400, interpolator_bounce);
                                function_rectObjAnim(MainActivity.rect_objectFL_Copy, (int) rectCalcHeight, Vars_Def.heightMin, 400, interpolator_bounce);
                            }
                            Vars_Def.container_bool = true;
                            Pannel_ListLayout_Top.container_btn_updown.setRotation(-180);
                        }
                    } else {
                        function_containAnim(Pannel_Layout.container, Vars_Def.posMinY, 400, interpolator_bounce);
                        if (Pannel_Layout.container.getY() <= Vars_Def.posMinY){
                            function_containAnim(MainActivity.rect_objectFL, 0, 400, interpolator_bounce);
                            function_rectObjAnim(MainActivity.rect_objectFL_Copy, (int) rectCalcHeight, Vars_Def.heightMax, 400, interpolator_bounce);
                        }
                        Vars_Def.container_bool = false;
                        Pannel_ListLayout_Top.container_btn_updown.setRotation(0);
                    }
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