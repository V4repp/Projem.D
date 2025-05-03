package Odev;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
       /* 1. Create a class named ChooseLanguage. Given an integer variable named selection that has a
        number between 1~5, write a program that selects the language based on the number provided in
        the selection and prints the following message:

        for 1: Hello, thank you for your call
        for 2: Hola, gracias por llamar
        for 3: Merhaba, aradığınız için teşekkürler
        for 4: Привет, спасибо за ваш звонок
        for 5: Merci, pour votre appel

        Example:
        selection = 3;

        Output:
        Merhaba, aradiginiz icin tesekkurler */
        /*Yapılacaklar scanner oluşturulacak ardından if olur belki bundanda sonra bunlar
         ok olacak bro xd*/

        Scanner input = new Scanner(System.in);
        System.out.print("Dil seçiniz NOT:1 -> İngilizce/ 2 -> İspanyolca/ 3 -> Türkçe/" +
                " 4 -> Rusça/ 5 -> Fransızca  : ");//println
        int dil = input.nextInt();

        if (dil == 1){
            System.out.println("Hello, thank you for your call");
        } else if (dil == 2) {
            System.out.println("Hola, gracias por llamar");
        }else if (dil == 3) {
            System.out.println("Merhaba, aradığınız için teşekkürler");

        }else if (dil == 4) {
            System.out.println("Привет, спасибо за ваш звонок");
        }else if (dil == 5) {
            System.out.println("Merci, pour votre appel");
        }else {
            System.out.println("1 ile 5 arasında bir sayı seçiniz...");
        }
    }
}
