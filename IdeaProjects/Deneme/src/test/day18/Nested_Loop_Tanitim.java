package test.day18;

public class Nested_Loop_Tanitim {
    public static void main(String args[]) {


        {
            // Outer Loop
            for (int i = 1; i <= 3; i++) {//i=1/ i=2
                // Inner Loop
                for (int j = 1; j <= 3; j++) {// i=1, j=1// i=1, j=2// i=1, j=3   // i=2, j=1// i21, j=2// i=2, j=3
                    System.out.print("(" + i + "," + j + ")" + " ");
                }
                System.out.println();
            }

        }
        System.out.println("------------------------------------ Ödev -----------------------------------------------");
        for (int s = 1; s <=9;s++) {
            for (char h ='A'; h<='Z';h++ ){
                System.out.print("("+h+","+s+")"+" ");
            }
            System.out.println();
        }

    }
}

