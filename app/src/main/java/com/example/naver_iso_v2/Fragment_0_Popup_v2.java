package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.naver_iso_v2.PhotoView.PhotoView_Custom;

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
        Element_Pannel_Layout.animView = popup_v2_imageView;
        AnimRectObject.function_containAnim(popup_v2_imageView, Float.parseFloat(Elem_Vars_Def.IN_li1_state +"f"), Float.parseFloat(Elem_Vars_Def.IN_li2_state +"f"), Float.parseFloat(Elem_Vars_Def.IN_li3_state +"f"), 0, Elem_Vars_Def.IN_li4_state);
        return view;
    }

    private void init() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Element_ResetState.defCaseState00(ctx);
            }
        }, 400);
    }
}