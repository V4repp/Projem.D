package test.day20;

import java.util.Arrays;

public class Multidimentional_Arrays {
    public static void main(String[] args) {

        int[][] num1 = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 5, 6, 3}};
        //      0,1,2   0,1,2,3,4   0,1,2,3
        //         0         1           2

        System.out.println("num1 = " + Arrays.deepToString(num1));

        for (int[] herBirTekBoyuluArray : num1) {

            System.out.println("herBirTekBoyuluArray = " + Arrays.toString(herBirTekBoyuluArray));

            for (int tekBoyutluArrayElemenlari : herBirTekBoyuluArray) {
                System.out.println("tekBoyutluArrayElemenlari = " + tekBoyutluArrayElemenlari);

            }

        }

        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < num1.length; i++) {

            System.out.println(Arrays.toString(num1[i]));

            for (int j = 0; j < num1[i].length; j++) {

                System.out.println(num1[i][j]);

            }
            System.out.println("------------------------------------------ Benim Yaptığım ---------------");
            for (int [] a : num1){
                System.out.println("a = "+ Arrays.toString(a));
                for (int a2:a){
                    System.out.println("a2 = "+a2);
                }
            }

        }

    }
}
