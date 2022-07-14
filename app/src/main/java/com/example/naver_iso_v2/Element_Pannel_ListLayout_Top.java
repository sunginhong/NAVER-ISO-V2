package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

public class Element_Pannel_ListLayout_Top extends RelativeLayout {

    public Context ctx;
    public static TextView element_anim_title;
    public static LinearLayout element_anim_backbtn;
    public static View element_btn_trigger;

    public Element_Pannel_ListLayout_Top(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public Element_Pannel_ListLayout_Top(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public Element_Pannel_ListLayout_Top(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Element_Pannel_ListLayout_Top(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.element_pannel_layout_top, this, false);
        addView(v);

        element_anim_title = (TextView) findViewById(R.id.element_anim_title);
        element_anim_backbtn = (LinearLayout) findViewById(R.id.element_anim_backbtn);
        element_btn_trigger = (View) findViewById(R.id.element_btn_trigger);

        element_btn_trigger.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!Vars_Def.container_bool){
                    Element_DragAdapter.function_containAnim(Element_Pannel_Layout.element_container, Vars_Def.posMaxY, 400, AnimRectObject.interpolator_easeOut);
                    Vars_Def.container_bool = true;
                    element_btn_trigger.setRotation(-180);
                    Element_DragAdapter.function_containAnim(Activity_Element.element_obj_layout, Element_DragAdapter.objPos_max, 400, AnimRectObject.interpolator_easeOut);
//                    Element_DragAdapter.function_HeightAnim(Activity_Element.element_obj_layout, Element_DragAdapter.objHeight_min, 400, AnimRectObject.interpolator_easeOut);
                } else {
                    Element_DragAdapter.function_containAnim(Element_Pannel_Layout.element_container, Vars_Def.posMinY, 400, AnimRectObject.interpolator_easeOut);
                    Vars_Def.container_bool = false;
                    element_btn_trigger.setRotation(0);
                    Element_DragAdapter.function_containAnim(Activity_Element.element_obj_layout, Element_DragAdapter.objPos_min, 400, AnimRectObject.interpolator_easeOut);
//                    Element_DragAdapter.function_HeightAnim(Activity_Element.element_obj_layout, Element_DragAdapter.objHeight_max, 400, AnimRectObject.interpolator_easeOut);
                }
            }
        });
    }

    public void objectpPlayAnim(boolean state){
        if (Integer.parseInt(Activity_Interactions.Pos) == 0){ if (state){ new Interaction_PlayAnim(true, Fragment_0_Popup_v2.popup_v2_imageView); } else { new Interaction_PlayAnim(false, Fragment_0_Popup_v2.popup_v2_imageView); } }
        if (Integer.parseInt(Activity_Interactions.Pos) == 1){ if (state){ new Interaction_PlayAnim(true, Fragment_1_Nudge_v2.nudge_v2_imageView); } else { new Interaction_PlayAnim(false, Fragment_1_Nudge_v2.nudge_v2_imageView); } }
        if (Integer.parseInt(Activity_Interactions.Pos) == 2){ if (state){ new Interaction_PlayAnim(true, Fragment_2_Alarm_v2.alarm_v2_imageView); } else { new Interaction_PlayAnim(false, Fragment_2_Alarm_v2.alarm_v2_imageView); } }
    }

    public static void pannelReset(){
        DragAdapter.function_containAnim(Element_Pannel_Layout.element_container, Vars_Def.posMinY, 400, AnimRectObject.interpolator_easeOut);
//        DragAdapter.function_rectObjAnim(Activity_Element.element_rect_objectFL_contain, Vars_Def.heightMin, Vars_Def.heightMax, 400, AnimRectObject.interpolator_easeOut);
        Vars_Def.container_bool = false;
        element_btn_trigger.setRotation(0);
    }
}