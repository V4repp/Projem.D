package test.day31_abstraction.animal;

public class Shark extends Animal{
    public Shark(String breed, char gender, String color, String size, int age, String name) {
        super(breed, gender, color, size, age, name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a fish.");
    }
}
