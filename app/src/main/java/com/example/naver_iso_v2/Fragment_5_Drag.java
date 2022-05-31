package com.example.naver_iso_v2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

import androidx.fragment.app.Fragment;

public class Fragment_5_Drag extends Fragment implements View.OnTouchListener, View.OnLongClickListener {

    public View anim_object_drag;
    public String firstY = "0";
    float oldX = 0;
    float oldY = 0;
    float curX = 0;
    float curY = 0;
    float moveY = 0;
    float crY = 0;
    boolean move = false;

    public Fragment_5_Drag() {
        init();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_5_drag, container, false);
        anim_object_drag = view.findViewById(R.id.anim_object_drag);
        anim_object_drag.setOnLongClickListener(this);
        anim_object_drag.setOnTouchListener(this);
        return view;
    }

    private void init() {

    }

    @Override
    public boolean onLongClick(View view) {

        return true;
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        String curXs = String.format("%.2f", event.getX());
        String curYs = String.format("%.2f", event.getY());
        int viewHeight = view.getHeight();
        int viewWidth = view.getWidth();

        switch (event.getAction() & MotionEvent.ACTION_MASK) {

            case MotionEvent.ACTION_DOWN:
                move = false;
                oldX = event.getX();
                oldY = event.getY();
                break;
            case MotionEvent.ACTION_POINTER_DOWN:

                break;
            case MotionEvent.ACTION_POINTER_UP:

                break;
            case MotionEvent.ACTION_MOVE:
                move = true;
                curX = view.getX() + (Float.parseFloat(curXs) - view.getWidth()/2) - (oldX- view.getWidth()/2);
                curY = view.getY() + (Float.parseFloat(curYs) - view.getHeight()/2) - (oldY- view.getHeight()/2);
                if (move){
                    view.setX(curX);
                    view.setY(curY);
                }
                view.invalidate();
                break;
            case MotionEvent.ACTION_UP:
                if (move){
                    ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(anim_object_drag, "translationX", 0);
                    ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(anim_object_drag, "translationY", 0);
                    AnimatorSet viewAnimatorSet = new AnimatorSet();
                    viewAnimatorSet.playTogether(objectAnimator1, objectAnimator2);
                    viewAnimatorSet.setDuration(600);
                    viewAnimatorSet.setInterpolator(new DecelerateInterpolator((float) 1.5));
                    viewAnimatorSet.start();
                    if (Vars_Def.container_bool != true){
                        if (curX < 0 || curX+viewWidth > Vars_Def.screenWidth || curY < 0 || (curY+viewHeight) > Vars_Def.heightMax ){

                        }
                    } else {
                        if (curX < 0 || curX+viewWidth > Vars_Def.screenWidth || curY < 0 || (curY+(viewHeight/1)) > Vars_Def.heightMin ){

                        }
                    }

                }
                move = false;
                break;
        }
        view.invalidate();
        return true;
    }
}