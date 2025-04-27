package test.odev.Loops;

import java.util.Scanner;

public class While_Loop_Odevleri_1 {
    public static void main(String[] args) {

/* 2. Write a program that calculates the sum of numbers entered by the user until
 user enters a negative number.

            hint: you need an infinite loop */
        int sonuc = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();

        while (sayi > 0) {

            sonuc += sayi;
            System.out.print("Tekrar sayı giriniz: ");
            sayi = scan.nextInt();


        }
        System.out.println("sonuc = " + sonuc);
        scan.close();
    }
}
