package test.day22;

import java.util.Arrays;

public class Maximum_Number_Of_Array {
    public static void main(String[] args) {

        int[] intArray = new int[]{5, 8, 12, 76, 34};
        maxNumberOfArr(intArray);

        int[] intArray_1 = new int[]{56, 89, 1000, 8, 6, 78, 2};
        maxNumberOfArr(intArray_1);
        System.out.println(Arrays.toString(intArray_1));

        double[] doubleArray = new double[]{23.4, 78.3, 1.6, 100.9};
        maxNumberOfArr(doubleArray);

        long [] longArray =new long []{43252,1231,99999,100000};
        maxNumberOfArr(longArray);

        short [] shortArray = new short[]{-5,-23,-32,21,10};
        maxNumberOfArr(shortArray);
    }


    public static void maxNumberOfArr(int[] intArray) {


        Arrays.sort(intArray);
        // System.out.println(Arrays.toString(intArray));
        int maxNum = intArray[intArray.length - 1];

        System.out.println("max Number of array= " + maxNum);

    }


    public static void maxNumberOfArr(double[] doubleArray) {

        Arrays.sort(doubleArray);
        double maxNum_1 = doubleArray[doubleArray.length - 1];

        System.out.println("max Number of array= " + maxNum_1);
    }

    public static void maxNumberOfArr (long[]longArray){

        Arrays.sort(longArray);
        long maxNum_2=longArray[longArray.length-1];

        System.out.println("max Number of array= "+maxNum_2);

    }
    public static void maxNumberOfArr (short []shortArray){

        Arrays.sort(shortArray);
        short maxNum_3=shortArray[shortArray.length-1];

        System.out.println("max Number of array= "+maxNum_3);

    }
}
