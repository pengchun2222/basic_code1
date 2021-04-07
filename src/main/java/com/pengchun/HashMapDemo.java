package com.pengchun;

import java.util.HashMap;

/**
 * @Author 彭淳
 * @Date 2021/4/6
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put(1,1);

        HashMap o =  (HashMap) null;
        System.out.println(hashMap);
    }
}
