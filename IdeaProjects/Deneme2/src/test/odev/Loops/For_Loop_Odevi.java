package test.odev.Loops;

import java.util.Scanner;

public class For_Loop_Odevi {
    public static void main(String[] args) {
        //2. Kullanıcının girdiği sayının faktoriyel sonucunu hesaplayan bir program yazınız:
        //            Örnek:
        //                input: 5
        //                output: 120
        //
        //                	( 5! = 5 * 4 * 3 * 2* 1 = 120 )
        Scanner m = new Scanner(System.in);
        System.out.println("Bir kelime veya çümle giriniz: ");
        String kelime = m.nextLine();
        String sonuc = "";

        for (int i = kelime.length() - 1; i >= 0; i--) {

            sonuc += kelime.charAt(i);

        }
        System.out.println("sonuc = " + sonuc);

    }
}

