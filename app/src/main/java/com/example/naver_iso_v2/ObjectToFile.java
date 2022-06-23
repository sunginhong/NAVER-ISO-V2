package com.example.naver_iso_v2;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectToFile {
    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        ResultMotion student = new ResultMotion(1, "Anna");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("C:\\json\\student.json"), student);

    }
}
