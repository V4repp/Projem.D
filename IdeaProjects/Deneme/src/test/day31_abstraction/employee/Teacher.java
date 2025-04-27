package test.day31_abstraction.employee;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {

    }

    @Override
    public void sleep() {

    }
    public void teach (){
        System.out.println(getName()+" it teaches something for studens");
    }
}
