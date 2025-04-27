package test.odev.Loops;

import java.util.Scanner;


public class For_Loop_Calismasi {
    public static void main(String[] args) {

        /* 1'den  100 dahil çift sayıların toplamını veren
         bir program yazınız.*/
        int num1=0;

        for(int s=0;s<=100;s+=2){
            num1=num1+s;
        }
        System.out.println("num1 = " + num1);

        /* 1. 1'den başlayarak kullanıcının girdiği sayıya
         kadar tüm sayıların toplamını veren bir program
          yazınız. (Bitiş sayısını kullanıcı programı
           çalıştırınca girecek şekilde)
         */

        Scanner scan=new Scanner(System.in);

        System.out.print("Bitiş sayısı giriniz: ");
        int bs = scan.nextInt();
        scan.nextLine();

        int sayi = 0 ;

        for (int e = 1 ; e <= bs ; e++){

            sayi = sayi + e;

        }
        System.out.println("sayı= " + sayi);
        /* Kullanıcının girdiği sayının faktoriyel sonucunu hesaplayan bir program yazınız:

        Örnek:

        input: 5
        output: 120

        ( 5! = 5 * 4 * 3 * 2* 1 = 120 )*/

        System.out.print("Lütfen bir sayı giriniz ");
        int num2=scan.nextInt();
        scan.nextLine();

        int sonuc=1;

        for (int i = num2; i>0 ; i--){//5-4

            sonuc= sonuc * i;//5-20

        }
        System.out.println("Girdiğiniz sayının faktoriyeli "+sonuc);












    }
}
