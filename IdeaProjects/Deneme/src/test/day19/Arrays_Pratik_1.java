package test.day19;

import java.util.Arrays;

public class Arrays_Pratik_1 {
    public static void main(String[] args) {

        char[] harfler = new char[26];

        char ch = 'A';

        for (int i = 0; i <= harfler.length-1 ; i++,ch++) {
           // System.out.print(harfler[i]);

            harfler[i]=ch;

           // System.out.println();
            System.out.print(harfler[i]+" ");
           // ch++;


        }

        System.out.println();
        System.out.println("harfler = " + Arrays.toString(harfler));


    }
}
