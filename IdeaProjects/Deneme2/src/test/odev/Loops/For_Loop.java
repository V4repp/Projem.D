package test.odev.Loops;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        /*4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2*/
       /*Ödevin... Burada yine dışarıdan kullanıcının girdiği Stringi alarak onun
        içinde kaç adet java ayzılı, onu bulan bir program yazacağız...,*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle = scan.next();

        System.out.println("Java kelimesi aranıyor...");
        String java = scan.next();
        scan.next();
        int tekrarsayisi = 0;

        for (int i = cumle.length() - 1; i >= 0; i--) {

            if (java.equalsIgnoreCase("" + cumle.charAt(i))) {
                tekrarsayisi++;
            }


        }
        System.out.println("Girdiğiniz cümlede " + tekrarsayisi + " tane java kelimesi bulunuyor.");


    }
}
