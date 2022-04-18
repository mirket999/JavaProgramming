package day39_Recap.practiceTasks.studentTask;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name, int age, char gender, String fieldOfStudy, String schoolName, int studentId, char grade) {
        super(name, age, gender, fieldOfStudy, schoolName, studentId, grade);
    }

    @Override
    public void study() {
        System.out.println("Under Graduate student " + getName() + " is studying.");
    }
}
