package test.day03_type_casting_tip_degistirme;

public class TypeCasting {
    public static void main(String[] args) {
        byte num1=24;//-128--127
        System.out.println("num1 = " + num1);

        num1= 12;
        System.out.println("num1 = " + num1);

        int num2=num1;

        double num3=num2;

        double num4=5.5;
        int num5= (int) num4;
        System.out.println("num5 = " + num5);


        byte num6= (byte) num5;

    }
}
