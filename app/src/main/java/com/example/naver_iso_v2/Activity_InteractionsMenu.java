package com.example.naver_iso_v2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import com.fasterxml.jackson.core.JsonProcessingException;

public class Activity_InteractionsMenu extends AppCompatActivity {
    public static Context ctx;
    private Display display;
    private final int sub = 1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interaction_menu);

        ctx = this.getApplicationContext();
        new GetNavigationBarHeight(this);

        display = getWindowManager().getDefaultDisplay();
        Vars_Def.screenWidth = display.getWidth();
        Point size = new Point();
        display.getRealSize(size);

        Main_ListFragment_Menu.mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Intent intent = new Intent(getApplicationContext(), Activity_Interactions.class);
                switch(position){
                    case 1:
                        intent.putExtra("Pos", "0");
                        startActivityForResult(intent, sub);
                        break;
                    case 2:
                        intent.putExtra("Pos", "1");
                        startActivityForResult(intent, sub);
                        break;
                    case 3:
                        intent.putExtra("Pos", "2");
                        startActivityForResult(intent, sub);
                        break;
                }
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
}
