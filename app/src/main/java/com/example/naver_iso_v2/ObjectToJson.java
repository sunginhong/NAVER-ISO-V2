package com.example.naver_iso_v2;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ObjectToJson {

    public Context ctx;
    private int COUNT = 0;
    private JSONObject obj = null;

    public  ObjectToJson(Context ctx) throws JsonGenerationException, JsonMappingException, IOException {
        this.ctx = ctx;

        ResultMotion[] result = new ResultMotion[12];
        ArrayList<String> motionArray = new ArrayList<String>();
        motionArray.add(""+Vars_Def.inMotion_li0_state+"");
        motionArray.add(""+Vars_Def.inMotion_li1_state+"");
        motionArray.add(""+Vars_Def.inMotion_li2_state+"");
        motionArray.add(""+Vars_Def.inMotion_li3_state+"");
        motionArray.add(""+Vars_Def.inMotion_li4_state+"");
        motionArray.add(""+Vars_Def.inMotion_li5_state+"");

        motionArray.add(""+Vars_Def.outMotion_li0_state+"");
        motionArray.add(""+Vars_Def.outMotion_li1_state+"");
        motionArray.add(""+Vars_Def.outMotion_li2_state+"");
        motionArray.add(""+Vars_Def.outMotion_li3_state+"");
        motionArray.add(""+Vars_Def.outMotion_li4_state+"");
        motionArray.add(""+Vars_Def.outMotion_li5_state+"");

        for (int i = 0; i < result.length; i++) {
            result[i] = new ResultMotion(i+1, motionArray.get(i));
        }

        ObjectMapper objectMapper = new ObjectMapper();
        String motionJson = objectMapper.writeValueAsString(result);

//        String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath(), "isoKit" + time + ".json");
//        try{
//            FileWriter fileWriter = new FileWriter(file, false);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            bufferedWriter.write(motionJson);
//            bufferedWriter.close();
//            Toast.makeText(ctx.getApplicationContext(), "download 폴더에 저장되었습니다.", Toast.LENGTH_SHORT).show();
//        } catch (IOException e) {
//            e.printStackTrace();
//            Toast.makeText(ctx.getApplicationContext(), "download 폴더에 저장하지 못했습니다.", Toast.LENGTH_SHORT).show();
//        }

    }

}
