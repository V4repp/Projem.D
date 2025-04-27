package test.day12;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Write a program that can check if the given String is palindrome

        Scanner scan=new Scanner(System.in);
        System.out.println("Kelime Giriniz: ");
        String kelime=scan.nextLine();

        String sonuc="";

        for (int i=kelime.length()-1;i>=0;i--){

            sonuc+=kelime.charAt(i);

        }
        if (sonuc.equalsIgnoreCase(kelime)){
            System.out.println("Bu kelime palindromdur.");
        }else {
            System.out.println("Bu kelime bir palondrom değildir.");
        }

    }
}
