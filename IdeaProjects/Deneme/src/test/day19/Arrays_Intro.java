package test.day19;

import test.day21.Custom_Methods;

import java.util.Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {
        int[] sayilar = new int[11];

        System.out.println(sayilar); // [I@5f184fc6 ==> Hash code

        System.out.println(Arrays.toString(sayilar));//[0, 0, 0, 0, 0]

        sayilar[4] = 4;
        sayilar[3] = 3;
        sayilar[2] = 2;
        sayilar[1] = 1;
        sayilar[0] = 0;
        System.out.println(Arrays.toString(sayilar)); //[0, 1, 2, 3, 4]
        // sayilar[5]=5; // .ArrayIndexOutOfBoundsException

        String[] isimler = new String[3];
        System.out.println(Arrays.toString(isimler)); //[null, null, null]
        String[] kelime = new String[6];         //  Bunları
        String[] kelime1 = new String[]{"we"};   //  Rastgele
        String[] kelime2 = {"ewfw"};             //  Yaptım ama olabilicek 3 tane durum bunlar.
        isimler[0] = "Hello";
        isimler[1] = "World";
        isimler[2] = "Ali";

        System.out.println(Arrays.toString(isimler)); //[Hello, World, Ali]
        isimler[1] = "Mehmet";
        System.out.println(Arrays.toString(isimler));


        for (int i = 0; i <= 10; i++) {
            sayilar[i] += 10;
        }
        System.out.println(Arrays.toString(sayilar));


        double[] sayilar_2 = {1.1, 1.2, 1.3};
        String[] ogrenciler = {"Mehmet", "Ahmet", "Ayşe"};
        System.out.println(Arrays.toString(sayilar_2)); //[1.1, 1.2, 1.3]
        System.out.println(Arrays.toString(ogrenciler)); //[Mehmet, Ahmet, Ayşe]

        System.out.println("--------------------------------------------------------------");

        /*1. create an array named classmates, and store 10 of your classmates' full names
        print the initials of each classmates in separate lines bbbb bb        bvb vbvbv bvb bv v v bv v v             vvvc c c c  */

        String adiSoyadi = "Mehmet Yılmaz";

        char ch1 = adiSoyadi.charAt(0); // M
        char ch2 = adiSoyadi.charAt(adiSoyadi.indexOf(" ") + 1); // Y

        System.out.println(ch1 + "." + ch2 + ".");


        Custom_Methods.karsilama();
        Custom_Methods cm = new Custom_Methods();
        cm.ugurlama();


    }
}
