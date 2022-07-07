package com.example.naver_iso_v2;

import static com.example.naver_iso_v2.R.*;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import com.google.android.material.tabs.TabLayout;

public class Element_Pannel_Layout extends RelativeLayout implements View.OnClickListener {

    public Context ctx;
    public boolean playMotion = false;
    public static LinearLayout element_container;
    public static LinearLayout element_title_top;
    public static LinearLayout element_container_top;
    public static ImageView elem_bottom_guidebtn;
    public static FrameLayout elem_bottom_playbtn;
    public static TextView elem_bottom_playbtn_txt;
    public static ImageView elem_bottom_imagebtn;
    public static TabLayout element_vp_tab_layout;

    public Element_Pannel_Layout(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public Element_Pannel_Layout(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public Element_Pannel_Layout(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Element_Pannel_Layout(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(layout.element_pannel_layout, this, false);
        addView(v);

        element_container =  v.findViewById(id.element_container);
        element_title_top = v.findViewById(id.element_title_top);
        element_container_top =  v.findViewById(id.element_container_top);
        elem_bottom_guidebtn = v.findViewById(id.elem_bottom_guidebtn);
        elem_bottom_playbtn = v.findViewById(id.elem_bottom_playbtn);
        elem_bottom_playbtn_txt = v.findViewById(R.id.elem_bottom_playbtn_txt);
        elem_bottom_imagebtn = v.findViewById(id.elem_bottom_imagebtn);
        element_vp_tab_layout = v.findViewById(id.element_vp_tab_layout);

        Element_DragAdapter element_dragAdapter = new Element_DragAdapter(ctx);
        element_container.setOnTouchListener(element_dragAdapter);

        elem_bottom_playbtn.setOnClickListener(new OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if (!playMotion){
                    playMotion = true;
                    elem_bottom_playbtn_txt.setText(R.string.paly_out_mo);
                    elem_bottom_playbtn.setBackground(getResources().getDrawable(drawable.element_btn_playmotion_sel));
                } else {
                    playMotion = false;
                    elem_bottom_playbtn_txt.setText(string.paly_in_mot);
                    elem_bottom_playbtn.setBackground(getResources().getDrawable(drawable.element_btn_playmotion_nor));
                }

            }
        });
    }

    public static void setContain(){
        element_container.setY(Vars_Def.posMinY);
        if (!Vars_Def.appStart){
            Vars_Def.appStart = true;

//            Activity_Element.element_rect_objectFL.setY(0);
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }

}