package com.example.naver_iso_v2;

import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

public class Pannel_ListLayout_InMotion extends RelativeLayout implements View.OnClickListener {

    public Context ctx;

    public static LinearLayout in_motion_li0_btncase0;
    public static LinearLayout in_motion_li0_btncase1;
    public static LinearLayout in_motion_li0_btncase2;
    public static LinearLayout in_motion_li1_btncase0;
    public static LinearLayout in_motion_li1_btncase1;
    public static LinearLayout in_motion_li2_btncase0;
    public static LinearLayout in_motion_li2_btncase1;
    public static LinearLayout in_motion_li2_btncase2;
    public static LinearLayout in_motion_li2_btncase3;
    public static LinearLayout in_motion_li3_btncase0;
    public static LinearLayout in_motion_li3_btncase1;
    public static LinearLayout in_motion_li3_btncase2;
    public static LinearLayout in_motion_li3_btncase3;
    public static LinearLayout in_motion_li4_btncase0;
    public static LinearLayout in_motion_li4_btncase1;
    public static LinearLayout in_motion_li4_btncase2;
    public LinearLayout in_motion_li4_btncase3;
    public static LinearLayout in_motion_li5_btncase0;
    public static LinearLayout in_motion_li5_btncase1;
    public static LinearLayout in_motion_li5_btncase2;
    public static LinearLayout in_motion_li5_btncase3;

    public static SquareButton in_motion_li0_btncase0_radio;
    public static SquareButton in_motion_li0_btncase1_radio;
    public static SquareButton in_motion_li0_btncase2_radio;
    public static SquareButton in_motion_li1_btncase0_radio;
    public static SquareButton in_motion_li1_btncase1_radio;
    public static SquareButton in_motion_li2_btncase0_radio;
    public static SquareButton in_motion_li2_btncase1_radio;
    public static SquareButton in_motion_li2_btncase2_radio;
    public static SquareButton in_motion_li2_btncase3_radio;
    public static SquareButton in_motion_li3_btncase0_radio;
    public static SquareButton in_motion_li3_btncase1_radio;
    public static SquareButton in_motion_li3_btncase2_radio;
    public static SquareButton in_motion_li3_btncase3_radio;
    public static SquareButton in_motion_li4_btncase0_radio;
    public static SquareButton in_motion_li4_btncase1_radio;
    public static SquareButton in_motion_li4_btncase2_radio;
    public static SquareButton in_motion_li4_btncase3_radio;
    public static SquareButton in_motion_li5_btncase0_radio;
    public static SquareButton in_motion_li5_btncase1_radio;
    public static SquareButton in_motion_li5_btncase2_radio;
    public static SquareButton in_motion_li5_btncase3_radio;

    public static TransitionDrawable in_motion_li0_btncase0_radio_trans;
    public static TransitionDrawable in_motion_li0_btncase1_radio_trans;
    public static TransitionDrawable in_motion_li0_btncase2_radio_trans;
    public static TransitionDrawable in_motion_li1_btncase0_radio_trans;
    public static TransitionDrawable in_motion_li1_btncase1_radio_trans;
    public static TransitionDrawable in_motion_li2_btncase0_radio_trans;
    public static TransitionDrawable in_motion_li2_btncase1_radio_trans;
    public static TransitionDrawable in_motion_li2_btncase2_radio_trans;
    public static TransitionDrawable in_motion_li2_btncase3_radio_trans;
    public static TransitionDrawable in_motion_li3_btncase0_radio_trans;
    public static TransitionDrawable in_motion_li3_btncase1_radio_trans;
    public static TransitionDrawable in_motion_li3_btncase2_radio_trans;
    public static TransitionDrawable in_motion_li3_btncase3_radio_trans;
    public static TransitionDrawable in_motion_li4_btncase0_radio_trans;
    public static TransitionDrawable in_motion_li4_btncase1_radio_trans;
    public static TransitionDrawable in_motion_li4_btncase2_radio_trans;
    public static TransitionDrawable in_motion_li4_btncase3_radio_trans;
    public static TransitionDrawable in_motion_li5_btncase0_radio_trans;
    public static TransitionDrawable in_motion_li5_btncase1_radio_trans;
    public static TransitionDrawable in_motion_li5_btncase2_radio_trans;
    public static TransitionDrawable in_motion_li5_btncase3_radio_trans;
    
