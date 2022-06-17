package com.example.naver_iso_v2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

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

                switch(position){
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), Activity_Interactions.class);
                        startActivityForResult(intent1, sub);
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
