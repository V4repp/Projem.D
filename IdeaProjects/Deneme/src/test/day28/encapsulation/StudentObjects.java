package test.day28.encapsulation;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("","Pekuslu",116,963,"10/C");
        Student student = new Student();
        System.out.println("student1 = " + student1);
        //student.setName(null);
        student.setAge(18);
        student.setClassNum("10/B");
        student.setLastName("Pekuslu");
        student.setSchoolID(732);
        System.out.println("student = " + student);


        student1.setClassNum("10/A");
        student1.setName("Muhammet Ali");
        student1.setAge(12);
        System.out.println("student1.getAge() = " + student1.getAge());
        System.out.println("student1 = " + student1);
    }
}
