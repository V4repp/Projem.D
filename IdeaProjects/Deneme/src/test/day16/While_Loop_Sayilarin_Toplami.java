package test.day16;

import java.util.Scanner;

public class While_Loop_Sayilarin_Toplami {
    public static void main(String[] args) {

        /* 2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.

            hint: you need an infinite loop */


        int sonuc = 0;

        Scanner scan = new Scanner(System.in);
     /*   System.out.println("Sayı giriniz: ");
        int sayi = scan.nextInt();

        while (sayi > 0) {
            sonuc += sayi;

            System.out.println("Tekrar sayı giriniz: ");
            sayi = scan.nextInt();

        }

        System.out.println("Girdiğiniz pozitif sayıların toplamlarının sonucu_While Loop = " + sonuc);*/


        int sayi_1;
        do {
            System.out.println("Sayı giriniz: ");
            sayi_1 = scan.nextInt();
            sonuc += sayi_1;
        } while (sayi_1 > 0);

        System.out.println("Girdiğiniz pozitif sayıların toplamlarının sonucu_Do while loop = " + sonuc);

    }
}
