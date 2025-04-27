package test.day11;

import java.util.Scanner;

public class For_Loop3 {
    public static void main(String[] args) {



        Scanner input= new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int num1= input.nextInt();
        input.nextLine();

        int sonuc_2 = 1;

        for (int i = num1; i >0 ; i--) {//5/4/3/2/1

            sonuc_2=sonuc_2*i;//5/20/60/120/120

        }

        System.out.println("sonuc_2 = " + sonuc_2);

    }
}
