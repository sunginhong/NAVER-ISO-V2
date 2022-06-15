package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Bundle;
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
    public PhotoView_Custom popup_v2_imageView;


    public Fragment_0_Popup_v2() {
        init();
    }

    @NonNull
    @Override
    public View onCreateView( @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_0_popup_v2, container, false);
        ctx = container.getContext();
        popup_v2_imageView = view.findViewById(R.id.popup_v2_imageView);
        popup_v2_imageView.setImageURI(Activity_Interactions.imageUri);

        return view;
    }
    private void init() {

    }

}