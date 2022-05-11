package com.example.naver_iso_v2;

import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

public class Pannel_ListLayout_OutMotion extends RelativeLayout implements View.OnClickListener {

    public Context ctx;

    public static View code_review2;

    public static LinearLayout out_motion_li0_btncase0;
    public static LinearLayout out_motion_li0_btncase1;
    public static LinearLayout out_motion_li0_btncase2;
    public static LinearLayout out_motion_li1_btncase0;
    public static LinearLayout out_motion_li1_btncase1;
    public static LinearLayout out_motion_li2_btncase0;
    public static LinearLayout out_motion_li2_btncase1;
    public static LinearLayout out_motion_li2_btncase2;
    public static LinearLayout out_motion_li2_btncase3;
    public static LinearLayout out_motion_li3_btncase0;
    public static LinearLayout out_motion_li3_btncase1;
    public static LinearLayout out_motion_li3_btncase2;
    public static LinearLayout out_motion_li3_btncase3;
    public static LinearLayout out_motion_li4_btncase0;
    public static LinearLayout out_motion_li4_btncase1;
    public static LinearLayout out_motion_li4_btncase2;
    public static LinearLayout out_motion_li4_btncase3;
    public static LinearLayout out_motion_li5_btncase0;
    public static LinearLayout out_motion_li5_btncase1;
    public static LinearLayout out_motion_li5_btncase2;
    public static LinearLayout out_motion_li5_btncase3;

    public static SquareButton out_motion_li0_btncase0_radio;
    public static SquareButton out_motion_li0_btncase1_radio;
    public static SquareButton out_motion_li0_btncase2_radio;
    public static SquareButton out_motion_li1_btncase0_radio;
    public static SquareButton out_motion_li1_btncase1_radio;
    public static SquareButton out_motion_li2_btncase0_radio;
    public static SquareButton out_motion_li2_btncase1_radio;
    public static SquareButton out_motion_li2_btncase2_radio;
    public static SquareButton out_motion_li2_btncase3_radio;
    public static SquareButton out_motion_li3_btncase0_radio;
    public static SquareButton out_motion_li3_btncase1_radio;
    public static SquareButton out_motion_li3_btncase2_radio;
    public static SquareButton out_motion_li3_btncase3_radio;
    public static SquareButton out_motion_li4_btncase0_radio;
    public static SquareButton out_motion_li4_btncase1_radio;
    public static SquareButton out_motion_li4_btncase2_radio;
    public static SquareButton out_motion_li4_btncase3_radio;
    public static SquareButton out_motion_li5_btncase0_radio;
    public static SquareButton out_motion_li5_btncase1_radio;
    public static SquareButton out_motion_li5_btncase2_radio;
    public static SquareButton out_motion_li5_btncase3_radio;

    public static TransitionDrawable out_motion_li0_btncase0_radio_trans;
    public static TransitionDrawable out_motion_li0_btncase1_radio_trans;
    public static TransitionDrawable out_motion_li0_btncase2_radio_trans;
    public static TransitionDrawable out_motion_li1_btncase0_radio_trans;
    public static TransitionDrawable out_motion_li1_btncase1_radio_trans;
    public static TransitionDrawable out_motion_li2_btncase0_radio_trans;
    public static TransitionDrawable out_motion_li2_btncase1_radio_trans;
    public static TransitionDrawable out_motion_li2_btncase2_radio_trans;
    public static TransitionDrawable out_motion_li2_btncase3_radio_trans;
    public static TransitionDrawable out_motion_li3_btncase0_radio_trans;
    public static TransitionDrawable out_motion_li3_btncase1_radio_trans;
    public static TransitionDrawable out_motion_li3_btncase2_radio_trans;
    public static TransitionDrawable out_motion_li3_btncase3_radio_trans;
    public static TransitionDrawable out_motion_li4_btncase0_radio_trans;
    public static TransitionDrawable out_motion_li4_btncase1_radio_trans;
    public static TransitionDrawable out_motion_li4_btncase2_radio_trans;
    public static TransitionDrawable out_motion_li4_btncase3_radio_trans;
    public static TransitionDrawable out_motion_li5_btncase0_radio_trans;
    public static TransitionDrawable out_motion_li5_btncase1_radio_trans;
    public static TransitionDrawable out_motion_li5_btncase2_radio_trans;
    public static TransitionDrawable out_motion_li5_btncase3_radio_trans;

