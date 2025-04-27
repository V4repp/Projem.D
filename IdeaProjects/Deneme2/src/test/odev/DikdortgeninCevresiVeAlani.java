package test.odev;

public class DikdortgeninCevresiVeAlani {
    public static void main(String[] args) {
        //Muhammet iyi akşamlar,
        //Ödevler;
        //1. Dikdörtgenin alanı ve çevresini bulan bir kod yazalım.
        //       a. Değişkenler (double olsun);
        //          uzunluk ve genislik olsun.
        //Çevre: (uzunluk+genislik)x2
        //Alan: uzunluk*genislik
        //
        //2.  Kiloyu libreye çeviren bir program yazalım:
        //          Değişkenler: kg ve lb
        //
        //    		İp ucu:  1kg = 2.2 lb
        System.out.println("-----------------------------Dikdörtgenin Alanı VeÇevresini Bulan Kod ---------------------------------------------------");
        double uzunluk=10;
        double genislik=20;
        double cevre=(uzunluk+genislik)*2;
        double alan=uzunluk*genislik;
        System.out.println("uzunluk = " + uzunluk);
        System.out.println("genislik = " + genislik);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
        System.out.println();
        System.out.println("---------------------------- Kiloyu Libreye Çeviren Program---------------------------------------------------------------");
        double kg=3;
        double lb=kg*2.2;
        System.out.println("lb = " + (lb=kg*2.2));


    }
}
