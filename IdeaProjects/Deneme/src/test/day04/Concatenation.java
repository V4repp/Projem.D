package test.day04;

public class Concatenation {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";
        int num1=100;
        int num2=200;
        double db1=5.5;
        boolean dy1=true;
        char ch1='!';


        System.out.println(str1+str2); //HelloWorld
        System.out.println(str1+" "+str2); //Hello World
        System.out.println(str1+" "+str2+ch1);//Hello World!
        System.out.println("//////////////////////////////////////////");


        System.out.println(num1+num2);//300
        System.out.println(str1+num1+num2);//Hello100200
        System.out.println(str1+(num1+num2));//Hello300
        System.out.println(" "+num1+num2);// 100200
        System.out.println(ch1+num1+num2);// 333
        System.out.println(str1+ch1+num1+num2);// 100200
        System.out.println("ch1 = " + ch1);
        System.out.println("(str1+ch1) = " + (str1 + ch1));
        System.out.println("(ch1+num1+num2+str2+(num1+ch1)+num2) = " + (ch1 + num1 + num2 + str2 + (num1 + ch1) + num2));
        System.out.println("(ch1+num1+num2+str2+(num1+ch1)+num2) = " + (ch1 + num1 + num2 + str2 + num1 + ch1 + num2));


        System.out.println(num1+num2+str1+num1+num2);

    //Yani sadece String'den sonra "+"nın görevi değişir ve
        // o andan itibaran kendisinden sonraki gelen data
        // tipi ne olursa olsun, hepsine String muamelesi
        // yapar. Hepsini String gibi düşünerek işlem yapar...



    }
}
