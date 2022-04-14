package day33_Statics.PracticeTasks.CydeoStudentTask;

public class CydeoStudentObjects {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Omer", "EU8", 25, 456231, 15);
        System.out.println(student1);
        student1.study();
        student1.attendClass();
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();
        
    }
}
