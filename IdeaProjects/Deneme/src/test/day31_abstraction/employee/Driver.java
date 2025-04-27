package test.day31_abstraction.employee;

public class Driver extends Employee {

    public Driver(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {

    }

    @Override
    public void sleep() {

    }
     public void driving(){
         System.out.println(getName()+" driving car.");
     }
}
