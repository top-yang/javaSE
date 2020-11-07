package cn.hao.collection.map;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("1","yh");
        map.put("2","lh");
        map.put("3","jay");

//        System.out.println(map);
//        System.out.println(map.get("1"));
//        Set<String> set=map.keySet();
//        System.out.println(set);
//       Collection<String> stringCollection=map.values();
//        System.out.println(stringCollection);
//        Set<Map.Entry<String,String>> entries=map.entrySet();
//        System.out.println(entries);
        Set<String> stringSet=map.keySet();
        for (String s : stringSet) {
            System.out.println(map.get(s));
        }
        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            System.out.println(stringStringEntry.getKey()+stringStringEntry.getValue());
        }


    }
}
