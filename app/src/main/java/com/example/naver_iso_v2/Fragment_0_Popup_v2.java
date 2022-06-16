package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.naver_iso_v2.PhotoView.PhotoView_Custom;
import com.github.chrisbanes.photoview.PhotoView;
import com.github.chrisbanes.photoview.PhotoViewAttacher;

public class Fragment_0_Popup_v2 extends Fragment {
    public static Context ctx;
    public static PhotoView_Custom popup_v2_imageView;

    public Fragment_0_Popup_v2() {
        init();
    }

    @NonNull
    @Override
    public View onCreateView( @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_0_popup_v2, container, false);
        ctx = container.getContext();
        popup_v2_imageView = view.findViewById(R.id.popup_v2_imageView);
        ResetState.defCaseState00();
        AnimRectObject.function_containAnim(popup_v2_imageView, Float.parseFloat(Vars_Def.inMotion_li1_state +"f"), Float.parseFloat(Vars_Def.inMotion_li2_state +"f"), Float.parseFloat(Vars_Def.inMotion_li3_state +"f"), 0, AnimRectObject.selEase_group1);
        return view;
    }
    private void init() {

    }

    public static void PlayAnim(String state){
        if (state == "Out"){
            AnimRectObject.function_group1_vibrate();
            AnimRectObject.function_containAnim(popup_v2_imageView, Float.parseFloat(Vars_Def.inMotion_li1_state +"f"), Float.parseFloat(Vars_Def.inMotion_li2_state +"f"), Float.parseFloat(Vars_Def.inMotion_li3_state +"f"), 0, AnimRectObject.selEase_group1);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    AnimRectObject.function_containAnim(popup_v2_imageView, Float.parseFloat(0+"f"), Float.parseFloat(1+"f"), Float.parseFloat(1+"f"), Vars_Def.inMotion_li0_state, AnimRectObject.selEase_group1);
                }
            }, 1);
        }
        if (state == "In"){
            AnimRectObject.function_group2_vibrate();
            AnimRectObject.function_containAnim(popup_v2_imageView, Float.parseFloat(Vars_Def.outMotion_li1_state +"f"), Float.parseFloat(Vars_Def.outMotion_li2_state +"f"), Float.parseFloat(Vars_Def.outMotion_li3_state +"f"), Vars_Def.outMotion_li0_state, AnimRectObject.selEase_group2);
        }
    }
}