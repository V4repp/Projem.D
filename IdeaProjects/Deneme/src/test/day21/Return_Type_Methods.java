package test.day21;

import test.day22.Sahis_Isimleri;

public class Return_Type_Methods {
    public static void main(String[] args) {

        int d = 10;
        int e = 50;

        int f = (d + e) * toplama(7, 3);//(10+50)*(7+3) / argüman parantezdeki girdiğimiz sayılar !!! (7, 3)
        System.out.println("f = " + f);

        double db1 = toplama(6, 9) * carpma(4.7, 2.3);
        System.out.println(db1);

        Sahis_Isimleri.isimler();
        Sahis_Isimleri.toplam(5, 6);
    }

    //public static void hello (){} // genellikle voidler print yapmak için kullanılırmış !
    public static int toplama(int a, int b) {// parametre parantez içi !!! (int a, int b)
        int c = a + b;
        return c;
    }

    public static double carpma(double db1, double db2) {

        return db1 * db2;
    }


}
