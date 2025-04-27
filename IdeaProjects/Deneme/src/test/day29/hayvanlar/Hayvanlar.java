package test.day29.hayvanlar;

public class Hayvanlar {

    String tur ;
    String isim ;
    String rengi ;
    int yas;

    public Hayvanlar(String tur, String isim, String rengi, int yas) {
        this.tur = tur;
        this.isim = isim;
        this.rengi = rengi;
        this.yas = yas;

    }


    public void yemek (){
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
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "tur='" + tur + '\'' +
                ", isim='" + isim + '\'' +
                ", rengi='" + rengi + '\'' +
                ", yas=" + yas +
                '}';
    }
}
