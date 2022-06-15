package com.example.naver_iso_v2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.Display;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;

public class Activity_Interactions extends AppCompatActivity {
    public static Context ctx;
    public static RelativeLayout main_contain;
    public static ConstraintLayout interaction_rect_objectFL_contain;
    public static FrameLayout interaction_rect_objectFL;
    public static LinearLayout layout_container_top_group;
    public static Pannel_Result pannel_result;
    public static RelativeLayout root;
    public static ViewGroup.LayoutParams params_copy;
    private Display display;
    private static final int PICK_IMAGE = 100;
    public static Uri imageUri;

    Fragment_0_Popup_v2 fragment0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interaction);

        ctx = this.getApplicationContext();
        new GetNavigationBarHeight(this);

        fragment0 = new Fragment_0_Popup_v2();

        display = getWindowManager().getDefaultDisplay();
        Vars_Def.screenWidth = display.getWidth();
        Point size = new Point();
        display.getRealSize(size);

        Vars_Def.screenHeight = display.getHeight();

        main_contain = (RelativeLayout) findViewById(R.id.interaction_main_contain);
        root = (RelativeLayout)  findViewById(R.id.interaction_root);
        interaction_rect_objectFL_contain = (ConstraintLayout)findViewById(R.id.interaction_rect_objectFL_contain);
        interaction_rect_objectFL = (FrameLayout)findViewById(R.id.interaction_rect_objectFL);
        layout_container_top_group = findViewById(R.id.container_top_group);

        new Pannel_SetCalc(this);
        Pannel_ListLayout_Top.pannelReset();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                interaction_rect_objectFL.
                DragAdapter.rectCalcHeight = Vars_Def.heightMax;
            }
        }, 500);

        openGallery();
    }

    private void openGallery() {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == PICK_IMAGE){
            imageUri = data.getData();
            getSupportFragmentManager().beginTransaction().replace(R.id.interaction_rect_objectRL, fragment0).commitAllowingStateLoss();
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}