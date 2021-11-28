package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map map = new HashMap();
//        Map<String,String> map = new HashMap<>();
        map.put("name", "aman");
        map.put("lname", "Thakur");

        Set<String> keys = map.keySet();
        long timemills=System.currentTimeMillis();
        System.out.println(timemills);
        for (String i :keys) {
            System.out.println(i);
        }
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-timemills);
    }
}
