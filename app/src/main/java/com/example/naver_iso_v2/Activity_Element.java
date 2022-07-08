package com.example.naver_iso_v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Activity_Element extends AppCompatActivity {

    public static Context ctx;
    private Display display;
    public static Activity activity;
    public static FrameLayout main_contain;
    public static LinearLayout layout_container_top_group;
    public static Pannel_Result pannel_result;
    public static RelativeLayout element_obj_layout_contain;
    public static RelativeLayout element_obj_layout;
    public static RelativeLayout element_root;
    public static ViewGroup.LayoutParams params_copy;
    public static int frag_header_height;

    private ViewPager2 mPager;
    private Main_Rcv_VpAdapter pagerAdapter;
    static String Val;
    public static String Pos;
    boolean appStart = false;
    int num_page = 2;
    public static int selPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element);

        ctx = this.getApplicationContext();
        new GetNavigationBarHeight(this);

        Intent intent = getIntent();
        Val = intent.getStringExtra("text");

        display = getWindowManager().getDefaultDisplay();
        Vars_Def.screenWidth = display.getWidth();
        Point size = new Point();
        display.getRealSize(size);

        activity = this;
        if (!appStart){
            appStart = true;
        }
        titleChange(Val);
        Vars_Def.screenHeight = display.getHeight();

        main_contain = (FrameLayout) findViewById(R.id.element_main_contain);
        element_root = (RelativeLayout)  findViewById(R.id.element_root);

        layout_container_top_group = findViewById(R.id.element_container_top_group);
        element_obj_layout_contain = findViewById(R.id.element_obj_layout_contain);
        element_obj_layout = findViewById(R.id.element_obj_layout);
        frag_header_height = (int)getResources().getDimension(R.dimen.frag_header_height);

        Utils_Anim.AlphaAnim(element_obj_layout_contain, 0, 0, 0);

        new Element_Pannel_SetCalc(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                DragAdapter.rectCalcHeight = Vars_Def.heightMax;
                selPos = Integer.parseInt(Val);
                if (Integer.parseInt(Val) == 0){
                    Glide.with(getApplicationContext()).load(R.drawable.popup).into(Fragment_0_Popup_v2.popup_v2_imageView);
                }
                if (Integer.parseInt(Val) == 1){
                    Glide.with(getApplicationContext()).load(R.drawable.nudge).into(Fragment_1_Nudge_v2.nudge_v2_imageView);
                }
                if (Integer.parseInt(Val) == 2){
                    Glide.with(getApplicationContext()).load(R.drawable.alarm).into(Fragment_2_Alarm_v2.alarm_v2_imageView);
                }
            }
        }, 000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Utils_Anim.AlphaAnim(element_obj_layout_contain, 0, 1, 200);
            }
        }, 300);
        mPager = findViewById(R.id.element_viewpager);

        pagerAdapter = new Main_Rcv_VpAdapter(this, num_page, ctx);
        mPager.setAdapter(pagerAdapter);
        mPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        mPager.setCurrentItem(0);
        mPager.setOffscreenPageLimit(2);

        new TabLayoutMediator(Element_Pannel_Layout.element_vp_tab_layout, mPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
            }
        }).attach();

        mPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                if (positionOffsetPixels == 0) {
                    mPager.setCurrentItem(position);
                }
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

        });

        final float pageMargin= getResources().getDimensionPixelOffset(R.dimen.pageMargin);
        final float pageOffset = getResources().getDimensionPixelOffset(R.dimen.offset);

        mPager.setPageTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float myOffset = position * -(2 * pageOffset + pageMargin);
                if (mPager.getOrientation() == ViewPager2.ORIENTATION_HORIZONTAL) {
                    if (ViewCompat.getLayoutDirection(mPager) == ViewCompat.LAYOUT_DIRECTION_RTL) {
                        page.setTranslationX(-myOffset);
                    } else {
                        page.setTranslationX(myOffset);
                    }
                } else {
                    page.setTranslationY(myOffset);
                }
            }
        });

        Element_Pannel_ListLayout_Top.element_anim_backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                pageOutAnim();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
        pageOutAnim();
    }

    void pageOutAnim(){
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right_case2);
    }

    void titleChange(String Val){
        switch(Val){
            case "0":
                Fragment_0_Popup_v2 fragment0 = new Fragment_0_Popup_v2();
                getSupportFragmentManager().beginTransaction().replace(R.id.element_obj_layout, fragment0).commitAllowingStateLoss();
                Element_Pannel_ListLayout_Top.element_anim_title.setText(R.string.popup);
                break;
            case "1":
                Fragment_1_Nudge_v2 fragment1 = new Fragment_1_Nudge_v2();
                getSupportFragmentManager().beginTransaction().replace(R.id.element_obj_layout, fragment1).commitAllowingStateLoss();
                Element_Pannel_ListLayout_Top.element_anim_title.setText(R.string.alarm);
                break;
            case "2":
                Fragment_2_Alarm_v2 fragment2 = new Fragment_2_Alarm_v2();
                getSupportFragmentManager().beginTransaction().replace(R.id.element_obj_layout, fragment2).commitAllowingStateLoss();
                Element_Pannel_ListLayout_Top.element_anim_title.setText(R.string.nudge);
                break;
        }
    }
}