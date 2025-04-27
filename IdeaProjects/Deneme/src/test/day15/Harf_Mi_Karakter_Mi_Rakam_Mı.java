package test.day15;

import java.util.Scanner;

public class Harf_Mi_Karakter_Mi_Rakam_Mı {
    public static void main(String[] args) {

        /*5. write a program that can retrieve the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#! */
        String karakterler = "";
        String rakamlar = "";
        String harfler = "";

        //String str2="WoodenSpoon1165435é''^'!>+3";

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String giriniz: ");
        String str1 = scan.nextLine();

        for (int i =0; i< str1.length() ; i++) {

            char ch = str1.charAt(i);
            //System.out.println(ch);
            if ((ch >='A' && ch <='Z') || (ch >='a' && ch <='z')) {

                harfler += ch;

            } else if (ch >='0' && ch <='9') {

                rakamlar += ch;

            } else {

                karakterler += ch;

            }
        }
        System.out.println("harfler = " + harfler);
        System.out.println("rakamlar = " + rakamlar);
        System.out.println("karakterler = " + karakterler);

    }
}
