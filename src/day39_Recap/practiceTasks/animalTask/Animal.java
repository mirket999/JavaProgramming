package day39_Recap.practiceTasks.animalTask;

public class Animal {
 /*
 Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()   
  */
    private String name, breed, color, size;
    private char gender;
    private int age;

    public Animal(String name, String breed, String color, String size, char gender, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.out.println("Name can not be null");
            System.exit(1);
        }
        if (name.isBlank() || name.isEmpty()){
            System.out.println("Name can not be empty or blank");
            System.exit(1);   
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed==null){
            System.out.println("breed can not be null");
            System.exit(1);
        }
        if (breed.isBlank() || breed.isEmpty()){
            System.out.println("breed can not be empty or blank");
            System.exit(1);
        }
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null){
            System.out.println("color can not be null");
            System.exit(1);
        }
        if (color.isBlank() || color.isEmpty()){
            System.out.println("color can not be empty or blank");
            System.exit(1);
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender=='M' || gender=='F')){
            System.out.println("Gender can only be M or F.");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("Age can not be under zero.");
            System.exit(1);
        }
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void drink(){
        System.out.println(name + " is drinking.");
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    public void move(){
        System.out.println(name + " is moving.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
