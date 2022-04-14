package FreeTimePractices;

public class IfStatementGradeReport {

    public static void main(String[] args) {

        char grade = 'C';

        if (grade == 'A') {
            grade = 'A';
        }
        else if (grade == 'B') {
            grade = 'B';
        }
        else if (grade == 'C') {
            grade = 'C';
        }
        else if (grade == 'D') {
            grade = 'D';
        }
        else if (grade == 'E') {
            grade = 'E';
        }
        else grade = 'F';

        System.out.println("grade = " + grade);



    }
}
