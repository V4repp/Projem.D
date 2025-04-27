package test.odev.ArrayList;

import java.sql.Array;
import java.util.*;


public class StrongPasswordEX {
    public static void main(String[] args) {

        //String password = "WoodenSpoon123!"

        // ArrayList<String> password = new ArrayList<>();
        //password.add("WoodenSpoon123!");

        // 1. Password'ü kullanıcıdan al...//Scanner ==> String (String [] arrPassword=password.split("")==> Array ==> ArrayList<Character> passwordArrayList = new ArrayList<> (Arrays.asList(arrPassword));
        // 2. Karakter sayısı en az 8 olmalı
        // 3. Rakam içermeli
        // 4. Büyük harf içermeli
        // 5. Küçük harf içermeli
        // 6. Özel karakter içermeli

        Scanner scan = new Scanner(System.in);
        System.out.println("Parolanızı giriniz...");
        String password = scan.next();

        char[] charArrayPassword = password.toCharArray();
        //System.out.println("charArrayPassword = " + Arrays.toString(charArrayPassword));

        boolean sizeBigger_8 = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isDigit = false;
        boolean isSpecialCharacter = false;

       /* String[] arrPassword=password.split("");
        System.out.println("arrPassword = " +  Arrays.toString(arrPassword));

        ArrayList<String> passwordArrayList = new ArrayList<>(Arrays.asList(arrPassword));
        System.out.println("passwordArrayList = " + passwordArrayList);*/


        if (charArrayPassword.length > 8) {
            sizeBigger_8 = true;
        }


        for (int i = 0; i < charArrayPassword.length; i++) {
            if (Character.isUpperCase(charArrayPassword[i])) {
                isUpperCase = true;
                //System.out.println("isUpperCase = " + charArrayPassword[i] + "--> " + isUpperCase);
            } else if (Character.isLowerCase(charArrayPassword[i])) {
                isLowerCase = true;
                //System.out.println("isLowerCase = "+ charArrayPassword[i] + "--> "  + isLowerCase);
            } else if (Character.isDigit(charArrayPassword[i])) {
                isDigit = true;
                //System.out.println("isDigit = "+ charArrayPassword[i] + "--> "  + isDigit);
            } else {
                isSpecialCharacter = true;
               // System.out.println("isSpecialCharacter = "+ charArrayPassword[i] + "--> "  + isSpecialCharacter);
            }
        }


        if (sizeBigger_8 && isSpecialCharacter && isDigit && isLowerCase && isUpperCase) {
            System.out.println("Parolanız güçlü bir paroladır. ");
        } else if (!sizeBigger_8) {
            System.out.println("Parolanın uzunluğu 8 karakterden fazla olmalıdır.");
        } else if (!isSpecialCharacter) {
            System.out.println("Parolanızda özel karakter bulunmalıdır.");
        } else if (!isDigit) {
            System.out.println("Paralonızda sayı bulunmalıdır.");
        } else if (!isLowerCase) {
            System.out.println("Parolanızda küçük harf bulunmalıdır.");
        } else {
            System.out.println("Parolanızda büyük harf bulunmalıdır.");
        }
        scan.close();
    }
}
