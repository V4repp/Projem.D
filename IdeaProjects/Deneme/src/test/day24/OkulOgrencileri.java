package test.day24;

public class OkulOgrencileri {
    public static void main(String[] args) {
        Student ogrenci1 = new Student();

        ogrenci1.isim = "Muhammet";
        ogrenci1.soyIsim = "Pekuslu";
        ogrenci1.cinsiyet = "E";
        ogrenci1.okulNumarasi = 963;

        System.out.println("ogrenci1 = " + ogrenci1);

        Student ogrenci2 = new Student();

        ogrenci2.isim = "Ersin";
        ogrenci2.soyIsim = "Kayhan";
        ogrenci2.cinsiyet= "E";
        ogrenci2.okulNumarasi=123;

        System.out.println("ogrenci2 = " + ogrenci2);




    }
}
