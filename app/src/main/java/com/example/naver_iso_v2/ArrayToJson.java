package com.example.naver_iso_v2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ArrayToJson {
    public static void main(String[] args) throws JsonProcessingException {
       ResultMotion[] arr = new ResultMotion[2];
       arr[0] = new ResultMotion(1, "Anna");
       arr[1] = new ResultMotion(2, "Brian");
       ObjectMapper objectMapper = new ObjectMapper();
       String studentJson = objectMapper.writeValueAsString(arr);
       System.out.println(studentJson);
    }
}
