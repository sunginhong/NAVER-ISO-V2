package com.example.naver_iso_v2.TYPE1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.core.view.MotionEventCompat;
import androidx.viewpager.widget.ViewPager;

public class Fragment_3_ViewPager_Custom extends ViewPager {
    private static final int OFF_SET=10;
    private float preX = 0;

    public Fragment_3_ViewPager_Custom(Context context){
        super(context);
    }

    public Fragment_3_ViewPager_Custom(Context context, AttributeSet attrs){
        super(context,attrs);
    }
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev){
        final int action = ev.getAction()& MotionEventCompat.ACTION_MASK;
        switch (action){
            case MotionEvent.ACTION_DOWN:
                preX=ev.getX();
                Fragment_3_ViewPager.swipeBool = true;
                break;

            case MotionEvent.ACTION_MOVE:
                float x = ev.getX();
//                Fragment_3_ViewPager.swipeBool = false;
                if((x-OFF_SET<=preX&&preX<=x+OFF_SET)){

                    return false;
                }else{

                    return true;
                }

            case MotionEvent.ACTION_UP:
                Fragment_3_ViewPager.swipeBool = false;
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }
}
