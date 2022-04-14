package week06;

import java.util.Scanner;

public class BasicLoopExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid upper bound :");
        int upperBound = scan.nextInt();
        int sum =0;
        boolean check = true;  // initialization

        for(  ; check   ;  ) {

            if (upperBound > 0) {
                for (int i = 0; i <= upperBound; i++) {
                    sum += i;
                }
                check = false;  // iteration
            } else {
                System.out.println("Invalid number. Try again:");
                upperBound = scan.nextInt();
            }

        }


        System.out.println("sum = " + sum);


        }

    }



