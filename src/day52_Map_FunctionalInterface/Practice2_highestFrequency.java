package day52_Map_FunctionalInterface;

import java.util.*;

public class Practice2_highestFrequency {
    public static void main(String[] args) {
        //    Write a program that can find the element that has the highest frequency in an arrayList
//    Note: Must use a map
//
//    Ex:
//    list: [java, java, python, c#]
//
//    output:
//            [java=2, python=1, c#=1]
//    element java has the highest frequency

        ArrayList<String> list = new ArrayList<>(Arrays.asList("java", "java", "python", "c#"));

        Map<String, Integer> mapList = new LinkedHashMap<>();

        for (String eachString : list) {
            mapList.put(eachString, Collections.frequency(list, eachString));
        }
        System.out.println(mapList);

        Integer max = Integer.MIN_VALUE;
        String result = "";
        for (Map.Entry<String, Integer> eachPair : mapList.entrySet()) {
            if (eachPair.getValue()>max){
                max=eachPair.getValue();
                result = eachPair.getKey() + " : " + eachPair.getValue();
            }

        }

        System.out.println("result = " + result);
    }




}
