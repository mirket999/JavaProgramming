package week01;

public class CastingPractices {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;

        double d = 15.5;
        int i = (int) d;
        String str = "abc";
        String str2 = "Hello";
        str2 = str2.substring(0,2).toUpperCase();
        System.out.println(str2);
    }
}
