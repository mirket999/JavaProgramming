package day43_Abstraction.animalTask;

public class Tiger extends Animal{

    public Tiger() {
        super("Tiger");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is eating tiger food.");
    }
}
