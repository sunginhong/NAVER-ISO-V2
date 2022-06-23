package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;

public class WebView_Header extends ConstraintLayout {

    public Context ctx;
    public static FrameLayout webview_header_int_back;

    public WebView_Header(Context ctx){
        super(ctx);
        this.ctx = ctx;
        init();
    }

    public WebView_Header(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        this.ctx = ctx;
        init();
    }

    public WebView_Header(Context ctx, AttributeSet attrs, int defStyle) {
        super(ctx, attrs, defStyle);
        this.ctx = ctx;
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public WebView_Header(Context ctx, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(ctx, attrs, defStyleAttr, defStyleRes);
        this.ctx = ctx;
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(infService);
        View v = li.inflate(R.layout.webview_header, this, false);
        addView(v);
        webview_header_int_back = v.findViewById(R.id.webview_header_int_back);

        webview_header_int_back.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Acitivity_Webview_ISO.actFin();
            }
        });
    }
}