    public static TextView out_motion_li0_btncase0_text;
    public static TextView out_motion_li0_btncase1_text;
    public static TextView out_motion_li0_btncase2_text;
    public static TextView out_motion_li1_btncase0_text;
    public static TextView out_motion_li1_btncase1_text;
    public static TextView out_motion_li2_btncase0_text;
    public static TextView out_motion_li2_btncase1_text;
    public static TextView out_motion_li2_btncase2_text;
    public static TextView out_motion_li2_btncase3_text;
    public static TextView out_motion_li3_btncase0_text;
    public static TextView out_motion_li3_btncase1_text;
    public static TextView out_motion_li3_btncase2_text;
    public static TextView out_motion_li3_btncase3_text;
    public static TextView out_motion_li4_btncase0_text;
    public static TextView out_motion_li4_btncase1_text;
    public static TextView out_motion_li4_btncase2_text;
    public static TextView out_motion_li4_btncase3_text;
    public static TextView out_motion_li5_btncase0_text;
    public static TextView out_motion_li5_btncase1_text;
    public static TextView out_motion_li5_btncase2_text;
    public static TextView out_motion_li5_btncase3_text;

    public Pannel_ListLayout_OutMotion(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public Pannel_ListLayout_OutMotion(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public Pannel_ListLayout_OutMotion(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Pannel_ListLayout_OutMotion(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.pannel_layout_out_motion, this, false);
        addView(v);

        code_review2 = findViewById(R.id.code_review2);

        Vars_Def.array_string_easeType = getResources().getStringArray(R.array.string_easeType);
        Vars_Def.inMotion_li4_state = Vars_Def.array_string_easeType[0];
        Vars_Def.outMotion_li4_state = Vars_Def.array_string_easeType[0];

        out_motion_li0_btncase0 = findViewById(R.id.out_motion_li0_btncase0);
        out_motion_li0_btncase1 = findViewById(R.id.out_motion_li0_btncase1);
        out_motion_li0_btncase2 = findViewById(R.id.out_motion_li0_btncase2);
        out_motion_li1_btncase0 = findViewById(R.id.out_motion_li1_btncase0);
        out_motion_li1_btncase1 = findViewById(R.id.out_motion_li1_btncase1);
        out_motion_li2_btncase0 = findViewById(R.id.out_motion_li2_btncase0);
        out_motion_li2_btncase1 = findViewById(R.id.out_motion_li2_btncase1);
        out_motion_li2_btncase2 = findViewById(R.id.out_motion_li2_btncase2);
        out_motion_li2_btncase3 = findViewById(R.id.out_motion_li2_btncase3);
        out_motion_li3_btncase0 = findViewById(R.id.out_motion_li3_btncase0);
        out_motion_li3_btncase1 = findViewById(R.id.out_motion_li3_btncase1);
        out_motion_li3_btncase2 = findViewById(R.id.out_motion_li3_btncase2);
        out_motion_li3_btncase3 = findViewById(R.id.out_motion_li3_btncase3);
        out_motion_li4_btncase0 = findViewById(R.id.out_motion_li4_btncase0);
        out_motion_li4_btncase1 = findViewById(R.id.out_motion_li4_btncase1);
        out_motion_li4_btncase2 = findViewById(R.id.out_motion_li4_btncase2);
        out_motion_li4_btncase3 = findViewById(R.id.out_motion_li4_btncase3);
        out_motion_li5_btncase0 = findViewById(R.id.out_motion_li5_btncase0);
        out_motion_li5_btncase1 = findViewById(R.id.out_motion_li5_btncase1);
        out_motion_li5_btncase2 = findViewById(R.id.out_motion_li5_btncase2);
        out_motion_li5_btncase3 = findViewById(R.id.out_motion_li5_btncase3);

        out_motion_li0_btncase0_radio = findViewById(R.id.out_motion_li0_btncase0_radio);
        out_motion_li0_btncase1_radio = findViewById(R.id.out_motion_li0_btncase1_radio);
        out_motion_li0_btncase2_radio = findViewById(R.id.out_motion_li0_btncase2_radio);
        out_motion_li0_btncase0_radio_trans = (TransitionDrawable) out_motion_li0_btncase0_radio.getBackground();
        out_motion_li0_btncase1_radio_trans = (TransitionDrawable) out_motion_li0_btncase1_radio.getBackground();
        out_motion_li0_btncase2_radio_trans = (TransitionDrawable) out_motion_li0_btncase2_radio.getBackground();

        out_motion_li1_btncase0_radio = findViewById(R.id.out_motion_li1_btncase0_radio);
        out_motion_li1_btncase1_radio = findViewById(R.id.out_motion_li1_btncase1_radio);
        out_motion_li1_btncase0_radio_trans = (TransitionDrawable) out_motion_li1_btncase0_radio.getBackground();
        out_motion_li1_btncase1_radio_trans = (TransitionDrawable) out_motion_li1_btncase1_radio.getBackground();

        out_motion_li2_btncase0_radio = findViewById(R.id.out_motion_li2_btncase0_radio);
        out_motion_li2_btncase1_radio = findViewById(R.id.out_motion_li2_btncase1_radio);
        out_motion_li2_btncase2_radio = findViewById(R.id.out_motion_li2_btncase2_radio);
        out_motion_li2_btncase3_radio = findViewById(R.id.out_motion_li2_btncase3_radio);
        out_motion_li2_btncase0_radio_trans = (TransitionDrawable) out_motion_li2_btncase0_radio.getBackground();
        out_motion_li2_btncase1_radio_trans = (TransitionDrawable) out_motion_li2_btncase1_radio.getBackground();
        out_motion_li2_btncase2_radio_trans = (TransitionDrawable) out_motion_li2_btncase2_radio.getBackground();
        out_motion_li2_btncase3_radio_trans = (TransitionDrawable) out_motion_li2_btncase3_radio.getBackground();

        out_motion_li3_btncase0_radio = findViewById(R.id.out_motion_li3_btncase0_radio);
        out_motion_li3_btncase1_radio = findViewById(R.id.out_motion_li3_btncase1_radio);
        out_motion_li3_btncase2_radio = findViewById(R.id.out_motion_li3_btncase2_radio);
        out_motion_li3_btncase3_radio = findViewById(R.id.out_motion_li3_btncase3_radio);
        out_motion_li3_btncase0_radio_trans = (TransitionDrawable) out_motion_li3_btncase0_radio.getBackground();
        out_motion_li3_btncase1_radio_trans = (TransitionDrawable) out_motion_li3_btncase1_radio.getBackground();
        out_motion_li3_btncase2_radio_trans = (TransitionDrawable) out_motion_li3_btncase2_radio.getBackground();
        out_motion_li3_btncase3_radio_trans = (TransitionDrawable) out_motion_li3_btncase3_radio.getBackground();

        out_motion_li4_btncase0_radio = findViewById(R.id.out_motion_li4_btncase0_radio);
        out_motion_li4_btncase1_radio = findViewById(R.id.out_motion_li4_btncase1_radio);
        out_motion_li4_btncase2_radio = findViewById(R.id.out_motion_li4_btncase2_radio);
        out_motion_li4_btncase3_radio = findViewById(R.id.out_motion_li4_btncase3_radio);
        out_motion_li4_btncase0_radio_trans = (TransitionDrawable) out_motion_li4_btncase0_radio.getBackground();
        out_motion_li4_btncase1_radio_trans = (TransitionDrawable) out_motion_li4_btncase1_radio.getBackground();
        out_motion_li4_btncase2_radio_trans = (TransitionDrawable) out_motion_li4_btncase2_radio.getBackground();
        out_motion_li4_btncase3_radio_trans = (TransitionDrawable) out_motion_li4_btncase3_radio.getBackground();

        out_motion_li5_btncase0_radio = findViewById(R.id.out_motion_li5_btncase0_radio);
        out_motion_li5_btncase1_radio = findViewById(R.id.out_motion_li5_btncase1_radio);
        out_motion_li5_btncase2_radio = findViewById(R.id.out_motion_li5_btncase2_radio);
        out_motion_li5_btncase3_radio = findViewById(R.id.out_motion_li5_btncase3_radio);
        out_motion_li5_btncase0_radio_trans = (TransitionDrawable) out_motion_li5_btncase0_radio.getBackground();
        out_motion_li5_btncase1_radio_trans = (TransitionDrawable) out_motion_li5_btncase1_radio.getBackground();
        out_motion_li5_btncase2_radio_trans = (TransitionDrawable) out_motion_li5_btncase2_radio.getBackground();
        out_motion_li5_btncase3_radio_trans = (TransitionDrawable) out_motion_li5_btncase3_radio.getBackground();

        out_motion_li0_btncase0_text = findViewById(R.id.out_motion_li0_btncase0_text);
        out_motion_li0_btncase1_text = findViewById(R.id.out_motion_li0_btncase1_text);
        out_motion_li0_btncase2_text = findViewById(R.id.out_motion_li0_btncase2_text);
        out_motion_li1_btncase0_text = findViewById(R.id.out_motion_li1_btncase0_text);
        out_motion_li1_btncase1_text = findViewById(R.id.out_motion_li1_btncase1_text);
        out_motion_li2_btncase0_text = findViewById(R.id.out_motion_li2_btncase0_text);
        out_motion_li2_btncase1_text = findViewById(R.id.out_motion_li2_btncase1_text);
        out_motion_li2_btncase2_text = findViewById(R.id.out_motion_li2_btncase2_text);
        out_motion_li2_btncase3_text = findViewById(R.id.out_motion_li2_btncase3_text);
        out_motion_li3_btncase0_text = findViewById(R.id.out_motion_li3_btncase0_text);
        out_motion_li3_btncase1_text = findViewById(R.id.out_motion_li3_btncase1_text);
        out_motion_li3_btncase2_text = findViewById(R.id.out_motion_li3_btncase2_text);
        out_motion_li3_btncase3_text = findViewById(R.id.out_motion_li3_btncase3_text);
        out_motion_li4_btncase0_text = findViewById(R.id.out_motion_li4_btncase0_textView);
        out_motion_li4_btncase1_text = findViewById(R.id.out_motion_li4_btncase1_textView);
        out_motion_li4_btncase2_text = findViewById(R.id.out_motion_li4_btncase2_textView);
        out_motion_li4_btncase3_text = findViewById(R.id.out_motion_li4_btncase3_textView);
        out_motion_li5_btncase0_text = findViewById(R.id.out_motion_li5_btncase0_text);
        out_motion_li5_btncase1_text = findViewById(R.id.out_motion_li5_btncase1_text);
        out_motion_li5_btncase2_text = findViewById(R.id.out_motion_li5_btncase2_text);
        out_motion_li5_btncase3_text = findViewById(R.id.out_motion_li5_btncase3_text);

        out_motion_li4_btncase0_text.setText(Vars_Def.array_string_easeType[0]);
        out_motion_li4_btncase1_text.setText(Vars_Def.array_string_easeType[1]);
        out_motion_li4_btncase2_text.setText(Vars_Def.array_string_easeType[2]);
        out_motion_li4_btncase3_text.setText(Vars_Def.array_string_easeType[3]);

        ClickAdapter_OutMotion_Li0 clickAdapter_outMotion_Li0 = new ClickAdapter_OutMotion_Li0(ctx);
        out_motion_li0_btncase0.setOnClickListener(clickAdapter_outMotion_Li0);
        out_motion_li0_btncase1.setOnClickListener(clickAdapter_outMotion_Li0);
        out_motion_li0_btncase2.setOnClickListener(clickAdapter_outMotion_Li0);

        ClickAdapter_OutMotion_Li1 clickAdapter_outMotion_Li1 = new ClickAdapter_OutMotion_Li1(ctx);
        out_motion_li1_btncase0.setOnClickListener(clickAdapter_outMotion_Li1);
        out_motion_li1_btncase1.setOnClickListener(clickAdapter_outMotion_Li1);

        ClickAdapter_OutMotion_Li2 clickAdapter_outMotion_Li2 = new ClickAdapter_OutMotion_Li2(ctx);
        out_motion_li2_btncase0.setOnClickListener(clickAdapter_outMotion_Li2);
        out_motion_li2_btncase1.setOnClickListener(clickAdapter_outMotion_Li2);
        out_motion_li2_btncase2.setOnClickListener(clickAdapter_outMotion_Li2);
        out_motion_li2_btncase3.setOnClickListener(clickAdapter_outMotion_Li2);

        ClickAdapter_OutMotion_Li3 clickAdapter_outMotion_Li3 = new ClickAdapter_OutMotion_Li3(ctx);
        out_motion_li3_btncase0.setOnClickListener(clickAdapter_outMotion_Li3);
        out_motion_li3_btncase1.setOnClickListener(clickAdapter_outMotion_Li3);
        out_motion_li3_btncase2.setOnClickListener(clickAdapter_outMotion_Li3);
        out_motion_li3_btncase3.setOnClickListener(clickAdapter_outMotion_Li3);

        ClickAdapter_OutMotion_Li4 clickAdapter_outMotion_Li4 = new ClickAdapter_OutMotion_Li4(ctx);
        out_motion_li4_btncase0.setOnClickListener(clickAdapter_outMotion_Li4);
        out_motion_li4_btncase1.setOnClickListener(clickAdapter_outMotion_Li4);
        out_motion_li4_btncase2.setOnClickListener(clickAdapter_outMotion_Li4);
        out_motion_li4_btncase3.setOnClickListener(clickAdapter_outMotion_Li4);

        ClickAdapter_OutMotion_Li5 clickAdapter_outMotion_Li5 = new ClickAdapter_OutMotion_Li5(ctx);
        out_motion_li5_btncase0.setOnClickListener(clickAdapter_outMotion_Li5);
        out_motion_li5_btncase1.setOnClickListener(clickAdapter_outMotion_Li5);
        out_motion_li5_btncase2.setOnClickListener(clickAdapter_outMotion_Li5);
        out_motion_li5_btncase3.setOnClickListener(clickAdapter_outMotion_Li5);

        code_review2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!Vars_Def.codePage){
                    MainActivity.pannel_result.setX(0);
                    Utils_Anim.TransAlphaAnim(MainActivity.main_contain, 0, -Vars_Def.screenWidth/2, 0, 0, 1, 0.5f, 500);
                    Utils_Anim.TransAnim(MainActivity.pannel_result, Vars_Def.screenWidth, 0, 0, 0, 400);
                    Vars_Def.codePage = true;
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }
}
