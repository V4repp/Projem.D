package test.day11_for_loop_döngü;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
       // Kullanıcının girdiği bir Stringi tersten yazan bir program yazınız...
        // "Ey Edip Adanada pide ye"  ==> ey edip adanadA pidE Ye
                // Ersin ==> nisrE

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime veya cümle giriniz...");
        String kelime=scan.nextLine(); //Ersin
                                       //01234

        String sonuc="";//n/i/s/r/E
                        //0/1/2/3/4


        for(int i=kelime.length()-1; i>=0;i--){//4/3/2/1

            sonuc+= kelime.charAt(i);//n/i/s/r/E
           // sonuc=sonuc+kelime.charAt(i);

        }
        System.out.println("sonuc = " + sonuc);


    }
}
