package com.example.naver_iso_v2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class ListToJson {
    public static void main(String[] args) throws JsonProcessingException {
        List<ResultMotion> list = new ArrayList<>();
        list.add(new ResultMotion(1, "Anna"));
        list.add(new ResultMotion(2, "Brian"));
        ObjectMapper objectMapper = new ObjectMapper();
        String studentJson = objectMapper.writeValueAsString(list);
        System.out.println(studentJson);
    }
}
