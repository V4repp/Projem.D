package test.day20;

import java.util.Arrays;

public class Array_Exe {
    public static void main(String[] args) {

        int[] notlar = new int[]{20, 60, 45, 79, 95, 19, 38};

        int minimumNot = 101;

        for (int i = 0; i < notlar.length; i++) {

            if (notlar[i] < minimumNot) {
                minimumNot = notlar[i];
            }

        }

        System.out.println("minimumNot = " + minimumNot);

        int maximumNot=0;
        for (int i =0;i<notlar.length;i++){
            if (notlar[i]>maximumNot){
                maximumNot = notlar[i];
            }
        }
        System.out.println("maximumNot = " + maximumNot);

        // Sort
        Arrays.sort(notlar);
        System.out.println(Arrays.toString(notlar));//[19, 20, 38, 45, 60, 79, 95]

        System.out.println("minimumNot " + notlar[0] + " maximumNot "+notlar[notlar.length-1]);
    }
}
