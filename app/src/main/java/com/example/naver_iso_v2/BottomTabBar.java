package com.example.naver_iso_v2;

import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.List;


public class BottomTabBar extends RelativeLayout  implements View.OnClickListener {

    public Context ctx;
    public static List<Button> bottomTabBar_Array = new ArrayList<Button>();
    public static List<TransitionDrawable> bottomTabBar_Trans_Array = new ArrayList<TransitionDrawable>();

    public static int clickIdx = 0;

    private final int FRAGMENT0 = 0;
    private final int FRAGMENT1 = 1;
    private final int FRAGMENT2 = 2;

    public static Button bottom_btn_0;
    public static Button bottom_btn_1;
    public static Button bottom_btn_2;

    public static TransitionDrawable trans_bottom_btn_0;
    public static TransitionDrawable trans_bottom_btn_1;
    public static TransitionDrawable trans_bottom_btn_2;

    public Fragment_0_Popup fragment0;
    public Fragment_1_Nudge fragment1;
    public Fragment_2_Alarm fragment2;

    public BottomTabBar(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public BottomTabBar(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public BottomTabBar(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public BottomTabBar(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.bottom_tab_layout, this, false);
        addView(v);

        Vars_Def.bottom_rectHeight = Utils_Calc.dpToPx(94);
        Vars_Def.bottom_top_margin = Utils_Calc.dpToPx((int) 16.75);
        Vars_Def.shadowHeight = Utils_Calc.dpToPx(12);

        bottom_btn_0 = findViewById(R.id.bottom_btn_0);
        bottom_btn_1 = findViewById(R.id.bottom_btn_1);
        bottom_btn_2 = findViewById(R.id.bottom_btn_2);

        bottom_btn_0.setOnClickListener(this);
        bottom_btn_1.setOnClickListener(this);
        bottom_btn_2.setOnClickListener(this);

        trans_bottom_btn_0 = (TransitionDrawable) bottom_btn_0.getBackground();
        trans_bottom_btn_1 = (TransitionDrawable) bottom_btn_1.getBackground();
        trans_bottom_btn_2 = (TransitionDrawable) bottom_btn_2.getBackground();

        bottomTabBar_Array.add(bottom_btn_0);
        bottomTabBar_Array.add(bottom_btn_1);
        bottomTabBar_Array.add(bottom_btn_2);

        bottomTabBar_Trans_Array.add(trans_bottom_btn_0);
        bottomTabBar_Trans_Array.add(trans_bottom_btn_1);
        bottomTabBar_Trans_Array.add(trans_bottom_btn_2);

        fragment0 = new Fragment_0_Popup();
        fragment1 = new Fragment_1_Nudge();
        fragment2 = new Fragment_2_Alarm();

        bottomCase(0);

    }

    private void bottomCase(int idx){
        clickIdx = idx;
        for (int i = 0; i < bottomTabBar_Array.size(); i++) {
            if (i == idx){
                clickIdx = idx;
                bottomTabBar_Array.get(idx).setTextColor(ctx.getResources().getColorStateList(R.color.white));
                bottomTabBar_Trans_Array.get(idx).startTransition(0);
            } else {
                bottomTabBar_Array.get(i).setTextColor(ctx.getResources().getColorStateList(R.color.black));
                bottomTabBar_Trans_Array.get(i).resetTransition();
            }
        }
        categorySel(idx);
        Pannel_ListLayout_Top.playbtnReset();
        if(idx == 0){ ((FragmentActivity)ctx).getSupportFragmentManager().beginTransaction().replace(R.id.rect_objectRL, fragment0).commit(); }
        if(idx == 1){ ((FragmentActivity)ctx).getSupportFragmentManager().beginTransaction().replace(R.id.rect_objectRL, fragment1).commit(); }
        if(idx == 2){ ((FragmentActivity)ctx).getSupportFragmentManager().beginTransaction().replace(R.id.rect_objectRL, fragment2).commit(); }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bottom_btn_0 :
                bottomCase(0);
                break;
            case R.id.bottom_btn_1 :
                bottomCase(1);
                break;
            case R.id.bottom_btn_2 :
                bottomCase(2);
                break;
        }
    }

    public void categorySel(int nums){
        switch(nums) {
            case 0:
                ResetState.defCaseState00();
                break;
            case 1:
                ResetState.defCaseState01();
                break;
            case 2:
                ResetState.defCaseState02();
                break;
        }
    }
}

