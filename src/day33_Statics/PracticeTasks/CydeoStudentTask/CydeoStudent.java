package day33_Statics.PracticeTasks.CydeoStudentTask;

public class CydeoStudent {
    //TASK:
    /*
    Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
     */
   public String name, batchNumber;
   public int age, id, groupNumber;
   public static String schoolName, programmingLanguage;

    public CydeoStudent(String name, String batchNumber, int age, int id, int groupNumber) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.age = age;
        this.id = id;
        this.groupNumber = groupNumber;
    }
    public void study(){
        System.out.println(name + " is studing.");
    }
    public void attendClass(){
        System.out.println(name + " is attending the class.");
    }
    public static void printSchoolName(){
        System.out.println("Cydeo School");
    }
    public static void printProgLanguage(){
        System.out.println("Java");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
