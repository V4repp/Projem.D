package test.day31_abstraction.animal;

public class Eagel extends Animal implements Flyable{
    public Eagel(String breed, char gender, String color, String size, int age, String name) {
        super(breed, gender, color, size, age, name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a rabbit.");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flying.");
    }
}
