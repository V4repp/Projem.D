package test.odev;

public class Odev06 {
    public static void main(String[] args) {

int num1=10;
num1++;//Print edilirse 10 olur ama sonraki olaylarda 11 gözükür.
        System.out.println("(num1+1) = " + (num1+1)+num1++);//(num1+1)=1211 olur.
--num1;//tekrardan 11 olur.
num1=num1+10;//21 olur.
++num1;//22 olur
        System.out.println("num1 = " + num1);//num1 = 22


    }
}
