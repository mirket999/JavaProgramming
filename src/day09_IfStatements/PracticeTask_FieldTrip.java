package day09_IfStatements;

import java.util.Scanner;
/*
Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your grade. Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */
public class PracticeTask_FieldTrip {
    public static void main(String[] args) {


      String message ;
      String  trip1 = "grade - 1\nlocation -  Apple orchard\nnumber of groups - 3\nteacher in charge - Ms. Smith",
              trip2 = "grade - 2\nlocation -  Zoo\nnumber of groups - 7\nteacher in charge - Mr. Lee",
              trip3 = "grade - 3\nlocation -  Aquarium\nnumber of groups - 5\nteacher in charge - Ms. Wilson",
              trip4 = "grade - 4\nlocation -  Movie theater\nnumber of groups - 2\nteacher in charge - Ms. Reyes",
              trip5 = "grade - 5\nlocation -  Museum\nnumber of groups - 5\nteacher in charge - Ms. Lela",
              trip6 = "grade - 6\nlocation -  Six Flags\nnumber of groups - 6\nteacher in charge - Mr. Watt";

      //Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter your grade level between 1 - 6:");
        int grade = new Scanner(System.in).nextInt();

      //int grade = scanner.nextInt();

      if (grade < 1 || grade > 6) {
          System.out.println("Please enter a valid grade level");
      }
      else {

          if (grade == 1) {
              message = trip1;
          } else if (grade == 2) {
              message = trip2;
          } else if (grade == 3) {
              message = trip3;
          } else if (grade == 4) {
              message = trip4;
          } else if (grade == 5) {
              message = trip5;
          } else {
              message = trip6;
          }
          System.out.println(message);
      }
    }
}
