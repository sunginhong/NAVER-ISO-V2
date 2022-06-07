package com.example.naver_iso_v2;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.viewpager.widget.ViewPager;

public class Fragment_3_ViewPager_TransformPage implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        final int pageWidth = page.getWidth();
        final RelativeLayout img_contain = (RelativeLayout) page.findViewById(R.id.img_contain);
        String transCase = "POSX";
        int posXcase = 1;

        if (transCase == "POSX") {
            page.setAlpha(1);
            if (posXcase == 0){
                if (position <= 1) {
                    img_contain.setTranslationX( -position*(pageWidth/2) );
                }
            }
            if (posXcase == 1){
                if (Fragment_3_ViewPager.scrollDirection == "RIGHT"){
                    if (position < 0) {
                        img_contain.setTranslationX(0);
                    } else {
                        img_contain.setTranslationX( -position*(pageWidth/2) );
                    }
                }
                if (Fragment_3_ViewPager.scrollDirection == "LEFT"){
                    if (position <= 1) {
                        img_contain.setTranslationX(0);
                    }
                    if (position < 0) {
                        img_contain.setTranslationX( -position*(pageWidth/2) );
                    }
                }
            }
        }
        if (transCase == "ALPHA") {
            if (position <= 1) {
//                img_contain.setAlpha( 1-(position*1f) );
                img_contain.setAlpha( 1-(position*2f) );
            }
            if (position < 0) {
//                img_contain.setAlpha( 1-(0-position*1f) );
                img_contain.setAlpha( 1-(0-position*2f) );
            }
        }
        if (transCase == "SCALE") {
            if (position <= 1) {
                img_contain.setScaleX( 1+(position*0.5f) );
                img_contain.setScaleY( 1+(position*0.5f) );
            }
            if (position < 0) {
                img_contain.setScaleX( 1+(0-position*0.5f) );
                img_contain.setScaleY( 1+(0-position*0.5f) );
            }
        }
    }
}