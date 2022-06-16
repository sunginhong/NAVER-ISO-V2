package com.example.naver_iso_v2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;

public class Pannel_ListLayout_Bottom extends RelativeLayout {

    public Context ctx;
    public static Button button_change_photo;
    public static TransitionDrawable button_change_photo_trans;

    public Pannel_ListLayout_Bottom(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public Pannel_ListLayout_Bottom(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public Pannel_ListLayout_Bottom(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Pannel_ListLayout_Bottom(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.pannel_layout_bottom, this, false);
        addView(v);

        button_change_photo = findViewById(R.id.button_change_photo);
        button_change_photo_trans = (TransitionDrawable) button_change_photo.getBackground();

        button_change_photo.setText("Change Image");
        button_change_photo_trans.resetTransition();
        button_change_photo.setTextColor(Color.parseColor("#ffffff"));
    }

    public static void func_button_change_photo(){
        if (!Vars_Def.photo_changeBtn_state){
            button_change_photo_trans.startTransition(100);
            Vars_Def.photo_changeBtn_state = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    button_change_photo_trans.reverseTransition(100);
                    Vars_Def.photo_changeBtn_state = false;
                }
            }, 100);
        }
    }

}