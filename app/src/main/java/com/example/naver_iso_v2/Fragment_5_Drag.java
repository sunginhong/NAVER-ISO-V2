package com.example.naver_iso_v2;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment_5_Drag extends Fragment implements View.OnTouchListener, View.OnLongClickListener {

    public View anim_object_drag;
    public String firstY = "0";
    float moveY = 0;
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
        String curY = String.format("%.2f", event.getY());

        switch (event.getAction() & MotionEvent.ACTION_MASK) {

            case MotionEvent.ACTION_DOWN:
                firstY = curY;
                move = false;

                break;
            case MotionEvent.ACTION_POINTER_DOWN:

                break;
            case MotionEvent.ACTION_POINTER_UP:

                break;
            case MotionEvent.ACTION_MOVE:
                move = true;
                moveY = view.getY() + (Float.parseFloat(curY) - Float.parseFloat(firstY));
                if (move){
//                    Log.d("SSSS", "SSSS"+moveY);
                }
                view.invalidate();
                break;
            case MotionEvent.ACTION_UP:
                if (move){

                }
                move = false;
                break;
        }
        view.invalidate();
        return true;
    }
}