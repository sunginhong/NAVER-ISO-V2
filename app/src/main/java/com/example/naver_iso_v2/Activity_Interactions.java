package com.example.naver_iso_v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.io.File;
import java.util.ArrayList;

public class Activity_Interactions extends AppCompatActivity {
    public static Context ctx;
    public static RelativeLayout main_contain;
    public static RelativeLayout interaction_rect_objectFL_contain;
    public static FrameLayout interaction_rect_objectFL;
    public static LinearLayout layout_container_top_group;
    public static Pannel_Result pannel_result;
    public static RelativeLayout root;
    public static ViewGroup.LayoutParams params_copy;
    public static Fragment_Header interaction_header;
    public static View interaction_dimmed;
    public static int frag_header_height;

    String value;
    public static Activity activity;
    private Display display;
    private static final int PICK_IMAGE = 100;
    public static Uri imageUri;
    private boolean appStart = false;
    private static final int REQUEST_CODE = 0;
    public static String Pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interaction);

        ctx = this.getApplicationContext();
        new GetNavigationBarHeight(this);

        Intent intent = getIntent();
        Pos = intent.getStringExtra("Pos");
        View rootView = getWindow().getDecorView();

        selFragment(Pos);

        openGallery();

        display = getWindowManager().getDefaultDisplay();
        Vars_Def.screenWidth = display.getWidth();
        Point size = new Point();
        display.getRealSize(size);

        activity = this;

        if (!appStart){
            appStart = true;
            Fragment_Header fragment_Header = new Fragment_Header(ctx, 0);
        }

        Vars_Def.screenHeight = display.getHeight();

        main_contain = (RelativeLayout) findViewById(R.id.interaction_main_contain);
        root = (RelativeLayout)  findViewById(R.id.interaction_root);
        LinearLayout interaction_rect_contain = findViewById(R.id.interaction_rect_contain);
        interaction_rect_contain.setAlpha(0);
        interaction_rect_objectFL_contain = (RelativeLayout)findViewById(R.id.interaction_rect_objectFL_contain);
        interaction_rect_objectFL = (FrameLayout)findViewById(R.id.interaction_rect_objectFL);
        layout_container_top_group = findViewById(R.id.container_top_group);
        interaction_header = findViewById(R.id.interaction_header);
        interaction_dimmed = findViewById(R.id.interaction_dimmed);
        frag_header_height = (int)getResources().getDimension(R.dimen.frag_header_height);
        DragAdapter.AlphaAnimCusEase(Activity_Interactions.interaction_dimmed, 0, 0, AnimRectObject.interpolator_easeOut);

        new Pannel_SetCalc(this);
        Pannel_ListLayout_Top.pannelReset();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                DragAdapter.rectCalcHeight = Vars_Def.heightMax;
                interaction_rect_contain.setAlpha(1);
                if (Integer.parseInt(Pos) == 0){
                    Glide.with(getApplicationContext()).load(R.drawable.popup).into(Fragment_0_Popup_v2.popup_v2_imageView);
                }
                if (Integer.parseInt(Pos) == 1){
                    Glide.with(getApplicationContext()).load(R.drawable.nudge).into(Fragment_1_Nudge_v2.nudge_v2_imageView);
                }
                if (Integer.parseInt(Pos) == 2){
                    Glide.with(getApplicationContext()).load(R.drawable.alarm).into(Fragment_2_Alarm_v2.alarm_v2_imageView);
                }
            }
        }, 500);

        Button button_change_photo = Pannel_ListLayout_Bottom.button_change_photo;
        button_change_photo.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pannel_ListLayout_Bottom.func_button_change_photo();
                openGallery();
            }
        });

        Pannel_Layout.button_code_review.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Interaction_ResultArray.ArrData = new ArrayList<>();
                Interaction_ResultArray.getData();

                Intent intent = new Intent(ctx, Interaction_PopupActivity.class);
                intent.putStringArrayListExtra("ArrayList", Interaction_ResultArray.ArrData);
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public void onResume() {
        if (!Vars_Def.container_bool) {
            DragAdapter.function_containAnim(Pannel_Layout.container, Vars_Def.posMinY, 000, AnimRectObject.interpolator_bounce2);
            DragAdapter.AlphaAnimCusEase(interaction_dimmed, 0, 300, AnimRectObject.interpolator_easeOut);
        } else {
            DragAdapter.function_containAnim(Pannel_Layout.container, Vars_Def.posMaxY, 000, AnimRectObject.interpolator_bounce2);
            DragAdapter.AlphaAnimCusEase(interaction_dimmed, 1, 300, AnimRectObject.interpolator_easeOut);
        }
        super.onResume();
    }

    private void openGallery() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, REQUEST_CODE);
        overridePendingTransition(R.anim.slide_in_up_case1, R.anim.slide_out_down_case1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE){
            if (resultCode == RESULT_OK){
                try {
                    imageUri = data.getData();
                    if (Integer.parseInt(Pos) == 0) {
                        Glide.with(getApplicationContext()).load(imageUri).into(Fragment_0_Popup_v2.popup_v2_imageView);
                    }
                    if (Integer.parseInt(Pos) == 1) {
                        Glide.with(getApplicationContext()).load(imageUri).into(Fragment_1_Nudge_v2.nudge_v2_imageView);
                    }
                    if (Integer.parseInt(Pos) == 2) {
                        Glide.with(getApplicationContext()).load(imageUri).into(Fragment_2_Alarm_v2.alarm_v2_imageView);
                    }
                } catch (Exception e){

                }
            } else if(resultCode == RESULT_CANCELED){//취소시 액션

            }
        }
        overridePendingTransition(R.anim.slide_in_up_case2, R.anim.slide_out_down_case2);
    }

    @Override
    public void onBackPressed() {
        if (!Vars_Def.container_bool){
            activity.finish();
            pageOutAnim();
        } else {
            Vars_Def.container_bool = false;
            DragAdapter.AlphaAnimCusEase(interaction_dimmed, 0, 400, AnimRectObject.interpolator_easeOut);;
            DragAdapter.function_containAnim(Pannel_Layout.container, Vars_Def.posMinY, 400, AnimRectObject.interpolator_bounce2);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        activity = null;
    }

    public static void actFin(){
        if (!Vars_Def.container_bool){
            activity.finish();
            Vars_Def.container_bool = false;
        }
    }

    public void selFragment(String Pos){
        switch(Pos){
            case "0":
                Fragment_0_Popup_v2 fragment0 = new Fragment_0_Popup_v2();
                getSupportFragmentManager().beginTransaction().replace(R.id.interaction_rect_objectRL, fragment0).commitAllowingStateLoss();
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);
                break;
            case "1":
                Fragment_1_Nudge_v2 fragment1 = new Fragment_1_Nudge_v2();
                getSupportFragmentManager().beginTransaction().replace(R.id.interaction_rect_objectRL, fragment1).commitAllowingStateLoss();
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);
                break;
            case "2":
                Fragment_2_Alarm_v2 fragment2 = new Fragment_2_Alarm_v2();
                getSupportFragmentManager().beginTransaction().replace(R.id.interaction_rect_objectRL, fragment2).commitAllowingStateLoss();
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left_case1);
                break;
        }
    }

    void pageOutAnim(){
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right_case2);
    }

}