package com.example.naver_iso_v2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;

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

    public static Activity activity;
    private Display display;
    private static final int PICK_IMAGE = 100;
    public static Uri imageUri;
    private boolean appStart = false;
    private static final int REQUEST_CODE = 0;

    Fragment_0_Popup_v2 fragment0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interaction);

        ctx = this.getApplicationContext();
        new GetNavigationBarHeight(this);

        openGallery();
        fragment0 = new Fragment_0_Popup_v2();

        display = getWindowManager().getDefaultDisplay();
        Vars_Def.screenWidth = display.getWidth();
        Point size = new Point();
        display.getRealSize(size);

        activity = this;

        Fragment_Header fragment_Header = new Fragment_Header(ctx, 0);

        if (!appStart){
            appStart = true;
            getSupportFragmentManager().beginTransaction().replace(R.id.interaction_rect_objectRL, fragment0).commitAllowingStateLoss();
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
                Glide.with(getApplicationContext()).load(R.drawable.popup).into(Fragment_0_Popup_v2.popup_v2_imageView);
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
    }

    @Override
    public void onResume() {
        if (Vars_Def.container_bool) {
            DragAdapter.function_containAnim(Pannel_Layout.container, Vars_Def.posMinY, 000, AnimRectObject.interpolator_bounce2);
        } else {
            DragAdapter.function_containAnim(Pannel_Layout.container, Vars_Def.posMinY, 000, AnimRectObject.interpolator_bounce2);
        }
        Utils_Anim.AlphaAnim(interaction_dimmed, 0, 0, 0);
        super.onResume();
    }

    private void openGallery() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE){
            if (resultCode == RESULT_OK){
                try {
                    imageUri = data.getData();
                    Glide.with(getApplicationContext()).load(imageUri).into(Fragment_0_Popup_v2.popup_v2_imageView);
                } catch (Exception e){

                }
            } else if(resultCode == RESULT_CANCELED){//취소시 액션

            }
        }
    }

    @Override
    public void onBackPressed() {
        if (!Vars_Def.container_bool){
            activity.finish();
        } else {
            Vars_Def.container_bool = false;
            DragAdapter.AlphaAnimCusEase(Activity_Interactions.interaction_dimmed, 0, 400, AnimRectObject.interpolator_easeOut);
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
}