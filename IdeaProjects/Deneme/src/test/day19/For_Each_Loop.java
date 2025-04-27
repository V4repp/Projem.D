package test.day19;

import java.util.Arrays;

public class For_Each_Loop {
    public static void main(String[] args) {

        String[] kelimeler = new String[]{"ağaç", "araba", "park", "kalem"};

       /* System.out.println(kelimeler[0]);
        System.out.println(kelimeler[1]);
        System.out.println(kelimeler[2]);
        System.out.println(kelimeler[3]);*/

        for (String herBirKelime : kelimeler) {
            System.out.println(herBirKelime);
        }

        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int herBirSayi : sayilar) {
            System.out.println("herBirSayi = " + herBirSayi);
        }


        System.out.println("------------------ String'i Array'e Çevirme --------------------------");

        String str1 = "Ahmet Mehmet Hasan ve Ayşe top oynadılar";

        String[] str2 = str1.split(" ");
        System.out.println(Arrays.toString(str2));

        String str3 = "4,5,6,9,10,60,46,32";
        String[] sayilar2 = str3.split(","); // ==>  String [] sayilar2={"4","5","6","9","10","60","46","32"}

        System.out.println("str3 = " + str3);
        System.out.println("sayilar2 = " + Arrays.toString(sayilar2));


    }
}
