package com.example.naver_iso_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static Context ctx;
    public static RelativeLayout main_contain;
    public static RelativeLayout root;
    public static ViewGroup.LayoutParams params_copy;
    public static FrameLayout rect_objectFL;
    public static FrameLayout rect_objectFL_Copy;
    public static RelativeLayout bottom_rect;
    public static LinearLayout layout_container_top_group;
    public static Pannel_Result pannel_result;
    private Display display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ctx = this.getApplicationContext();
        new GetNavigationBarHeight(this);

        display = getWindowManager().getDefaultDisplay();
        Vars_Def.screenWidth = display.getWidth();
        Point size = new Point();
        display.getRealSize(size);

        Main_ListFragment.mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                String selectedItem = (String) view.findViewById(R.id.textView_title).getTag().toString();
                switch(position){
                    case 1:
//                        Intent intent1 = new Intent(getApplicationContext(), Activity_Haptic.class);
//                        startActivity(intent1);
//                        startActivityForResult(a,b)
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), Activity_Haptic.class);
                        startActivity(intent2);
                        break;
                }
            }
        });
//        Vars_Def.screenHeight = display.getHeight();

//        main_contain = (RelativeLayout) findViewById(R.id.main_contain);
//        root = (RelativeLayout)  findViewById(R.id.root);
//        bottom_rect = findViewById(R.id.bottom_rect);
//        rect_objectFL = (FrameLayout)findViewById(R.id.rect_objectFL);
//        rect_objectFL_Copy = (FrameLayout)findViewById(R.id.rect_objectFL_Copy);
//        layout_container_top_group = findViewById(R.id.container_top_group);
//        pannel_result = findViewById(R.id.pannel_result);
//
//        new Pannel_SetCalc(this);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                DragAdapter.rectCalcHeight = Vars_Def.heightMax;
//            }
//        }, 500);
    }


//    @Override
//    public void onBackPressed() {
//        if (Vars_Def.codePage){
//            Utils_Anim.TransAlphaAnim(MainActivity.main_contain, -Vars_Def.screenWidth/2, 0, 0, 0, 0, 1, 500);
//            Utils_Anim.TransAnim(MainActivity.pannel_result, 0, Vars_Def.screenWidth, 0, 0, 500);
//            new Handler().postDelayed(new Runnable() {
//                @Override
//                public void run() {
//                    MainActivity.pannel_result.setX(Vars_Def.screenWidth);
//                    Vars_Def.codePage = false;
//                }
//            }, 500);
//        }
//    }
}