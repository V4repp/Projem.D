package test.day31_abstraction.employee;

public final class Developer extends Employee { // Bir daha extend yapılmaz final yapılırsa.


    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" program yazıyor...");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" 6 saat uyur...");
    }

    public void unitTest(){
        System.out.println(getName()+" is unit testing");
    }
}
