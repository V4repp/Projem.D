package test.day12;

import java.util.Scanner;

public class Karakter_Sayisi_Bulma {
    public static void main(String[] args) {
        // Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
        //                 Ex:
        //                inputs:
        //                    str = "aabcccd";
        //                    char = 'c';
        //
        //                output: 3
        //
        //                inputs:
        //                    "Java programming language"
        //                    'g'
        //
        //                output: 4

        Scanner scan = new Scanner(System.in);
        System.out.print("Kelime Giriniz: ");//kelime için ==> Adana
        String kelime = scan.nextLine();

        System.out.println("Karakter Giriniz: ");//Karakter için ==>a
        String karakter = scan.next();//next =tek kelime için /nextLine = birde veya daha fazlası için

        int tekrarSayisi=0;



        for (int i = kelime.length() - 1; i >= 0; i--) {//tersten

            if(karakter.equalsIgnoreCase(""+kelime.charAt(i))) {
                tekrarSayisi++;
            }

        }

        //for (int i = 0; i <= kelime.length() - 1; i++){} düzden


        System.out.println("tekrarSayisi = " + tekrarSayisi);

    }
}
