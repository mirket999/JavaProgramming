package day39_Recap.practiceTasks.studentTask;

public class Student extends Person {
    /*
    Create a subclass of Person named Student:
				Extra variables:
						studentId, fieldOfStudy, grade, schoolName

				Encapsulate all the fields

				Add a constructor that can set all the fields

							Condition:
									1. filedOfStudy and schoolName should not be set to null
									2. filedOfStudy and schoolName should not be empty
									3. grade must be valid (A, B, C, D, F)


				Extra methods:
					study()
					toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included
     */
    private String fieldOfStudy, schoolName;
    private int studentId;
    private char grade;

    public Student(String name, int age, char gender, String fieldOfStudy, String schoolName, int studentId, char grade) {
        super(name, age, gender);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setStudentId(studentId);
        setGrade(grade);
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isEmpty()) {
            System.out.println("fieldOfStudy can not be null or empty.");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null || schoolName.isEmpty()) {
            System.out.println("schoolName can not be null or empty.");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (!(grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F')){
            System.out.println("Grade must be valid.");
            System.exit(1);
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName() + " is studying.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + getName() + '\'' +
                ", Age ='" + getAge() + '\'' +
                ", gender ='" + getGender() + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }
}
