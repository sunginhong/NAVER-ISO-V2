package com.example.naver_iso_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
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
    private Display display;
    public static RelativeLayout main_contain;
    public static RelativeLayout root;
    public static ViewGroup.LayoutParams params_copy;
    public static FrameLayout rect_objectFL;
    public static FrameLayout rect_objectFL_Copy;
    public static RelativeLayout bottom_rect;
    public static LinearLayout layout_container_top_group;
    public static Pannel_Result pannel_result;
    private final int sub = 1001;

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
                        Intent intent1 = new Intent(getApplicationContext(), Activity_InteractionsMenu.class);
                        startActivityForResult(intent1, sub);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), Activity_Haptic.class);
                        startActivityForResult(intent2, sub);
                        break;
                }
            }
        });
    }
}