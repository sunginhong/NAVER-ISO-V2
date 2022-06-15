package com.example.naver_iso_v2;

import android.os.Build;
import android.os.VibrationEffect;

public class HapticFunction {
    public static void VibeSet(Object tag, int pos){
        if ("Vibrator".equals(tag)) {
            switch (pos){
                case 0:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case0_rows0();
                        Haptic_PopupActivity.codeLine1 = "버전 29(OREO)이상\nvibrator.vibrate(VibrationEffect.createOneShot(1, VibrationEffect.DEFAULT_AMPLITUDE));";
                        Haptic_PopupActivity.codeLine2 = "버전 29(OREO)이하\nvibrator.vibrate(1);";
                    }
                    break;
                case 1:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case0_rows1();
                        Haptic_PopupActivity.codeLine1 = "버전 29(OREO)이상\nvibrator.vibrate(VibrationEffect.createOneShot(2, VibrationEffect.DEFAULT_AMPLITUDE));";
                        Haptic_PopupActivity.codeLine2 = "버전 29(OREO)이하\nvibrator.vibrate(2);";
                    }
                    break;
                case 2:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case0_rows2();
                        Haptic_PopupActivity.codeLine1 = "버전 29(OREO)이상\nvibrator.vibrate(VibrationEffect.createOneShot(3, VibrationEffect.DEFAULT_AMPLITUDE));";
                        Haptic_PopupActivity.codeLine2 = "버전 29(OREO)이하\nvibrator.vibrate(3);";
                    }
                    break;
                case 3:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case0_rows3();
                        Haptic_PopupActivity.codeLine1 = "버전 29(OREO)이상\nvibrator.vibrate(VibrationEffect.createOneShot(4, VibrationEffect.DEFAULT_AMPLITUDE));";
                        Haptic_PopupActivity.codeLine2 = "버전 29(OREO)이하\nvibrator.vibrate(4);";
                    }
                    break;
                case 4:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case0_rows4();
                        Haptic_PopupActivity.codeLine1 = "버전 29(OREO)이상\nvibrator.vibrate(VibrationEffect.createOneShot(5, VibrationEffect.DEFAULT_AMPLITUDE));";
                        Haptic_PopupActivity.codeLine2 = "버전 29(OREO)이하\nvibrator.vibrate(5);";
                    }
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case0_rows5();
                        Haptic_PopupActivity.codeLine1 = "버전 29(OREO)이상\nvibrator.vibrate(VibrationEffect.createOneShot(6, VibrationEffect.DEFAULT_AMPLITUDE));";
                        Haptic_PopupActivity.codeLine2 = "버전 29(OREO)이하\nvibrator.vibrate(6);";
                    }
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case0_rows6();
                        Haptic_PopupActivity.codeLine1 = "버전 29(OREO)이상\nvibrator.vibrate(VibrationEffect.createOneShot(7, VibrationEffect.DEFAULT_AMPLITUDE));";
                        Haptic_PopupActivity.codeLine2 = "버전 29(OREO)이하\nvibrator.vibrate(7);";
                    }
                    break;
                case 7:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case0_rows7();
                        Haptic_PopupActivity.codeLine1 = "버전 29(OREO)이상\nvibrator.vibrate(VibrationEffect.createOneShot(8, VibrationEffect.DEFAULT_AMPLITUDE));";
                        Haptic_PopupActivity.codeLine2 = "버전 29(OREO)이하\nvibrator.vibrate(8);";
                    }
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case0_rows8();
                        Haptic_PopupActivity.codeLine1 = "버전 29(OREO)이상\nvibrator.vibrate(VibrationEffect.createOneShot(9, VibrationEffect.DEFAULT_AMPLITUDE));";
                        Haptic_PopupActivity.codeLine2 = "버전 29(OREO)이하\nvibrator.vibrate(9);";
                    }
                    break;
                case 9:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case0_rows9();
                        Haptic_PopupActivity.codeLine1 = "버전 29(OREO)이상\nvibrator.vibrate(VibrationEffect.createOneShot(10, VibrationEffect.DEFAULT_AMPLITUDE));";
                        Haptic_PopupActivity.codeLine2 = "버전 29(OREO)이하\nvibrator.vibrate(10);";
                    }
                    break;
            }
        } else if ("VibrationEffect".equals(tag)) {
            switch (pos){
                case 0:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case1_rows0();
                        Haptic_PopupActivity.codeLine1 = "Java\nVibrationEffect vibrationEffect = VibrationEffect.createPredefined(VibrationEffect.EFFECT_CLICK);\nActivity_Haptic.vibrator.vibrate(vibrationEffect);";
                        Haptic_PopupActivity.codeLine2 = "Kotlin\nval vibrationEffect = VibrationEffect.createPredefined(VibrationEffect.EFFECT_CLICK);\nActivity_Haptic.vibrator.vibrate(vibrationEffect);";
                    }
                    break;
                case 1:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case1_rows1();
                        Haptic_PopupActivity.codeLine1 = "Java\nVibrationEffect vibrationEffect = VibrationEffect.createPredefined(VibrationEffect.EFFECT_DOUBLE_CLICK);\nActivity_Haptic.vibrator.vibrate(vibrationEffect);";
                        Haptic_PopupActivity.codeLine2 = "Kotlin\nval vibrationEffect = VibrationEffect.createPredefined(VibrationEffect.EFFECT_DOUBLE_CLICK);\nActivity_Haptic.vibrator.vibrate(vibrationEffect);";
                    }
                    break;
                case 2:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case1_rows2();
                        Haptic_PopupActivity.codeLine1 = "Java\nVibrationEffect vibrationEffect = VibrationEffect.createPredefined(VibrationEffect.EFFECT_HEAVY_CLICK);\nActivity_Haptic.vibrator.vibrate(vibrationEffect);";
                        Haptic_PopupActivity.codeLine2 = "Kotlin\nval vibrationEffect = VibrationEffect.createPredefined(VibrationEffect.EFFECT_HEAVY_CLICK);\nActivity_Haptic.vibrator.vibrate(vibrationEffect);";
                    }
                    break;
                case 3:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case1_rows3();
                        Haptic_PopupActivity.codeLine1 = "Java\nVibrationEffect vibrationEffect = VibrationEffect.createPredefined(VibrationEffect.EFFECT_TICK);\nActivity_Haptic.vibrator.vibrate(vibrationEffect);";
                        Haptic_PopupActivity.codeLine2 = "Kotlin\nval vibrationEffect = VibrationEffect.createPredefined(VibrationEffect.EFFECT_TICK);\nActivity_Haptic.vibrator.vibrate(vibrationEffect);";
                    }
                    break;
            }
        } else if ("HapticFeedbackConstants".equals(tag)) {
            switch (pos){
                case 0:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case2_rows0();
                        Haptic_PopupActivity.codeLine1 = "Java\nview.performHapticFeedback(HapticFeedbackConstants.CLOCK_TICK);";
                        Haptic_PopupActivity.codeLine2 = "";
                    }
                    break;
                case 1:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case2_rows1();
                        Haptic_PopupActivity.codeLine1 = "Java\nview.performHapticFeedback(HapticFeedbackConstants.CONFIRM);";
                        Haptic_PopupActivity.codeLine2 = "";
                    }
                    break;
                case 2:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case2_rows2();
                        Haptic_PopupActivity.codeLine1 = "Java\nview.performHapticFeedback(HapticFeedbackConstants.CONTEXT_CLICK);";
                        Haptic_PopupActivity.codeLine2 = "";
                    }
                    break;
                case 3:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case2_rows3();
                        Haptic_PopupActivity.codeLine1 = "Java\nview.performHapticFeedback(HapticFeedbackConstants.FLAG_IGNORE_VIEW_SETTING);";
                        Haptic_PopupActivity.codeLine2 = "";
                    }
                    break;
                case 4:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case2_rows4();
                        Haptic_PopupActivity.codeLine1 = "Java\nview.performHapticFeedback(HapticFeedbackConstants.GESTURE_END);";
                        Haptic_PopupActivity.codeLine2 = "";
                    }
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case2_rows5();
                        Haptic_PopupActivity.codeLine1 = "Java\nview.performHapticFeedback(HapticFeedbackConstants.GESTURE_START);";
                        Haptic_PopupActivity.codeLine2 = "";
                    }
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case2_rows6();
                        Haptic_PopupActivity.codeLine1 = "Java\nview.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_PRESS);";
                        Haptic_PopupActivity.codeLine2 = "";
                    }
                    break;
                case 7:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case2_rows7();
                        Haptic_PopupActivity.codeLine1 = "Java\nview.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP);";
                        Haptic_PopupActivity.codeLine2 = "";
                    }
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case2_rows8();
                        Haptic_PopupActivity.codeLine1 = "Java\nview.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);";
                        Haptic_PopupActivity.codeLine2 = "";
                    }
                    break;
                case 9:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case2_rows9();
                        Haptic_PopupActivity.codeLine1 = "Java\nview.performHapticFeedback(HapticFeedbackConstants.REJECT);";
                        Haptic_PopupActivity.codeLine2 = "";
                    }
                    break;
                case 10:
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                        Haptic_Vibrate.case2_rows10();
                        Haptic_PopupActivity.codeLine1 = "Java\nview.performHapticFeedback(HapticFeedbackConstants.TEXT_HANDLE_MOVE);";
                        Haptic_PopupActivity.codeLine2 = "";
                    }
                    break;
            }
        }
    }
}
