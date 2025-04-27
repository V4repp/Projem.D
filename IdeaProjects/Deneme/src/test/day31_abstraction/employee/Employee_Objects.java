package test.day31_abstraction.employee;

public class Employee_Objects {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Muhammet",16,'E',1,"Yazılım mühendisi",63_423);

        Tester tester1 = new Tester("Ersin",50,'E',2,"Tester",51_753);

        Driver driver1 = new Driver("Ali",30,'E',5,"Taxi driver",20_000);

        Teacher teacher1 = new Teacher("Yağmur",25,'K',65,"Turksh teacher",30_000);

    }

}
