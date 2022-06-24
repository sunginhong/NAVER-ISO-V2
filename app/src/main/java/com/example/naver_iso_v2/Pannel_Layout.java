package com.example.naver_iso_v2;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;

public class Pannel_Layout extends RelativeLayout implements View.OnClickListener {

    public Context ctx;
    public static RelativeLayout container;
    public static Button button_code_review;

    public Pannel_Layout(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public Pannel_Layout(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public Pannel_Layout(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Pannel_Layout(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.pannel_layout, this, false);
        addView(v);

        container = findViewById(R.id.container);
        DragAdapter dragAdapter = new DragAdapter(ctx);
        container.setOnTouchListener(dragAdapter);
        button_code_review = findViewById(R.id.button_code_review);
    }

    public static void setContain(){
        if (!Vars_Def.appStart){
            Vars_Def.appStart = true;
            container.setY(Vars_Def.posMinY);
            Activity_Interactions.interaction_rect_objectFL.setY(0);
        }
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }

}
