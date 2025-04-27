package test.day29.hayvanlar;

public class Cats extends Hayvanlar{
    public Cats(String tur, String isim, String rengi, int yas) {
        super(tur, isim, rengi, yas);
    }
    /*String tur ;
    String isim ;
    String rengi ;
    int yas;

    public Cats(String tur, String isim, String rengi, int yas) {
        this.tur = tur;
        this.isim = isim;
        this.rengi = rengi;
        this.yas = yas;
    }*/

    public void gerinmek (){
        System.out.println(isim+" Geriniyor");
    }
    /*public void yemek (){
        System.out.println(isim+" Yemek yiyor.");
    }

    public void su(){
        System.out.println(isim+" Su içiyor.");
    }

    public void haraket (){
        System.out.println(isim+" Haraket ediyor.");
    }

    public void uyumak (){
        System.out.println(isim+" Uyuyor.");
    }*/
}
