package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {

        // IMPLICIT CASTING:(smaller is being casted to larger)

        byte a = 100;
        short b = a;
        //For short is larger than byte, we do not need to use casting operator
        //short b = (short)a

        int c = b;
        // int c = (int)b

        long d = c;
        // = (long)c

    float e = d;
    double f = e;
        System.out.println("--------------------------------------------------");

        // EXPLICIT CASTING:(larger is being casted to smaller."needs to be casted manually")

        int x = 55;
        short y = (short)x;

        long j = 1000000;
        short k = (short)j;

        System.out.println(x + " : " + y);
        System.out.println(j + " : " + k);

        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n;

        System.out.println(n + " : " + s);

        System.out.println("------------------------------");

        //SHORTCUT FOR EXPLICIT CASTING: while standing on red error line, ALT+ENTER --> cast to...

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1 + " : " + s1);
    }
}
