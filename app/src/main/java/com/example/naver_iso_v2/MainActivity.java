package com.example.naver_iso_v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    public Context ctx;
    public static RelativeLayout root;
    public static ViewGroup.LayoutParams params_copy;
    public static FrameLayout rect_objectFL;
    public static FrameLayout rect_objectFL_Copy;
    public static RelativeLayout bottom_rect;
    public static LinearLayout layout_container_top_group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctx = this.getApplicationContext();
        new GetNavigationBarHeight(this);

        root = (RelativeLayout)  findViewById(R.id.root);
        bottom_rect = findViewById(R.id.bottom_rect);
        rect_objectFL = (FrameLayout)findViewById(R.id.rect_objectFL);
        rect_objectFL_Copy = (FrameLayout)findViewById(R.id.rect_objectFL_Copy);
        layout_container_top_group = findViewById(R.id.container_top_group);

        new Pannel_SetCalc(this);
    }
}