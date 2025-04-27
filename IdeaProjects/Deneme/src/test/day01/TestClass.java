package test.day01;

import test.day26.StaticMembers;
import test.day28.encapsulation.Student;

public class TestClass {
    public static void main(String[] args) {
        StaticMembers.metod1();

        StaticMembers object = new StaticMembers();
        object.metod2();

        Student student = new Student();

        student.setName("Ersin");
        System.out.println(student.getName());

    }
}
