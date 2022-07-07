package com.example.naver_iso_v2;

import android.graphics.Color;
import android.os.Handler;
import android.view.View;

public class Element_ResetState {
    public Element_ResetState(View view){

    }

    public static void defCaseState00(){
        defCaseState();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                resetState(0);
            }
        }, 1);

    }

    public static void defCaseState01(){
        defCaseState();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                resetState(1);
            }
        }, 1);

    }

    public static void defCaseState02(){
        defCaseState();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                resetState(2);
            }
        }, 1);

    }

    public static void defCaseState() {
        AnimRectObject.function_CasePopupReset();
        AnimRectObject.function_CaseNudgeReset();
        AnimRectObject.function_CaseAlarmReset();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                resetState(0);
            }
        }, 1);

    }

    public static void resetState(int nums){
        switch(nums) {
            case 0:

                break;

            case 1:

                break;
            case 2:

                break;
        }
    }

}