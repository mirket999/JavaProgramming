package day39_Recap.practiceTasks.studentTask;

public class CydeoStudent extends Student{
    private int batchNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, String fieldOfStudy, int studentId, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, fieldOfStudy, "CYDEO", studentId, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){
            System.out.println("batchNumber can not be zero or negative.");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber<=0){
            System.out.println("groupNumber can not be zero or negative.");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage.isEmpty()){
            System.out.println("programmingLanguage can not be empty.");
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void eat() {
        System.out.println("Cydeo student " + getName() + " is eating.");
    }

    @Override
    public void drink() {
        System.out.println("Cydeo student " + getName() + " is drinking.");
    }

    @Override
    public void sleep() {
        System.out.println("Cydeo student " + getName() + " is sleeping.");
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                ", Name =" + getName() +
                ", Age =" + getAge() +
                ", gender=" + getGender() +
                ", Student ID=" + getStudentId() +
                ", Field of Study=" + getFieldOfStudy() +
                ", Grade =" + getGrade() +
                ", School Name =" + getSchoolName() +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
