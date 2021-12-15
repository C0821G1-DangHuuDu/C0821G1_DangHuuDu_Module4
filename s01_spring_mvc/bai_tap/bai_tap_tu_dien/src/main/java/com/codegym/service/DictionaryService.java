package com.codegym.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DictionaryService implements IDictionaryService{
    static Map<String,String> dictionarys = new HashMap<>();
    static {
        dictionarys.put("hello","Xin chào");
        dictionarys.put("one","Một");
        dictionarys.put("two","Hai");
        dictionarys.put("three","Ba");
    }


    @Override
    public String search(String english) {
        String result="";
        if(dictionarys.get(english)==null){
            result = "Not found!";
        } else {
            result = dictionarys.get(english);
        }
        return result;
    }
}
