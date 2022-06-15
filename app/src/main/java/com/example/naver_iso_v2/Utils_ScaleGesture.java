package com.example.naver_iso_v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

import androidx.core.view.MotionEventCompat;

import java.util.Objects;

public class Utils_ScaleGesture extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    protected Context ctx;
    private ScaleGestureDetector mScaleGestureDetector;
    private static final float MAX_ZOOM = 2.5f;
    private static final float MIN_ZOOM = 0.5f;
    private float mScaleFactor = 1.0f;
    ImageView v;

    public Utils_ScaleGesture(ImageView view) {
        v = view;
    }

    @Override
    public boolean onScale(ScaleGestureDetector detector){
        mScaleFactor *= detector.getScaleFactor();
        mScaleFactor = Math.max(MIN_ZOOM, Math.min(mScaleFactor, MAX_ZOOM));
        v.setScaleX(mScaleFactor);
        v.setScaleY(mScaleFactor);
        v.invalidate();
        return true;
    }
    @Override
    public boolean onScaleBegin(ScaleGestureDetector detector) {

        return true;
    }

    @Override
    public void onScaleEnd(ScaleGestureDetector detector) {

    }
}
