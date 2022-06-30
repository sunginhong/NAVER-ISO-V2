package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;

public class LottieSelBottom_Menu extends RelativeLayout {

    public Context ctx;

    public SquareButton_Icn lottie_color_0;
    public SquareButton_Icn lottie_color_1;
    public SquareButton_Icn lottie_color_2;
    public SquareButton_Icn lottie_color_3;
    public SquareButton_Icn lottie_color_4;

    public static int lottie_color_hex0;
    public static int lottie_color_hex1;
    public static int lottie_color_hex2;
    public static int lottie_color_hex3;
    public static int lottie_color_hex4;
    public static int lottie_color_hex5;

    public LottieSelBottom_Menu(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public LottieSelBottom_Menu(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public LottieSelBottom_Menu(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public LottieSelBottom_Menu(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.activity_lottie_bottom_view, this, false);
        addView(v);

        lottie_color_0 = v.findViewById(R.id.lottie_color_0);
        lottie_color_1 = v.findViewById(R.id.lottie_color_1);
        lottie_color_2 = v.findViewById(R.id.lottie_color_2);
        lottie_color_3 = v.findViewById(R.id.lottie_color_3);
        lottie_color_4 = v.findViewById(R.id.lottie_color_4);

        lottie_color_hex0 = ContextCompat.getColor(ctx, R.color.lottie_color_0);
        lottie_color_hex1 = ContextCompat.getColor(ctx, R.color.lottie_color_1);
        lottie_color_hex2 = ContextCompat.getColor(ctx, R.color.lottie_color_2);
        lottie_color_hex3 = ContextCompat.getColor(ctx, R.color.lottie_color_3);
        lottie_color_hex4 = ContextCompat.getColor(ctx, R.color.lottie_color_4);
        lottie_color_hex5 = ContextCompat.getColor(ctx, R.color.lottie_color_5);
    }
}