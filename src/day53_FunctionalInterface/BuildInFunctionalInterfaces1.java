package day53_FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuildInFunctionalInterfaces1 {
    public static void main(String[] args) {
        //create a isPalindrome function
        Predicate<String> isPalindrome;
        isPalindrome = (s) -> {
            boolean isPalindrom = false;
            String reversedVersion = new StringBuilder(s).reverse().toString();

//            String reversedVersion = "";
//            for (int i = s.length()-1; i >=0 ; i--) {
//                reversedVersion+= s.charAt(i)+"";
//            }

            if (s.equalsIgnoreCase(reversedVersion)) {
                isPalindrom = true;
            }
            return isPalindrom;
        };

        boolean deneme = isPalindrome.test("kayak");
        System.out.println("deneme = " + deneme);

        System.out.println("===========================================");

        //isEven

        Predicate<Integer> isEven;
        isEven = (n) -> n % 2 == 0;

        System.out.println("isEven.test(5) = " + isEven.test(6));

        System.out.println("===========================================");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Level", "Anna", "Java", "Python"));

        names.removeIf(isPalindrome);
        System.out.println("names = " + names);

        System.out.println("===========================================");

        Consumer<String> printEachChar;
        printEachChar = (s) -> {
            for (String each : s.split("")) {
                System.out.println(each);
            }

        };

        printEachChar.accept("Mehmet");

        System.out.println("===========================================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 34, 5, 6, 7, 8, 9));
        list2.forEach(p-> {if (p%2!=0){System.out.println(p);}});

        System.out.println("===========================================");

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Anel Adilbayeva", "Aygun Abbasova Jarullah",
                "Jilili Jiwuer", "Ali Ismayilov"));

        employees.forEach(p-> {
            System.out.println(p.charAt(0) + "." + p.charAt(p.lastIndexOf(" ")+1));
        });

        System.out.println("===========================================");

        Function<int[], List<Integer>> convertArrToList;
        convertArrToList = (a)-> {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
              result.add(a[i])  ;
            }
            return result;
        };

        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<Integer> resultList = convertArrToList.apply(arr);
        System.out.println("resultList = " + resultList);

        System.out.println("===========================================");

        Function<List<Integer>, int[]> convertToArr =
                (a) -> {
                    int[] arr2 = new int[a.size()] ;
                    for (int i = 0; i < a.size(); i++) {
                        arr2[i]= a.get(i);
                    }
                    return arr2;
                };

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,34,5));
        System.out.println("convertToArr.apply(numbers) = " + Arrays.toString(convertToArr.apply(numbers)));

        // create a function that can return the maximum number from an int array
        Function<int[], Integer> maxNumberInArray ;
        maxNumberInArray = (a)->{
            Integer max = Integer.MIN_VALUE;
            for (int each : a) {
                if (each>max){
                    max=each;
                }
            }
            return max;
        };
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        System.out.println("maxNumberInArray = " + maxNumberInArray.apply(arr1));


        // create a function that can swap the first and last elements of an array
        Consumer<String []> swapElements;
        swapElements = (a)-> {
            String temp = a[0];
            a[0] = a[a.length-1];
            a[a.length-1]=temp;

        };

        String[] strArray = {"Hasan", "Ali", "Zehra", "Huseyin", "Osman", "123456"};
        swapElements.accept(strArray);
        System.out.println("strArray = " + Arrays.toString(strArray));


        // Create a function that can reverse an array and returns it
        Function<int[], int[]> reverseArray;
        reverseArray = (a) -> {
            int[] reversedArray = new int[a.length];
            int k = a.length-1;
            for (int each : a) {
              reversedArray[k--] = each;
            }
            return reversedArray;
        };

        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] newArray = reverseArray.apply(arr2);
        System.out.println(Arrays.toString(newArray));

        // create a function that can reverse a List

        Function<List<Integer>, List<Integer>> reverseList;
        reverseList = (a)-> {
            List<Integer> reversedList = new ArrayList<>();
            for (int i = a.size() - 1; i >= 0; i--) {
             reversedList.add(a.get(i));
            }

            return reversedList;
        };

        List<Integer> listInt = new LinkedList<>(Arrays.asList(1,2,3,4));
        System.out.println(reverseList.apply(listInt));

    }
}
