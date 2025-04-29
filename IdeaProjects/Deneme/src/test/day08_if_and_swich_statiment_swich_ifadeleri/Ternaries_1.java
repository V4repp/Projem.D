package test.day08_if_and_swich_statiment_swich_ifadeleri;

public class Ternaries_1 {
    public static void main(String[] args) {
        int yas = 16;
        boolean vatandas = false;
        if (yas >= 18 && vatandas) {
            System.out.println("Oy kullana bilir.");
        } else if (yas >= 18 && !vatandas) {
            System.out.println("Oy kullanamazsınız Türk vatandaşı olmanız gerekir.");

        } else if (yas < 18 && vatandas) {
            System.out.println("Oy kullanamazsınız yaşınız 18'den büyük olmalı. ");

        } else {
            System.out.println("Hem yaşınız 18' den büyük değil hemde Türk vatandaşı değilsiniz.");

        }
            String sonuc=(yas >= 18 && vatandas)?"Oy kullana bilir.":(yas >= 18 && !vatandas)?"Oy kullanamazsınız Türk vatandaşı olmanız gerekir.":
                    (yas < 18 && vatandas)?"Oy kullanamazsınız yaşınız 18'den büyük olmalı. ":"Hem yaşınız 18' den büyük değil hemde Türk vatandaşı değilsiniz.";

        System.out.println("sonuc = " + sonuc);


    }
    }
