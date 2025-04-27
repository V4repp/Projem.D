package test.odev.methods;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class Methods_Exe_1_2_3 {
    public static void main(String[] args) {
        System.out.println("---------------- İnt ------------------------------");

        int[] intArray_1 = new int[]{1, 3, 5, 743, 242};
        int[] intArray_2 = new int[]{0, 2, 543, 876, 1000};
        int[] result = birlestirmeArr_1(intArray_1, intArray_2);
        System.out.println("result = " + Arrays.toString(result));

        int[] intArray_3 = new int[]{0, 2, 543, 876, 1000};
        int[] intArray_4 = new int[]{0, 2, 543, 876, 1000};
        // geridenyazdirma(intArray_3,intArray_4);

        System.out.println("-------------- Double -----------------------------");

        double[] doubleArray_1 = new double[]{2.3, 76.7, 8.0, 12.4};
        double[] doubleArray_2 = new double[]{1.3, 32., 65.8, 21.5};
        double[] result_2 = birlestirmeArr_2(doubleArray_1, doubleArray_2);
        System.out.println("result_2 = " + Arrays.toString(result_2));

        System.out.println("------------- Char ---------------------------------");

        char[] charArray_1 = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] charArray_2 = new char[]{'W', 'o', 'r', 'l', 'd'};
        char[] result_3 = birlestirmeArr_3(charArray_1, charArray_2);
        System.out.println("result_3 = " + Arrays.toString(result_3));

        System.out.println("---------------- String ----------------------------");

        String[] stringArray_1 = new String[]{"Hello", "World"};
        String[] stringArray_2 = new String[]{"Ben", "Muhammet", "Ali"};
        String[] result_4 = birlestirmeArr_4(stringArray_1, stringArray_2);
        System.out.println("result_4 = " + Arrays.toString(result_4));

        System.out.println("-------------- Minnum int ----------------------------");

        int[] intMinNumner = new int[]{3, 32, 6757, 45, 86, 4645, 4234, 2};
        minNumberOfArr_1(intMinNumner);

        System.out.println("------------- Minnum double --------------------------");

        double[] doubleMinNumner = new double[]{5.7, 10.9, 12.8, 56.4, 52.1};
        minNumberOfArr_2(doubleMinNumner);

        System.out.println("------------- Minnum long ----------------------------");

        long[] longMinNumner = new long[]{141134, 53434, 10000, 21444, 96786};
        minNumberOfArr_3(longMinNumner);

        System.out.println("------------ Minnum short-----------------------------");

        short[] shortMinNum = new short[]{-6, 2, 4, -1, 12, -22};
        minNumberOfArr_4(shortMinNum);

        System.out.println("------------ Minnum float -----------------------------");

        float[] floatMinNumber = new float[]{213.4f, 432.3f, 654.2f, 876.1f, 23.8f};
        minNumberOfArr_5(floatMinNumber);

        System.out.println("------------ Minnum byte ------------------------------");

        byte [] byteMinNumber=new byte[]{-127,-57,35,14,42};
        minNumberOfArr_6(byteMinNumber);

        System.out.println("------------  Reverse int -----------------------------");
        /*int [] intReverse = new int[]{1,43,235,53754,8769,67};
        reverse_1(intReverse);*/





    }

   /*1. create a method that can merge two integer arrays.+

	2. create a method that can merge two double arrays.+

	3. create a method that can merge two char arrays.+

	4. create a method that can merge two String arrays. + */




    public static int[] birlestirmeArr_1(int[] intArray_1, int[] intArray_2) {

        int sonucLenght = intArray_1.length + intArray_2.length;

        int[] sonuc = new int[sonucLenght];

        for (int i = 0; i < intArray_1.length; i++) {//4
            sonuc[i] = intArray_1[i];
        }

        for (int i = intArray_1.length, j = 0; i < sonucLenght; i++, j++) {

            sonuc[i] = intArray_2[j];

        }

        return sonuc;
    }

    public static double[] birlestirmeArr_2(double[] doubleArray_1, double[] doubleArray_2) {
        double[] sonucDB = new double[doubleArray_1.length + doubleArray_2.length];

        for (int i = 0; i < doubleArray_1.length; i++) {
            sonucDB[i] = doubleArray_1[i];
        }
        for (int j = 0, i = doubleArray_1.length; i < sonucDB.length; i++, j++) {
            sonucDB[i] = doubleArray_2[j];
        }
        return sonucDB;
    }

    public static char[] birlestirmeArr_3(char[] charArray_1, char[] charArray_2) {
        char[] sonucCH = new char[charArray_1.length + charArray_2.length];

        for (int i = 0; i < charArray_1.length; i++) {
            sonucCH[i] = charArray_1[i];

        }
        for (int j = 0, i = charArray_1.length; i < sonucCH.length; i++, j++) {
            sonucCH[i] = charArray_2[j];
        }
        return sonucCH;
    }

    public static String[] birlestirmeArr_4(String[] stringArray_1, String[] stringsArray_2) {

        String[] sonucStr = new String[stringArray_1.length + stringsArray_2.length];

        for (int i = 0; i < stringArray_1.length; i++) {
            sonucStr[i] = stringArray_1[i];
        }
        for (int j = 0, i = stringArray_1.length; i < sonucStr.length; i++, j++) {
            sonucStr[i] = stringsArray_2[j];
        }

        return sonucStr;
    }

    /*Task 3:
        1. create a method that can return the min number from an integer array     +

        2. create a method that can return the min number from double array        +

        3. create a method that can return the min number from long array        +

        4. create a method that can return the min number from short array       +

        5. create a method that can return the min number from float array      +

        6. create a method that can return the min number from byte array       +   */

    public static void minNumberOfArr_1(int[] intArrsayi) {

        Arrays.sort(intArrsayi);
        int Minnum = intArrsayi[0];
        System.out.println("Minnum = " + Minnum);
    }

    public static void minNumberOfArr_2(double[] doubleArrsayi) {

        Arrays.sort(doubleArrsayi);
        double Minnum = doubleArrsayi[0];
        System.out.println("Minnum = " + Minnum);
    }

    public static void minNumberOfArr_3(long[] longArrsayi) {

        Arrays.sort(longArrsayi);
        long Minnum = longArrsayi[0];
        System.out.println("Minnum = " + Minnum);
    }

    public static void minNumberOfArr_4(short[] shortArrsayi) {

        Arrays.sort(shortArrsayi);
        short Minnum = shortArrsayi[0];
        System.out.println("Minnum = " + Minnum);
    }

    public static void minNumberOfArr_5(float[] floatArrsayi) {

        Arrays.sort(floatArrsayi);
        float Minnum = floatArrsayi[0];
        System.out.println("Minnum = " + Minnum);
    }

    public static void minNumberOfArr_6(byte[] byteArrsayi) {

        Arrays.sort(byteArrsayi);
        byte Minnum = byteArrsayi[0];
        System.out.println("Minnum = " + Minnum);
    }

    /*Task 4:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array */

    public static void reverseArr(int [] inrreverse){
        int [] reverse= new int [inrreverse.length];
        for (int i = inrreverse.length-1,j=0; i >=0 ; i--,j++) {

            reverse[j]+=inrreverse[i];

        }

        System.out.println("reverse = " + Arrays.toString(reverse));
    }

public static void reverseArr(double []doublereverse){




}

}





