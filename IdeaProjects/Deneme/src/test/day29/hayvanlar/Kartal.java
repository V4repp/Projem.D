package test.day29.hayvanlar;

public class Kartal extends Hayvanlar{
    public Kartal(String tur, String isim, String rengi, int yas) {
        super(tur, isim, rengi, yas);
    }

    public void ucmak (){
        System.out.println(isim+" Uçuyor.");
    }
}
