package test.day09_swich_statiment_and_scanner_workout_or_sworkout;


import java.util.Scanner;

public class ScannerCalismasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Adınızı giriniz: ");//println
        // String adi = input.next();
        String adi = input.nextLine();

        System.out.println("adi = " + adi);


        System.out.print("Soy adınızı giriniz: ");
        String soyAdi = input.next();
        // input.nextLine();

        System.out.print("Yaşınız: ");
        int yas = input.nextInt();
        input.nextLine();

        System.out.println("----------------------------------------------------------------------");

        System.out.println("Maaşınız: ");
        double maas=input.nextDouble();
        input.nextLine();

        System.out.println("maas = " + maas);

        System.out.print("Adınız ve Soyadınız: ");
        String adSoyad = input.nextLine();


        // System.out.println("adi = " + adi);
        System.out.println("soyAdi = " + soyAdi);
        System.out.println("adSoyad = " + adSoyad);
        System.out.println("yas = " + yas);
    }
}
