package com.example.naver_iso_v2;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;

public class GetNavigationBarHeight {

    private static Context mContext;
    private int realheight_F = 0;

    public GetNavigationBarHeight(Activity mainActivity) {
        GetNavigationBarHeight(mainActivity);
        Vars_Def.screenHeight = realheight_F;
    }

    public int GetNavigationBarHeight(Context context){
        mContext = context;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            DisplayMetrics metrics = new DisplayMetrics();
            ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(metrics);
            int usableHeight = metrics.heightPixels;
            ((Activity)context).getWindowManager().getDefaultDisplay().getMetrics(metrics);
            int realHeight = metrics.heightPixels;
            realheight_F = realHeight;
            if (realHeight > usableHeight)
                return realHeight - usableHeight;
            else
                return 0;
        }
        return 0;
    }
}