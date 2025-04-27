package test.day05;

public class MatematikOperatorleri {
    public static void main(String[] args) {
      int num1=-40;
      int num2=10;
      int num3=3;
      double db1=5.5;
      double db2=12.5;
      double db3=9.9;
      double db4=50.1;

      int sonuc1=num1+num2;
        System.out.println("sonuc1 = " + sonuc1);

        int sonuc2=num1-num2;
        System.out.println("sonuc2 = " + sonuc2);

        System.out.println(num1*num3);

        double sonuc3= (double) num1 /num2;
        System.out.println("sonuc3 = " + sonuc3);


        int  sonuc4=(int)sonuc3;
      System.out.println("sonuc4 = " + sonuc4);

      int sonuc5=num2/num3;

      System.out.println("sonuc5 = " + sonuc5);

      double sonuc6= (double) num2 /num3;
      System.out.println("sonuc6 = " + sonuc6);

      int sonuc7=num2%num3; //10%3
      System.out.println("sonuc7 = " + sonuc7);

    }
}
