package utilities;

import java.util.Arrays;

public class ArraysUtility {


    //prints each integer of an integer array in seperate lines
    public static void printEachElement(int [] array){
        for (int each : array){
            System.out.println(each);
        }
    }

    //prints each double of an double array in seperate lines
    public static void printEachElement(double [] array){
        for (double each : array){
            System.out.println(each);
        }
    }

    //prints each char of an char array in seperate lines
    public static void printEachElement(char [] array){
        for (char each : array){
            System.out.println(each);
        }
    }

    //prints each String of an String array in seperate lines
    public static void printEachElement(String [] array){
        for (String each : array){
            System.out.println(each);
        }
    }

    //returns max number for integer array
    public static int max (int [] array){
    Arrays.sort(array);
    return array[array.length-1];

    }

    //returns max number for double array
    public static double max (double [] array){
        Arrays.sort(array);
        return array[array.length-1];

    }

    //returns max number for long array
    public static long max (long [] array){
        Arrays.sort(array);
        return array[array.length-1];

    }

    //returns max number for short array
    public static short max (short [] array){
        Arrays.sort(array);
        return array[array.length-1];

    }

    //returns max number for byte array
    public static byte max (byte [] array){
        Arrays.sort(array);
        return array[array.length-1];

    } 

    //returns min number for integer array
    public static int min(int [] array){
        Arrays.sort(array);
        return array[0];
    }

    //returns min number for double array
    public static double min(double [] array){
        Arrays.sort(array);
        return array[0];
    }

    //returns min number for long array
    public static long min(long [] array){
        Arrays.sort(array);
        return array[0];
    }

    //returns min number for short array
    public static short min(short [] array){
        Arrays.sort(array);
        return array[0];
    }

    //returns min number for float array
    public static float min(float [] array){
        Arrays.sort(array);
        return array[0];
    }

    //returns min number for byte array
    public static byte min(byte [] array){
        Arrays.sort(array);
        return array[0];
    }

    //checks if the given integer is contained in the given array. return boolean.
    public static boolean contains (int [] array, int element){
        boolean result = false;
        for (int each : array){
            if (element == each) {
                result = true;
                break;
            }
        }
        return result;
    }

    //checks if the given double is contained in the given array. return boolean.
    public static boolean contains (double [] array, double element){
        boolean result = false;
        for (double each : array){
            if (element == each) {
                result = true;
                break;
            }
        }
        return result;
    }

    //checks if the given char is contained in the given array. return boolean.
    public static boolean contains (char [] array, char element){
        boolean result = false;
        for (char each : array){
            if (element == each) {
                result = true;
                break;
            }
        }
        return result;
    }

    //checks if the given String is contained in the given array. return boolean.
    public static boolean contains (String [] array, String element){
        boolean result = false;
        for (String each : array){
            if (element.equalsIgnoreCase(each)) {
                result = true;
                break;
            }
        }
        return result;
    }

    //merges two integer arrays. returns int [] array.
    public static int [] merge (int [] array1, int [] array2){
        //different approach for this task:
        /*
        int [] result = {};

        for (int each : array1) {
         result = addElement(result, each);
        }
        for (int each : array2) {
        result = addElement(result, each);
        }
         */
        int [] array3 = new int[array1.length+ array2.length];
        int count = 0;
        for (int element : array1) {
        array3[count++] = element;
        }
        for (int element : array2) {
         array3[count++]=element;
        }
        return array3;
    }

    //merges two double arrays. returns double [] array.
    public static double [] merge (double [] array1, double [] array2){
        //different approach for this task:
        /*
        double [] result = {};

        for (double each : array1) {
         result = addElement(result, each);
        }
        for (double each : array2) {
        result = addElement(result, each);
        }
         */
        double [] array3 = new double[array1.length+ array2.length];
        int count = 0;
        for (double element : array1) {
            array3[count++] = element;
        }
        for (double element : array2) {
            array3[count++]=element;
        }
        return array3;
    }

    //merges two char arrays. returns char [] array.
    public static char [] merge (char [] array1, char [] array2){
        //different approach for this task:
        /*
        char [] result = {};

        for (char each : array1) {
         result = addElement(result, each);
        }
        for (char each : array2) {
        result = addElement(result, each);
        }
         */
        char [] array3 = new char[array1.length+ array2.length];
        int count = 0;
        for (char element : array1) {
            array3[count++] = element;
        }
        for (char element : array2) {
            array3[count++]=element;
        }
        return array3;
    }

    //merges two String arrays. returns String [] array.
    public static String [] merge (String [] array1, String [] array2){
        //different approach for this task:
        /*
        String [] result = {};

        for (String each : array1) {
         result = addElement(result, each);
        }
        for (String each : array2) {
        result = addElement(result, each);
        }
         */
        String [] array3 = new String[array1.length+ array2.length];
        int count = 0;
        for (String element : array1) {
            array3[count++] = element;
        }
        for (String element : array2) {
            array3[count++]=element;
        }
        return array3;
    }

