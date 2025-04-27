package test.day15;

import test.day13.While_Loop;

import java.util.Scanner;

public class While_Loop_Log_in {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        String kullaniciAdi = scan.next();



        System.out.print("Şifrenizi giriniz: ");
        String sifre = scan.next();

        System.out.println();

        if (kullaniciAdi.equals("Muhammet") && sifre.equals("Muhammet123")) {
            System.out.println("Giriş yaptınız.");
        } else {

            int deneme_sayisi = 3;
            while (!(kullaniciAdi.equals("Muhammet") || sifre.equals("Muhammet123")) && deneme_sayisi > 0) {


                System.out.println("Kullanıcı adı veya şifreniz yanlıştır, lütfen tekrar deneyiniz.");
                System.out.print("Kullanıcı adınızı giriniz: ");
                kullaniciAdi = scan.next();


                System.out.print("Şifrenizi giriniz: ");
                sifre = scan.next();
                System.out.println();
                deneme_sayisi--;

            }

            if (kullaniciAdi.equals("Muhammet") && sifre.equals("Muhammet123")) {
                System.out.println("Giriş yaptınız.");
            } else {
                System.out.println("Kullanıcı kilitlendi...");
            }

        }

        scan.close();
    }
}
