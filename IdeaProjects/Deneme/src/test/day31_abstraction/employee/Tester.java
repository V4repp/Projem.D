package test.day31_abstraction.employee;

public class Tester extends Employee {
    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" uygulamayı test ediyor.");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" 8 saat uyuyor.");
    }

    public void bugReport(){
        System.out.println(getName()+" is creating bug reports");
    }
}