   //reverses an integer array.
    public static int [] reverse(int [] array){
        //different approach:
        /*
         int[] result = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
         */

        //different approach using addElement custom method:
        /*
        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
         */
        int [] reversed = new int[array.length];
        int count = reversed.length-1;  //we use counter as forr loop.
        for (int element : array) {
            reversed[count--]= element; //reversed [] arrays index number changes as 5, 4, 3, ...
        }
        return reversed;
    }

    //reverses an double array.
    public static double [] reverse(double [] array){
        //different approach:
        /*
        double[] result = new double[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];

        }
         */
        double [] reversed = new double[array.length];
        int count = reversed.length-1;  //we use counter as forr loop.
        for (double element : array) {
            reversed[count--]= element; //reversed [] arrays index number changes as 5, 4, 3, ...
        }
        return reversed;
    }

    //reverses an char array.
    public static char [] reverse(char [] array){
        //different approach:
        /*
         char[] result = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

         */
        char [] reversed = new char[array.length];
        int count = reversed.length-1;  //we use counter as forr loop.
        for (char element : array) {
            reversed[count--]= element; //reversed [] arrays index number changes as 5, 4, 3, ...
        }
        return reversed;
    }

    //reverses a String array.
    public static String [] reverse(String [] array){
        //different approach:
        /*
                String[] result = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }
         */
        String [] reversed = new String[array.length];
        int count = reversed.length-1;  //we use counter as forr loop.
        for (String element : array) {
            reversed[count--]= element; //reversed [] arrays index number changes as 5, 4, 3, ...
        }
        return reversed;
    }

    //returns the frequency of the given element from the given int [] array.
    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (element == each) {
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given double [] array.
    public static int frequencyOfElement(double[] array, double element) {
        int count = 0;
        for (double each : array) {
            if (element == each) {
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given char [] array.
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (element == each) {
                count++;
            }
        }
        return count;
    }

    //returns the frequency of the given element from the given String [] array.
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (element.equalsIgnoreCase(each)) {
                count++;
            }
        }
        return count;
    }

    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addElement(int[] array, int element){
        int[] array1 = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            array1[i++] = each;
        }

        array1[i] = element;

        return array1;
    }

    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    // returns unique elements in an int [] array and assigns to a new array.
    public static int[] unique(int[] array) {
        int[] result = {};
        int count = 0;
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    // returns unique elements in an double [] array and assigns to a new array.
    public static double [] unique(double[] array) {
        double [] result = {};
        int count = 0;
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    // returns unique elements in an char [] array and assigns to a new array.
    public static char [] unique(char[] array) {
        char [] result = {};
        int count = 0;
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    // returns unique elements in an String [] array and assigns to a new array.
    public static String [] unique(String[] array) {
        String [] result = {};
        int count = 0;
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //removes the index from the array, returns new array
    public static int[] removeElement(int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    // replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {
        //My approach:
       /*
        int i = 0;
        for (int each : array) {
            if (each == oldValue) {
                array[i] = newValue;
            }
            i++;
        }
        return array;
    }

        */

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }

        return array;


    }

    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }

        return array;

    }

    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }

        return array;

    }

    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals( oldValue) ) {
                array[i] = newValue;
            }

        }

        return array;

    }

    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};//{1,

        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};//{1,

        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};//{1,

        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};//{1,

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }

    //the method inserts the given element to the given index of the array and returns the new array
    public static int[] insert(int[] array, int index, int element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }

    //the method inserts the given element to the given index of the array and returns the new array
    public static double[] insert(double[] array, int index, double element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }

    //the method inserts the given element to the given index of the array and returns the new array
    public static char[] insert(char[] array, int index, char element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }

    //the method inserts the given element to the given index of the array and returns the new array
    public static String[] insert(String[] array, int index, String element){

        if(index < 0 || index >= array.length){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length+1];
        result[index] = element;

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(i == index){
                j++;
            }
            result[j] = array[i];
        }

        return result;
    }

    //the method swaps the element at index a with the element at index b, and returns the new array
    public static int[] swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    //the method swaps the element at index a with the element at index b, and returns the new array
    public static double[] swap(double[] array, int i, int j){
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    //the method swaps the element at index a with the element at index b, and returns the new array
    public static char[] swap(char[] array, int i, int j){
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    //the method swaps the element at index a with the element at index b, and returns the new array
    public static String[] swap(String[] array, int i, int j){
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }

    //checks if the password is strong and returns boolean.
    public static boolean isStrongPassword(String password){
        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false; // has upper case
        boolean r3 = false; //has lower case
        boolean r4 = false; //has special char
        boolean r5 = false; // has digit

        char[] chars = password.toCharArray();

        for (char each : chars) {

            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r5 = true;
            }else{ // special char
                r4 = true;
            }

        }

        return r1 && r2 && r3 && r4 && r5;
    }
}


