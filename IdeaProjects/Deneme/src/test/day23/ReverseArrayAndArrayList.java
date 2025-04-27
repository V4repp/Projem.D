package test.day23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {


        System.out.println(" ------------------------------------ Reversing Array ----------------------------");

        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] reversedArray = new int[intArray.length];

        System.out.println("reversedArray = " + Arrays.toString(reversedArray));
        System.out.println("intArray = " + Arrays.toString(intArray));

        int j=0;
        for (int i = intArray.length - 1; i >= 0 ; i--,j++){ //i=5, j=0 /i=4, j=1 /

            reversedArray[j]=intArray[i]; // reversedArray[0]=intArray[5] / reversedArray[1]=intArray [4]

        }
        System.out.println("reversedArray = " + Arrays.toString(reversedArray));


        System.out.println();
        System.out.println(" ------------------------------------ Reversing ArrayList ----------------------------");

        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        ArrayList<Integer> reversedArrayList = new ArrayList<>();

        for (int i = intArrayList.size() -1;i >= 0 ;i--){
            reversedArrayList.add(intArrayList.get(i));
        }
        System.out.println("reversedArrayList = " + reversedArrayList);
    }
}
