package test.day11;

import java.util.Scanner;

public class For_Loop2 {
    public static void main(String[] args) {

        /* 1. 1'den başlayarak kullanıcının girdiği sayıya kadar tüm sayıların toplamını veren bir program yazınız. (Bitiş sayısını kullanıcı programı çalıştırınca girecek şekilde)
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int num1 = input.nextInt();
        input.nextLine();

        int sonuc = 0;

        for (int i = 1; i <= num1; i++) {

            sonuc = sonuc + i;

        }

        System.out.println("sonuc = " + sonuc);




    }
}