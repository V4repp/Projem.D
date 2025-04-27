package test.odev.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_Mi {
    public static <ch1> void main(String[] args) {
        /*Anagram mı?
         3 adet char array, içerisinde farklı sıralanmış karakterler olsun.
         Bu iki array'i karşılaştırdığımızda her ikisinde de aynı karakter aynı sayıda mı, eğre aynı iseler anagramdır, aksi halde değillerdir. */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen karakter/ler giriniz.");
        String str1 = scan.next();
        String[] ch1 = new String[]{str1};

        System.out.println("2. karakter/leri giriniz.");
        String str2 = scan.next();
        scan.nextLine();
        String[] ch2 = new String[]{str2};

        System.out.println("3. karakter/leri giriniz.");
        String str3 = scan.next();
        String[] ch3 = new String[]{str3};

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        //Arrays.sort(ch3);

        boolean bl1 = (Arrays.equals(ch1, ch2));
        boolean bl2 = (Arrays.equals(ch2, ch3));
        boolean bl3 = (Arrays.equals(ch1, ch3));

        if (bl1 == true && bl2 == true && bl3 == true) {
            System.out.println("1., 2. ve 3. karakterleriniz anagramdır.");

        } else if (bl1== true) {
            System.out.println("1. ve 2. karakterleriniz anagramdır.");

        } else if (bl2 == true) {
            System.out.println("2. ve 3. karakterşeriniz anagramdır.");

        } else if (bl3 == true) {
            System.out.println("1. ve 3. karakterleriniz anagramdır.");

        } else if (bl1 == false && bl2 == false && bl3 == false) {
            System.out.println("1.,2. ve 3. karakterleriniz anagram değildir.");

        } else if (bl1 == false) {
            System.out.println("1. ve 2. karakterleriniz anagram değildir.");

        } else if (bl2 == false) {
            System.out.println("2. ve 3. karakterleriniz anagram değildir.");

        } else if (bl3 == false) {
            System.out.println("1. ve 3. karakterleriniz anagram değildir.");

        } else if (bl1 == false && bl2 == false && bl3 == false) {
            System.out.println("1.,2. ve 3. karakterleriniz anagram değildir.");
        } else {
            System.out.println("1., 2. ve 3. karakterleriniz anagramdır.");
        }
    }
}