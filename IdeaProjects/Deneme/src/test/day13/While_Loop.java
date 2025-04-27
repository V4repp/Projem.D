package test.day13;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        //Kullanıcının girdiği sayının pozitif veya negatif olduğunu bulan bir program yapalım


        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scan.nextInt();
        scan.nextLine();

        boolean sart = true;

        while (sart) {

            if (sayi > 0) {
                System.out.println("Girdiğiniz sayı pozitiftir: " + sayi);
            } else if (sayi < 0) {
                System.out.println("Girdiğiniz sayı negatiftir: " + sayi);

            } else {

                System.out.println("Girdiğiniz sayı sıfırdır: " + sayi);
            }

            System.out.println("Tekrar sayı girmek ister misiniz? E/H");
            String cevap = scan.nextLine();

            if (cevap.equalsIgnoreCase("h")){
                break;
            }else if (!(cevap.equalsIgnoreCase("e"))||(cevap.equalsIgnoreCase("h"))){
                System.out.println("Girdiğiniz cevap yanlıştır.");
                break;
            }

            System.out.print("Lütfen yeni sayıyı giriniz: ");
            sayi = scan.nextInt();
            scan.nextLine();

        }

        System.out.println("Programımızı kullandığınız için teşekkür ederiz.");

    }
}
