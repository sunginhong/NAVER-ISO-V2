package com.example.naver_iso_v2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class SquareButton_Icn extends androidx.appcompat.widget.AppCompatButton {

    public SquareButton_Icn(Context context) {
        super(context);
    }

    public SquareButton_Icn(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareButton_Icn(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);

        width = Math.min(width, height);
        height = width;

        setMeasuredDimension(width, height);
    }
}