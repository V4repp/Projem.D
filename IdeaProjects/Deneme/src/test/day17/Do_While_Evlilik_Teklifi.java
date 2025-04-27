package test.day17;

import java.util.Scanner;

public class Do_While_Evlilik_Teklifi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String cevap;
        String cevap_2="";

        do{
            System.out.println("Benimle evlenir misin?");
             cevap=scan.next();

        }while (cevap.equalsIgnoreCase("Hayır"));



      /*  System.out.println("Benimle evlenir misin?");
        cevap_2=scan.next();

while (cevap_2.equalsIgnoreCase("Hayır")){
    System.out.println("Benimle evlenir misin?");
    cevap_2=scan.next();
}*/

        System.out.println("Tebrik ederim.");




    }
}
