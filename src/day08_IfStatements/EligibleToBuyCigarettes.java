package day08_IfStatements;

public class EligibleToBuyCigarettes {

    public static void main(String[] args) {
        byte age = 15;
        boolean IsEligibleToBuyCigarettes = age >= 20;
        boolean IsNotEligibleToBuyCigarettes = !IsEligibleToBuyCigarettes;

        if (IsEligibleToBuyCigarettes){
            System.out.println("You are eligible to buy cigarettes.");
        }
        if (IsNotEligibleToBuyCigarettes)System.err.println("You are not eligible to buy cigarettes!");

        System.out.println("------------------------------------");


    byte gradeLevel = 35;
    boolean elementarySchool = gradeLevel >= 1 && gradeLevel <= 5;
    boolean middleSchool = gradeLevel >= 6 && gradeLevel <= 8;
    boolean highSchool = gradeLevel >= 9 && gradeLevel <= 12;
    boolean college = gradeLevel >= 13 && gradeLevel <= 16;
    boolean gradSchool = gradeLevel >= 17 && gradeLevel <= 18;

    if (elementarySchool){
        System.out.println("That person is in Elemantary School." );
    }

    if (middleSchool){
            System.out.println("That person is in Middle school." );
        }
    if (highSchool){
            System.out.println("That person is in High School." );
        }
    if (college){
            System.out.println("That person is in College." );
        }
    if (gradSchool){
            System.out.println("That person is in Grad School." );
        } else System.err.println("INVALID VALUE!!!");

        System.out.println("----------------------------------------");

    int n1 = 200;
    int n2 = 200;

    boolean maxN1 = n1 > n2;
    boolean maxN2 = n2 > n1;
    boolean equal = n1 == n2;

    if (maxN1){
        System.out.println(n1 + " is the maximum number.");
    }
    if (maxN2){
        System.out.println(n2 + " is the maximum number.");
    }

    if (equal){
        System.out.println(n1 + " is equal to " + n2);
    }

    }



}
