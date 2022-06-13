package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Activity_Haptic extends AppCompatActivity {
    public static Context ctx;
    private static Haptic_ParentRecyclerAdapter customAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haptic);
        ctx = this.getApplicationContext();


        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false)) ;

        ArrayList<String> categoryList = new ArrayList<String>();
        categoryList.add("Selection");
        categoryList.add("Impact");
        categoryList.add("Notification");
        recyclerView.setAdapter(new Haptic_ParentRecyclerAdapter(categoryList, ctx));
        RecyclerDecoration_Height decoration_height = new RecyclerDecoration_Height(70);
        recyclerView.addItemDecoration(decoration_height);
    }

}
