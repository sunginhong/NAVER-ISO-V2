package com.example.naver_iso_v2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

public class Pannel_ListLayout_Top extends RelativeLayout {

    public Context ctx;
    public static TextView anim_title;
    public static Button button_playmotion;
    public static View container_btn_updown;
    public static TransitionDrawable button_playmotion_trans;
    public static Vibrator vibrator;

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
        vibrator = (Vibrator) this.ctx.getSystemService(Context.VIBRATOR_SERVICE);
        anim_title = (TextView) findViewById(R.id.anim_title);
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
                objectpPlayAnim(Vars_Def.play_btn_state);
            }
        });

        container_btn_updown.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!Vars_Def.container_bool){
                    DragAdapter.AlphaAnimCusEase(Activity_Interactions.interaction_dimmed, 1, 400, AnimRectObject.interpolator_easeOut);
                    DragAdapter.function_containAnim(Pannel_Layout.container, Vars_Def.posMaxY, 400, AnimRectObject.interpolator_easeOut);
//                    DragAdapter.function_rectObjAnim(Activity_Interactions.interaction_rect_objectFL_contain, Vars_Def.heightMax, Vars_Def.heightMin, 400, AnimRectObject.interpolator_easeOut);
                    Vars_Def.container_bool = true;
                    container_btn_updown.setRotation(-180);
                } else {
                    DragAdapter.AlphaAnimCusEase(Activity_Interactions.interaction_dimmed, 0, 400, AnimRectObject.interpolator_easeOut);
                    DragAdapter.function_containAnim(Pannel_Layout.container, Vars_Def.posMinY, 400, AnimRectObject.interpolator_bounce2);
//                    DragAdapter.function_rectObjAnim(Activity_Interactions.interaction_rect_objectFL_contain, Vars_Def.heightMin, Vars_Def.heightMax, 400, AnimRectObject.interpolator_easeOut);
                    Vars_Def.container_bool = false;
                    container_btn_updown.setRotation(0);
                }
            }
        });
    }

    public static void playbtnReset(){
        button_playmotion.setText("Play In Motion");
        button_playmotion_trans.resetTransition();
        button_playmotion.setTextColor(Color.parseColor("#ffffff"));
        Vars_Def.play_btn_state = false;
        Vars_Def.playMotionState = "In";
    }

    public void objectpPlayAnim(boolean state){
        if (Integer.parseInt(Activity_Interactions.Pos) == 0){ if (state){ new Interaction_PlayAnim(true, Fragment_0_Popup_v2.popup_v2_imageView); } else { new Interaction_PlayAnim(false, Fragment_0_Popup_v2.popup_v2_imageView); } }
        if (Integer.parseInt(Activity_Interactions.Pos) == 1){ if (state){ new Interaction_PlayAnim(true, Fragment_1_Nudge_v2.nudge_v2_imageView); } else { new Interaction_PlayAnim(false, Fragment_1_Nudge_v2.nudge_v2_imageView); } }
        if (Integer.parseInt(Activity_Interactions.Pos) == 2){ if (state){ new Interaction_PlayAnim(true, Fragment_2_Alarm_v2.alarm_v2_imageView); } else { new Interaction_PlayAnim(false, Fragment_2_Alarm_v2.alarm_v2_imageView); } }
    }

    public static void pannelReset(){
        DragAdapter.function_containAnim(Pannel_Layout.container, Vars_Def.posMinY, 400, AnimRectObject.interpolator_easeOut);
        DragAdapter.function_rectObjAnim(Activity_Interactions.interaction_rect_objectFL_contain, Vars_Def.heightMin, Vars_Def.heightMax, 400, AnimRectObject.interpolator_easeOut);
        Vars_Def.container_bool = false;
        container_btn_updown.setRotation(0);
    }
}
