package test.day21;

import test.day19.Arrays_Intro;

public class Custom_Methods {

  //  Custom_Methods cm=new Custom_Methods();
    public static void main(String[] args) {

        karsilama();
        Custom_Methods cm = new Custom_Methods();
        cm.ugurlama();


        System.out.println("Return_Type_Methods.toplama(4,8) = " + Return_Type_Methods.toplama(4, 8));

    }

    public static void karsilama() {// static methodlar class'a aittir. Class ismi ile çağırılır.
        int a = 10;
        int b = 20;
        System.out.println("Merhaba hoşgeldiniz.");
        System.out.println("Nasılsınız?");
        System.out.println("Programımızı nasıl buldunuz.");
        System.out.println("(a+b) = " + (a + b));

    }

    public void ugurlama() {// non-static veya instance methodlar class'a ait değildir. Class'tan oluşturulan object üzrinden çağırılabilir.

        System.out.println("Güle güle");
        System.out.println("Hoşçakalın.");
        System.out.println("Yine bekleriz.");
    }

    public void deneme(){
        Custom_Methods cm=new Custom_Methods();
        cm.ugurlama();
        System.out.println("Denedik");
    }
}
