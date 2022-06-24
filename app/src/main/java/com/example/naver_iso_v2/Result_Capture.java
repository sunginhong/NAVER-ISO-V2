package com.example.naver_iso_v2;

import android.graphics.Bitmap;
import android.os.Environment;
import android.view.View;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Result_Capture {

    public static File ScreenShot(View view){
        view.setDrawingCacheEnabled(true);
        Bitmap screenBitmap = view.getDrawingCache();
        String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String filename="IsoGuide" + time + ".png";
        File file = new File(Environment.getExternalStorageDirectory()+"/Pictures",filename);
        FileOutputStream os = null;
        try{os = new FileOutputStream(file);screenBitmap.compress(Bitmap.CompressFormat.PNG,90,os);
            os.close();
        } catch (IOException e){
            e.printStackTrace();
            return null; }
        view.setDrawingCacheEnabled(false);
        return file;
    }

}
