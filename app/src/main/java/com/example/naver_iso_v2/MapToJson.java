package com.example.naver_iso_v2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class MapToJson {
    public static void main(String[] args) throws JsonProcessingException {
         Map<String, Object> map = new HashMap<>();
         map.put("id", 1);
         map.put("name", "Anna");
         ObjectMapper objectMapper = new ObjectMapper();
         String studentJson = objectMapper.writeValueAsString(map);
         System.out.println(studentJson);
    }
}
