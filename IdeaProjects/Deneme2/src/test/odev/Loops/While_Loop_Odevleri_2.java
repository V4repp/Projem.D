package test.odev.Loops;

import java.util.Scanner;

public class While_Loop_Odevleri_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        String kullaniciAdi = scan.next();

        System.out.print("Şifrenizi giriniz: ");
        String sifre = scan.next();


        if (kullaniciAdi.equals("Muhammet") || sifre.equals("Muhammet123")) {

            System.out.println("Giriş yaptınız.");

        } else {
            int denemesayisi = 3;
            while (!(kullaniciAdi.equals("Muhammet") || sifre.equals("Muhammet123")) && denemesayisi > 0) {
                System.out.println("Kullanıcı adınız veya şifreniz yanlıştır. Tekrar deneyiniz.");

                System.out.print("Kullanıcı adınızı giriniz: ");
                kullaniciAdi = scan.next();

                System.out.print("Şifrenizi giriniz: ");
                sifre = scan.next();
                denemesayisi--;
            }
            if (kullaniciAdi.equals("Muhammet") && sifre.equals("Muhammet123")) {
                System.out.println("Giriş yaptınız.");
            } else {
                System.out.println("Kullanıcı kilitlendi...");
            }
        }
    }
}