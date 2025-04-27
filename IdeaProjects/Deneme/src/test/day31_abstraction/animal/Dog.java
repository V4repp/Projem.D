package test.day31_abstraction.animal;

public class Dog extends Animal {
    boolean topOynuyorMu ;

    public Dog(String breed, char gender, String color, String size, int age, String name,boolean topOynuyorMu) {
        super(breed, gender, color, size, age, name);
        this.topOynuyorMu=topOynuyorMu;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating a bone");
    }
}
