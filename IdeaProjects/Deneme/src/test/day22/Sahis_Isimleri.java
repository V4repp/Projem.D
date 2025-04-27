package test.day22;

import java.util.Scanner;

public class Sahis_Isimleri {
    public static void main(String[] args) {
        email();
        isimler();
    }

    public static void isimler() {

        Scanner scan = new Scanner(System.in);

        System.out.println("İsminizi giriniz. ");
        String isimler=scan.next();
        scan.nextLine();

        System.out.println("Soyadınızı giriniz. ");
        String sayadlari = scan.next();

        System.out.println(isimler.charAt(0)+" "+(sayadlari.charAt(0)));
    }

    public static void email(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Epostanızı giriniz. ");
        String eposta=scan.next();

        System.out.println(eposta.substring(eposta.indexOf('@')+1,eposta.indexOf('.')));


    }


    public static int toplam (int a,int b) {

        int c = a+b;
        return c;


    }

    public static int toplam (int a,int b,int c){

        return a+b+c;


    }
    public static int toplam (int a,int b,int c,int d){
    return a+b+c+d;
    }

    public static double toplam (double a,int b) {

        double c = a+b;
        return c;


    }


    public static double toplam (int a,double b) {

        double c = a+b;
        return c;


    }
}
