package day53_FunctionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BuildInFunctionalInterfaces2 {
    public static void main(String[] args) {
        //Create a function that can check if the Integer is contained in an array of integer, return boolean

        BiPredicate<Integer[], Integer> contains ;
        contains = (a, b) -> {
            boolean result = false;
            for (Integer each : a) {
                if (each == b){
                    result=true;
                }
            }
            return result;
        };

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        boolean r1 = contains.test(arr, 10);
        System.out.println("r1 = " + r1);

        System.out.println("============================================================");

        // create a function that can check if two strings are anagram
        BiPredicate<String, String> isAnagram;
        isAnagram = (a,b) -> {
            boolean result = false;
            String [] arr1 = a.split("");
            String [] arr2 = b.split("");

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)){
                result = true;
            }
            return result;
        };

        System.out.println("isAnagram.test(\"alma\", \"lmaa\") = " + isAnagram.test("alma", "lmaa"));
        System.out.println("============================================================");

        // create a function that can print the given string for given number of times
        BiConsumer<String, Integer> printMultipleTimes;
        printMultipleTimes = (a, b) -> {
            for (int i = 0; i <=b; i++) {
                System.out.println(a);
            }

        };

        printMultipleTimes.accept("Omer", 9);

        System.out.println("============================================================");
        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");

        scrumTeam1.forEach((k,v)->{
            System.out.println(k + " : " + v);
        });

        System.out.println("============================================================");
        //1. create a function that takes two integers and returns the maximum integer
        BiFunction<Integer, Integer, Integer> max = (a, b)-> {
            return (a>b)? a : b;
        };
        System.out.println("max.apply(6, 9) = " + max.apply(6, 9));

        System.out.println("============================================================");
        //2. create a function that can merge two integer arrays into a list
        BiFunction<Integer[], Integer[], List<Integer>> merge;
        merge= (a,b)-> {
            List<Integer> list = new ArrayList<>();
            for (Integer each : a) {list.add(each);}
            for (Integer each : b) {list.add(each);}
            return list;
        };

        Integer[] arr1 = {1,2,3,4,5};
        Integer[] arr2 = {6,7,8};

        System.out.println("merge.apply(arr1, arr2) = " + merge.apply(arr1, arr2));

        System.out.println("============================================================");

        // 3. create a function that takes a  list of String and a list of Integer and merge them into a map

        BiFunction<List<String>, List<Integer>, Map<String, Integer>> mergeLists;
        mergeLists = (a,b) -> {
            Map<String, Integer> mapOfLists = new LinkedHashMap<>();
            for (int i = 0; i < a.size(); i++) {
                mapOfLists.put(a.get(i), b.get(i));

            }
            return mapOfLists;
        };

        List<String> names = new ArrayList<>(Arrays.asList("Layan", "Kseniia", "Aygun"));

        List<Integer> scores = new ArrayList<>(Arrays.asList(90, 95, 98));

        Map<String, Integer> students = mergeLists.apply(names, scores);

        System.out.println("students = " + students);
    }
    }

