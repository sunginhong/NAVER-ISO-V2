package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Activity_Haptic extends AppCompatActivity {
    public static Context ctx;
    private static Haptic_ParentRecyclerAdapter customAdapter;
    RecyclerView recyclerView;
    public static Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haptic);
        ctx = this.getApplicationContext();
        vibrator = (Vibrator) this.ctx.getSystemService(Context.VIBRATOR_SERVICE);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false)) ;

        ArrayList<String> categoryList = new ArrayList<String>();
        categoryList.add("vibrator");
        categoryList.add("VibrationEffect");
        categoryList.add("HapticFeedbackConstants");

        recyclerView.setAdapter(new Haptic_ParentRecyclerAdapter(categoryList, ctx));
        RecyclerDecoration_Height decoration_height = new RecyclerDecoration_Height(50);
        recyclerView.addItemDecoration(decoration_height);
    }

}