    public static TextView in_motion_li0_btncase0_text;
    public static TextView in_motion_li0_btncase1_text;
    public static TextView in_motion_li0_btncase2_text;
    public static TextView in_motion_li1_btncase0_text;
    public static TextView in_motion_li1_btncase1_text;
    public static TextView in_motion_li2_btncase0_text;
    public static TextView in_motion_li2_btncase1_text;
    public static TextView in_motion_li2_btncase2_text;
    public static TextView in_motion_li2_btncase3_text;
    public static TextView in_motion_li3_btncase0_text;
    public static TextView in_motion_li3_btncase1_text;
    public static TextView in_motion_li3_btncase2_text;
    public static TextView in_motion_li3_btncase3_text;
    public static TextView in_motion_li4_btncase0_text;
    public static TextView in_motion_li4_btncase1_text;
    public static TextView in_motion_li4_btncase2_text;
    public static TextView in_motion_li4_btncase3_text;
    public static TextView in_motion_li5_btncase0_text;
    public static TextView in_motion_li5_btncase1_text;
    public static TextView in_motion_li5_btncase2_text;
    public static TextView in_motion_li5_btncase3_text;

    public Pannel_ListLayout_InMotion(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public Pannel_ListLayout_InMotion(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public Pannel_ListLayout_InMotion(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public Pannel_ListLayout_InMotion(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.pannel_layout_in_motion, this, false);
        addView(v);

        Vars_Def.array_string_easeType = getResources().getStringArray(R.array.string_easeType);
        Vars_Def.inMotion_li4_state = Vars_Def.array_string_easeType[0];
        Vars_Def.outMotion_li4_state = Vars_Def.array_string_easeType[0];

        in_motion_li0_btncase0 = findViewById(R.id.in_motion_li0_btncase0);
        in_motion_li0_btncase1 = findViewById(R.id.in_motion_li0_btncase1);
        in_motion_li0_btncase2 = findViewById(R.id.in_motion_li0_btncase2);
        in_motion_li1_btncase0 = findViewById(R.id.in_motion_li1_btncase0);
        in_motion_li1_btncase1 = findViewById(R.id.in_motion_li1_btncase1);
        in_motion_li2_btncase0 = findViewById(R.id.in_motion_li2_btncase0);
        in_motion_li2_btncase1 = findViewById(R.id.in_motion_li2_btncase1);
        in_motion_li2_btncase2 = findViewById(R.id.in_motion_li2_btncase2);
        in_motion_li2_btncase3 = findViewById(R.id.in_motion_li2_btncase3);
        in_motion_li3_btncase0 = findViewById(R.id.in_motion_li3_btncase0);
        in_motion_li3_btncase1 = findViewById(R.id.in_motion_li3_btncase1);
        in_motion_li3_btncase2 = findViewById(R.id.in_motion_li3_btncase2);
        in_motion_li3_btncase3 = findViewById(R.id.in_motion_li3_btncase3);
        in_motion_li4_btncase0 = findViewById(R.id.in_motion_li4_btncase0);
        in_motion_li4_btncase1 = findViewById(R.id.in_motion_li4_btncase1);
        in_motion_li4_btncase2 = findViewById(R.id.in_motion_li4_btncase2);
        in_motion_li4_btncase3 = findViewById(R.id.in_motion_li4_btncase3);
        in_motion_li5_btncase0 = findViewById(R.id.in_motion_li5_btncase0);
        in_motion_li5_btncase1 = findViewById(R.id.in_motion_li5_btncase1);
        in_motion_li5_btncase2 = findViewById(R.id.in_motion_li5_btncase2);
        in_motion_li5_btncase3 = findViewById(R.id.in_motion_li5_btncase3);

        in_motion_li0_btncase0_radio = findViewById(R.id.in_motion_li0_btncase0_radio);
        in_motion_li0_btncase1_radio = findViewById(R.id.in_motion_li0_btncase1_radio);
        in_motion_li0_btncase2_radio = findViewById(R.id.in_motion_li0_btncase2_radio);
        in_motion_li0_btncase0_radio_trans = (TransitionDrawable) in_motion_li0_btncase0_radio.getBackground();
        in_motion_li0_btncase1_radio_trans = (TransitionDrawable) in_motion_li0_btncase1_radio.getBackground();
        in_motion_li0_btncase2_radio_trans = (TransitionDrawable) in_motion_li0_btncase2_radio.getBackground();

        in_motion_li1_btncase0_radio = findViewById(R.id.in_motion_li1_btncase0_radio);
        in_motion_li1_btncase1_radio = findViewById(R.id.in_motion_li1_btncase1_radio);
        in_motion_li1_btncase0_radio_trans = (TransitionDrawable) in_motion_li1_btncase0_radio.getBackground();
        in_motion_li1_btncase1_radio_trans = (TransitionDrawable) in_motion_li1_btncase1_radio.getBackground();

        in_motion_li2_btncase0_radio = findViewById(R.id.in_motion_li2_btncase0_radio);
        in_motion_li2_btncase1_radio = findViewById(R.id.in_motion_li2_btncase1_radio);
        in_motion_li2_btncase2_radio = findViewById(R.id.in_motion_li2_btncase2_radio);
        in_motion_li2_btncase3_radio = findViewById(R.id.in_motion_li2_btncase3_radio);
        in_motion_li2_btncase0_radio_trans = (TransitionDrawable) in_motion_li2_btncase0_radio.getBackground();
        in_motion_li2_btncase1_radio_trans = (TransitionDrawable) in_motion_li2_btncase1_radio.getBackground();
        in_motion_li2_btncase2_radio_trans = (TransitionDrawable) in_motion_li2_btncase2_radio.getBackground();
        in_motion_li2_btncase3_radio_trans = (TransitionDrawable) in_motion_li2_btncase3_radio.getBackground();

        in_motion_li3_btncase0_radio = findViewById(R.id.in_motion_li3_btncase0_radio);
        in_motion_li3_btncase1_radio = findViewById(R.id.in_motion_li3_btncase1_radio);
        in_motion_li3_btncase2_radio = findViewById(R.id.in_motion_li3_btncase2_radio);
        in_motion_li3_btncase3_radio = findViewById(R.id.in_motion_li3_btncase3_radio);
        in_motion_li3_btncase0_radio_trans = (TransitionDrawable) in_motion_li3_btncase0_radio.getBackground();
        in_motion_li3_btncase1_radio_trans = (TransitionDrawable) in_motion_li3_btncase1_radio.getBackground();
        in_motion_li3_btncase2_radio_trans = (TransitionDrawable) in_motion_li3_btncase2_radio.getBackground();
        in_motion_li3_btncase3_radio_trans = (TransitionDrawable) in_motion_li3_btncase3_radio.getBackground();

        in_motion_li4_btncase0_radio = findViewById(R.id.in_motion_li4_btncase0_radio);
        in_motion_li4_btncase1_radio = findViewById(R.id.in_motion_li4_btncase1_radio);
        in_motion_li4_btncase2_radio = findViewById(R.id.in_motion_li4_btncase2_radio);
        in_motion_li4_btncase3_radio = findViewById(R.id.in_motion_li4_btncase3_radio);
        in_motion_li4_btncase0_radio_trans = (TransitionDrawable) in_motion_li4_btncase0_radio.getBackground();
        in_motion_li4_btncase1_radio_trans = (TransitionDrawable) in_motion_li4_btncase1_radio.getBackground();
        in_motion_li4_btncase2_radio_trans = (TransitionDrawable) in_motion_li4_btncase2_radio.getBackground();
        in_motion_li4_btncase3_radio_trans = (TransitionDrawable) in_motion_li4_btncase3_radio.getBackground();

        in_motion_li5_btncase0_radio = findViewById(R.id.in_motion_li5_btncase0_radio);
        in_motion_li5_btncase1_radio = findViewById(R.id.in_motion_li5_btncase1_radio);
        in_motion_li5_btncase2_radio = findViewById(R.id.in_motion_li5_btncase2_radio);
        in_motion_li5_btncase3_radio = findViewById(R.id.in_motion_li5_btncase3_radio);
        in_motion_li5_btncase0_radio_trans = (TransitionDrawable) in_motion_li5_btncase0_radio.getBackground();
        in_motion_li5_btncase1_radio_trans = (TransitionDrawable) in_motion_li5_btncase1_radio.getBackground();
        in_motion_li5_btncase2_radio_trans = (TransitionDrawable) in_motion_li5_btncase2_radio.getBackground();
        in_motion_li5_btncase3_radio_trans = (TransitionDrawable) in_motion_li5_btncase3_radio.getBackground();

        in_motion_li0_btncase0_text = findViewById(R.id.in_motion_li0_btncase0_text);
        in_motion_li0_btncase1_text = findViewById(R.id.in_motion_li0_btncase1_text);
        in_motion_li0_btncase2_text = findViewById(R.id.in_motion_li0_btncase2_text);
        in_motion_li1_btncase0_text = findViewById(R.id.in_motion_li1_btncase0_text);
        in_motion_li1_btncase1_text = findViewById(R.id.in_motion_li1_btncase1_text);
        in_motion_li2_btncase0_text = findViewById(R.id.in_motion_li2_btncase0_text);
        in_motion_li2_btncase1_text = findViewById(R.id.in_motion_li2_btncase1_text);
        in_motion_li2_btncase2_text = findViewById(R.id.in_motion_li2_btncase2_text);
        in_motion_li2_btncase3_text = findViewById(R.id.in_motion_li2_btncase3_text);
        in_motion_li3_btncase0_text = findViewById(R.id.in_motion_li3_btncase0_text);
        in_motion_li3_btncase1_text = findViewById(R.id.in_motion_li3_btncase1_text);
        in_motion_li3_btncase2_text = findViewById(R.id.in_motion_li3_btncase2_text);
        in_motion_li3_btncase3_text = findViewById(R.id.in_motion_li3_btncase3_text);
        in_motion_li4_btncase0_text = findViewById(R.id.in_motion_li4_btncase0_textView);
        in_motion_li4_btncase1_text = findViewById(R.id.in_motion_li4_btncase1_textView);
        in_motion_li4_btncase2_text = findViewById(R.id.in_motion_li4_btncase2_textView);
        in_motion_li4_btncase3_text = findViewById(R.id.in_motion_li4_btncase3_textView);
        in_motion_li5_btncase0_text = findViewById(R.id.in_motion_li5_btncase0_text);
        in_motion_li5_btncase1_text = findViewById(R.id.in_motion_li5_btncase1_text);
        in_motion_li5_btncase2_text = findViewById(R.id.in_motion_li5_btncase2_text);
        in_motion_li5_btncase3_text = findViewById(R.id.in_motion_li5_btncase3_text);

        in_motion_li4_btncase0_text.setText(Vars_Def.array_string_easeType[0]);
        in_motion_li4_btncase1_text.setText(Vars_Def.array_string_easeType[1]);
        in_motion_li4_btncase2_text.setText(Vars_Def.array_string_easeType[2]);
        in_motion_li4_btncase3_text.setText(Vars_Def.array_string_easeType[3]);

        ClickAdapter_InMotion_Li0 clickAdapter_inMotion_Li0 = new ClickAdapter_InMotion_Li0(ctx);
        in_motion_li0_btncase0.setOnClickListener(clickAdapter_inMotion_Li0);
        in_motion_li0_btncase1.setOnClickListener(clickAdapter_inMotion_Li0);
        in_motion_li0_btncase2.setOnClickListener(clickAdapter_inMotion_Li0);

        ClickAdapter_InMotion_Li1 clickAdapter_inMotion_Li1 = new ClickAdapter_InMotion_Li1(ctx);
        in_motion_li1_btncase0.setOnClickListener(clickAdapter_inMotion_Li1);
        in_motion_li1_btncase1.setOnClickListener(clickAdapter_inMotion_Li1);

        ClickAdapter_InMotion_Li2 clickAdapter_inMotion_Li2 = new ClickAdapter_InMotion_Li2(ctx);
        in_motion_li2_btncase0.setOnClickListener(clickAdapter_inMotion_Li2);
        in_motion_li2_btncase1.setOnClickListener(clickAdapter_inMotion_Li2);
        in_motion_li2_btncase2.setOnClickListener(clickAdapter_inMotion_Li2);
        in_motion_li2_btncase3.setOnClickListener(clickAdapter_inMotion_Li2);

        ClickAdapter_InMotion_Li3 clickAdapter_inMotion_Li3 = new ClickAdapter_InMotion_Li3(ctx);
        in_motion_li3_btncase0.setOnClickListener(clickAdapter_inMotion_Li3);
        in_motion_li3_btncase1.setOnClickListener(clickAdapter_inMotion_Li3);
        in_motion_li3_btncase2.setOnClickListener(clickAdapter_inMotion_Li3);
        in_motion_li3_btncase3.setOnClickListener(clickAdapter_inMotion_Li3);

        ClickAdapter_InMotion_Li4 clickAdapter_inMotion_Li4 = new ClickAdapter_InMotion_Li4(ctx);
        in_motion_li4_btncase0.setOnClickListener(clickAdapter_inMotion_Li4);
        in_motion_li4_btncase1.setOnClickListener(clickAdapter_inMotion_Li4);
        in_motion_li4_btncase2.setOnClickListener(clickAdapter_inMotion_Li4);
        in_motion_li4_btncase3.setOnClickListener(clickAdapter_inMotion_Li4);

        ClickAdapter_InMotion_Li5 clickAdapter_inMotion_Li5 = new ClickAdapter_InMotion_Li5(ctx);
        in_motion_li5_btncase0.setOnClickListener(clickAdapter_inMotion_Li5);
        in_motion_li5_btncase1.setOnClickListener(clickAdapter_inMotion_Li5);
        in_motion_li5_btncase2.setOnClickListener(clickAdapter_inMotion_Li5);
        in_motion_li5_btncase3.setOnClickListener(clickAdapter_inMotion_Li5);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }
}
