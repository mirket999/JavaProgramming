package KodlamaVakti;
/////////////////ATAMA OPERATORLERI///////////////
public class Operatorler {
    public static void main(String[] args) {

        int a = 10,
                b = 5,
                toplam = a + b,
                cikarma = a - b,
                carpma = a * b,
                bolme = a / b,
                mod = a % b;

        System.out.println("toplam = " + toplam);
        System.out.println("cikarma = " + cikarma);
        System.out.println("carpma = " + carpma);
        System.out.println("bolme = " + bolme);
        System.out.println("mod = " + mod);

        // 1 ekleme / 1 cıkarma
        toplam++;
        cikarma--;
        System.out.println("toplam = " + toplam);
        System.out.println("cikarma = " + cikarma);

        /////////////
        int sayi1 = 8, sayi2 = 4;
        sayi1 += 2;
        sayi2 *= 4;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
///////////////////////
        // KOSUL OPERATORLERI

        boolean kosul = (a / b) == 2;
        System.out.println("kosul = " + kosul);

        ///////////////////////////////////////////////

        boolean kosul1 = a > b,
                kosul2 = a >= 11,
                kosul3 = kosul1 && kosul2,
                kosul4 = kosul1 || kosul2;

        System.out.println("kosul3 = " + kosul3);
        System.out.println("kosul4 = " + kosul4);

        /////////////////////////////////////////////////
    }
}
