package com.example.naver_iso_v2;

import static android.provider.Settings.System.getString;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;

public class Pannel_ListLayout_Top extends RelativeLayout {

    public Context ctx;
    public Button button_playmotion;
    public static View container_btn_updown;
    public TransitionDrawable button_playmotion_trans;

    public Pannel_ListLayout_Top(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public Pannel_ListLayout_Top(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public Pannel_ListLayout_Top(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Pannel_ListLayout_Top(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.pannel_layout_top, this, false);
        addView(v);

        container_btn_updown = (View) findViewById(R.id.container_btn_updown);

        button_playmotion = findViewById(R.id.button_playmotion);
        button_playmotion_trans = (TransitionDrawable) button_playmotion.getBackground();

        button_playmotion.setText("Play in Motion");
        button_playmotion_trans.resetTransition();
        button_playmotion.setTextColor(Color.parseColor("#ffffff"));
        Vars_Def.playMotionState = "In";

        button_playmotion.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!Vars_Def.play_btn_state){
                    button_playmotion.setText("Play Out Motion");
                    button_playmotion_trans.startTransition(100);
                    button_playmotion.setTextColor(Color.parseColor("#ffffff"));
                    Vars_Def.play_btn_state= true;
                    Vars_Def.playMotionState = "Out";
                } else {
                    button_playmotion.setText("Play In Motion");
                    button_playmotion_trans.reverseTransition(100);
                    button_playmotion.setTextColor(Color.parseColor("#ffffff"));
                    Vars_Def.play_btn_state = false;
                    Vars_Def.playMotionState = "In";
                }
            }
        });

        container_btn_updown.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!Vars_Def.container_bool){
                    DragAdapter.function_containAnim(Pannel_Layout.container, Vars_Def.posMaxY, 400, AnimRectObject.interpolator_easeOut);
                    DragAdapter.function_rectObjAnim(MainActivity.rect_objectFL_Copy, Vars_Def.heightMax, Vars_Def.heightMin, 400, AnimRectObject.interpolator_easeOut);
                    Vars_Def.container_bool = true;
                    container_btn_updown.setRotation(-180);
                } else {
                    DragAdapter.function_containAnim(Pannel_Layout.container, Vars_Def.posMinY, 400, AnimRectObject.interpolator_easeOut);
                    DragAdapter.function_rectObjAnim(MainActivity.rect_objectFL_Copy, Vars_Def.heightMin, Vars_Def.heightMax, 400, AnimRectObject.interpolator_easeOut);
                    Vars_Def.container_bool = false;
                    container_btn_updown.setRotation(0);
                }
            }
        });
    }
}
