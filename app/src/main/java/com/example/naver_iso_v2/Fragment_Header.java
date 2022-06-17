package com.example.naver_iso_v2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Fragment_Header extends ConstraintLayout implements View.OnClickListener {

    public Context ctx;
    public static FrameLayout header_int_back;
    TextView header_int_title;
    int Pos = 0;

    public Fragment_Header(Context ctx, int pos){
        super(ctx);
        this.ctx = ctx;
        this.Pos = pos;
        init();
    }

    public Fragment_Header(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public Fragment_Header(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Fragment_Header(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.fragment_header, this, false);
        addView(v);
        header_int_back = v.findViewById(R.id.header_int_back);

        header_int_back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity_Interactions.actFin();
            }
        });
        header_int_title = v.findViewById(R.id.header_int_title);
        func_header_title(Pos);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }

    public void func_header_title(int Pos){
        switch(Pos){
            case 0:
                header_int_title.setText("Interactions");
                break;

            case 1:

                break;

            case 2:

                break;
        }
    }
}