package day23_CustomMethods_Void;

public class PracticeTask_CalculateGrade {
    //TASK:
    /*
     create a method that can calculate the grade of the student based
on the score
     */

    public static void main(String[] args) {
     calculateGrade(90);
    }

    public static void calculateGrade (int score){
        String grade = "Invalid score";
        if (score>=0 && score<=100){
            grade = (score>=90)? "A" :(score>=70)? "B" :(score>=50)? "C" : "F";
        }
        System.out.println("Grade is: " + grade);
    }
}
