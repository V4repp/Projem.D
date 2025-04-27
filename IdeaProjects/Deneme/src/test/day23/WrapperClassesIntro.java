package test.day23;

public class WrapperClassesIntro {public static void main(String[] args) {

    int num1 = 200; // Primitive data type

    // Long n1 =num1;
    Integer n1 = num1; //autoboxing ==> Non-Primitive Data Type

    int num2 = n1;  //unboxing  ==> Non-Primitive Data Type ==> Primitive Data Type

    System.out.println("------------------------------------");


    Integer integerValue = 100; // Non-primitive

    long longValue = integerValue; // Unboxing ==> Primitive Data Type

    Byte b1 = 25; // Non-primitive

    byte a1 = b1; // Unboxing ==> Primitive Data Type
    short a2 = b1; // Unboxing ==> Primitive Data Type
    int a3 = b1; // Unboxing ==> Primitive Data Type
    long a4 = b1; // Unboxing ==> Primitive Data Type

    System.out.println("------------------------------------");

    int num3 = 200; // Primitive data type
    // Long l2 = num3;
    //  Double d1 = num3;

    Integer num4 = num3; //autoboxing ==> Non-Primitive


    System.out.println("------------------------------------");

    Integer z = 900;
    Integer y =z;

    System.out.println("---------------------------------");

    int[] numbers1 = {1,2,3,4,5};
    Integer[] numbers2 = {1,2,3,4,5};



}

}
