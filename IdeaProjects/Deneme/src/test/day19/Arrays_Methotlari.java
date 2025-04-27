package test.day19;

import java.util.Arrays;

public class Arrays_Methotlari {
    public static void main(String[] args) {
        //------------------------------------  Copy Of Method -------------------------------
        System.out.println("------------------ Copy Of Method ------------------------------- ");
        int[] sayi = new int[]{10, 20, 43, 68, 92, 100, 946};

        int[] sayi2 = Arrays.copyOf(sayi, 5);
        System.out.println(Arrays.toString(sayi2)); //[10, 20, 43, 68, 92]

        int[] sayi4 = Arrays.copyOf(sayi, sayi.length);

        int [] sayi6 =Arrays.copyOf(sayi2,7);
        System.out.println(Arrays.toString(sayi6));






        //------------------------------------  Copy Of Range Method -------------------------------
        System.out.println("------------------ Copy Of Range Method ------------------------------- ");

        int[] sayi3 = Arrays.copyOfRange(sayi, 2, 4);
        System.out.println(Arrays.toString(sayi3));


        int []sayi7 = Arrays.copyOfRange(sayi3,0,5);
        System.out.println(Arrays.toString(sayi7));




//------------------------------------  Equals Method -------------------------------
        System.out.println("------------------ Equals Method ------------------------------- ");

        boolean bl =Arrays.equals(sayi,sayi3);
        System.out.println(bl);

        int[] sayi5 = new int[]{10, 20, 43, 68, 92, 946, 100};
        boolean bl1=Arrays.equals(sayi,sayi4);
        boolean bl2=Arrays.equals(sayi,sayi5);
        System.out.println(bl1);
        System.out.println(bl2);

        //------------------------------------  Sort Method -------------------------------
        System.out.println("------------------  Sort Method ------------------------------- ");

       Arrays.sort(sayi);
        System.out.println("sayi= "+ Arrays.toString(sayi));

        Arrays.sort(sayi5);
        System.out.println("sayi5= "+Arrays.toString(sayi5));

        boolean bl3=Arrays.equals(sayi,sayi5);
        System.out.println("bl3 = " + bl3);


    }
}
