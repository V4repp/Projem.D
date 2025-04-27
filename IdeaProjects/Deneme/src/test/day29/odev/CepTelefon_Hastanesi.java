package test.day29.odev;

public class CepTelefon_Hastanesi {
    public static void main(String[] args) {
        Nokia telefon1 = new Nokia("Nokia", "3310", 2.4, 100, "Grey,green");
        System.out.println("telefon1 = " + telefon1);
        telefon1.yilanOyunu();
        telefon1.call();
        telefon1.text();

        Iphone telefon2 = new Iphone("Iphone","16",6.2,3000,"Blue");
        System.out.println("telefon2 = " + telefon2);
        telefon2.call();
        telefon2.text();
        telefon2.yeniTelefonCikariliyor();

        Samsung telefon3 = new Samsung("Samsung","S24 Ultra",6.5,3200,"Red");
        System.out.println("telefon3 = " + telefon3);
        telefon3.call();
        telefon3.text();
        telefon3.androidYazilimiYapiliyor();

        Motorola telefon4 = new Motorola("Motorola","Moto Z2 Play",5.5,1000,"Black");
        System.out.println("telefon4 = " + telefon4);
        telefon4.text();
        telefon4.call();
        telefon4.yeniDuydum();
    }
}
