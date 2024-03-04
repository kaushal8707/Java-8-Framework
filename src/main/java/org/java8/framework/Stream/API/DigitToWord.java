package org.java8.framework.Stream.API;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DigitToWord {
    public static void main(String[] args) {
        Integer input=320;
        Map<Integer, String> map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(8,"eight");
        map.put(9,"nine");
        map.put(0,"zero");
        for(String value :String.valueOf(input).split("")){
            System.out.print(map.get(Integer.parseInt(value))+" ");
        }



    }
}
