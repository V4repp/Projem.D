package test.day19;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Pratik_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç tane sayı girmek istersiniz?");
        int kapasite = scan.nextInt();

        if (kapasite <= 0) {

            System.out.println("Girdiğiniz sayı 0'dan büyük olmalıdır. Lütfen programı yeniden çalıştırınız.");
            System.exit(0);

        }

        int[] sayilar = new int[kapasite];

        for(int i=0;i<kapasite;i++){

            System.out.println((i+1)+"'inci/ıncı sayıyı giriniz:");


            sayilar[i]= scan.nextInt();
        }

        System.out.println("Girdiğiniz sayılar: "+Arrays.toString(sayilar));

        String [] HaftaninGunleri = new String [7];

        HaftaninGunleri[0]="Pazartesi";
        HaftaninGunleri[1]="Salı";
        HaftaninGunleri[2]="Çarşamba";
        HaftaninGunleri[3]="Perşembe";
        HaftaninGunleri[4]="Cuma";
        HaftaninGunleri[5]="Cumartesi";
        HaftaninGunleri[6]="Pazar";

        System.out.println(Arrays.toString(HaftaninGunleri));

        String [] aylar= new String []{"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};

        System.out.println(Arrays.toString(aylar));

        for (int i =0; i< aylar.length;i++){

            System.out.println(aylar[i]);
        }
    }
}
