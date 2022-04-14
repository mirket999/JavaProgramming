package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Omer";
        String lastName = "Demirel";
        int age = 36;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;


        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is: " + firstName + " " + lastName);
        System.out.println("Full name of the person is: " + fullName);

        // --- is -- years old.
        System.out.println(fullName + " is " + age + " years old.");

        // FullName is JobTitle, works at CompanyName and Fullname's salary is ---
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + " and " + fullName + "'s salary is $" + salary + ".");


    }
}
