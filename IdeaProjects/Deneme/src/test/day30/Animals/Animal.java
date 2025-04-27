package test.day30.Animals;

public class Animal {
    String tur ;
    String isim ;
    String rengi ;
    int yas;

    public Animal(String tur, String isim, String rengi, int yas) {
        this.tur = tur;
        this.isim = isim;
        this.rengi = rengi;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tur='" + tur + '\'' +
                ", isim='" + isim + '\'' +
                ", rengi='" + rengi + '\'' +
                ", yas=" + yas +
                '}';
    }
}
