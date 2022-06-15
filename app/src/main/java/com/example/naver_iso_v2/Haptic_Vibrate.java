package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.util.Log;
import android.view.HapticFeedbackConstants;

import androidx.annotation.RequiresApi;

public class Haptic_Vibrate {
    protected Context context;
//    https://developer.android.com/reference/android/os/VibrationEffect
//    https://developer.android.com/reference/android/view/HapticFeedbackConstants

    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case0_rows0 (){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Activity_Haptic.vibrator.vibrate(VibrationEffect.createOneShot(1, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            Activity_Haptic.vibrator.vibrate(1);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case0_rows1 (){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Activity_Haptic.vibrator.vibrate(VibrationEffect.createOneShot(2, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            Activity_Haptic.vibrator.vibrate(2);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case0_rows2 (){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Activity_Haptic.vibrator.vibrate(VibrationEffect.createOneShot(3, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            Activity_Haptic.vibrator.vibrate(3);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case0_rows3 (){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Activity_Haptic.vibrator.vibrate(VibrationEffect.createOneShot(4, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            Activity_Haptic.vibrator.vibrate(4);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case0_rows4 (){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Activity_Haptic.vibrator.vibrate(VibrationEffect.createOneShot(5, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            Activity_Haptic.vibrator.vibrate(5);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case0_rows5(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Activity_Haptic.vibrator.vibrate(VibrationEffect.createOneShot(6, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            Activity_Haptic.vibrator.vibrate(6);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case0_rows6 (){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Activity_Haptic.vibrator.vibrate(VibrationEffect.createOneShot(7, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            Activity_Haptic.vibrator.vibrate(7);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case0_rows7 (){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Activity_Haptic.vibrator.vibrate(VibrationEffect.createOneShot(8, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            Activity_Haptic.vibrator.vibrate(8);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case0_rows8 (){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Activity_Haptic.vibrator.vibrate(VibrationEffect.createOneShot(9, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            Activity_Haptic.vibrator.vibrate(9);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case0_rows9 (){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Activity_Haptic.vibrator.vibrate(VibrationEffect.createOneShot(10, VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            Activity_Haptic.vibrator.vibrate(10);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case1_rows0 (){
        final VibrationEffect EFFECT_CLICK;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            EFFECT_CLICK = VibrationEffect.createPredefined(VibrationEffect.EFFECT_CLICK);
            Activity_Haptic.vibrator.cancel();
            Activity_Haptic.vibrator.vibrate(EFFECT_CLICK);
        } else {

        }
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case1_rows1 (){
        final VibrationEffect EFFECT_DOUBLE_CLICK;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            EFFECT_DOUBLE_CLICK = VibrationEffect.createPredefined(VibrationEffect.EFFECT_DOUBLE_CLICK);
            Activity_Haptic.vibrator.cancel();
            Activity_Haptic.vibrator.vibrate(EFFECT_DOUBLE_CLICK);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case1_rows2 (){
        final VibrationEffect EFFECT_HEAVY_CLICK;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            EFFECT_HEAVY_CLICK = VibrationEffect.createPredefined(VibrationEffect.EFFECT_HEAVY_CLICK);
            Activity_Haptic.vibrator.cancel();
            Activity_Haptic.vibrator.vibrate(EFFECT_HEAVY_CLICK);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case1_rows3 (){
        final VibrationEffect EFFECT_TICK;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            EFFECT_TICK = VibrationEffect.createPredefined(VibrationEffect.EFFECT_TICK);
            Activity_Haptic.vibrator.cancel();
            Activity_Haptic.vibrator.vibrate(EFFECT_TICK);
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case2_rows0 (){
        Haptic_ChildRecyclerAdapter.row_titlell.performHapticFeedback(HapticFeedbackConstants.CLOCK_TICK);
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case2_rows1(){
        Haptic_ChildRecyclerAdapter.row_titlell.performHapticFeedback(HapticFeedbackConstants.CONFIRM);
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case2_rows2(){
        Haptic_ChildRecyclerAdapter.row_titlell.performHapticFeedback(HapticFeedbackConstants.CONTEXT_CLICK);
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case2_rows3(){
        Haptic_ChildRecyclerAdapter.row_titlell.performHapticFeedback(HapticFeedbackConstants.FLAG_IGNORE_VIEW_SETTING);
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case2_rows4(){
        Haptic_ChildRecyclerAdapter.row_titlell.performHapticFeedback(HapticFeedbackConstants.GESTURE_END);
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case2_rows5 (){
        Haptic_ChildRecyclerAdapter.row_titlell.performHapticFeedback(HapticFeedbackConstants.GESTURE_START);
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case2_rows6(){
        Haptic_ChildRecyclerAdapter.row_titlell.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case2_rows7 (){
        Haptic_ChildRecyclerAdapter.row_titlell.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP);
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case2_rows8(){
        Haptic_ChildRecyclerAdapter.row_titlell.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case2_rows9(){
        Haptic_ChildRecyclerAdapter.row_titlell.performHapticFeedback(HapticFeedbackConstants.REJECT);
    }
    @RequiresApi(api = Build.VERSION_CODES.Q)
    static public void case2_rows10(){
        Haptic_ChildRecyclerAdapter.row_titlell.performHapticFeedback(HapticFeedbackConstants.TEXT_HANDLE_MOVE);
    }
}
