package day39_Recap.practiceTasks.studentTask;

public class GraduateStudent extends Student{

    public GraduateStudent(String name, int age, char gender, String fieldOfStudy, String schoolName, int studentId, char grade) {
        super(name, age, gender, fieldOfStudy, schoolName, studentId, grade);
    }

    @Override
    public void study() {
        System.out.println("Graduate student " + getName() + " is studying.");
    }
}
