package day52_Map_FunctionalInterface;

import java.util.*;

public class Practice_highestFrequency {
    public static void main(String[] args) {
//        Write a program that can find the character that has the highest frequency in a String
//        Note: Must use a map
//
//        Ex:
//        str = "eeeeeaaabbbbccccdd"
//
//        Output:
//        {e=5, a=3, b=4, c=4, d=2 }
//        character e has the highest frequency

        String str = "eeeeeaaabbbbccccdd";
        List<String> strList = new LinkedList<>(Arrays.asList(str.split("")));
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();

        for (String eachChar : strList) {
            frequencyMap.put(eachChar, Collections.frequency(strList, eachChar));
        }

        System.out.println("frequencyMap = " + frequencyMap);
        Integer maxFrequency = Integer.MIN_VALUE;
        String hasMaxFreq = "";
        for (Map.Entry<String, Integer> eachPair : frequencyMap.entrySet()) {
            if (eachPair.getValue()>maxFrequency){
                maxFrequency= eachPair.getValue();
                hasMaxFreq = eachPair.getKey();
            }

        }

        System.out.println(hasMaxFreq + " : " + maxFrequency);

    }
}
