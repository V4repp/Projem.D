package test.day25_Constructors;

public class OgrenciObjeleri {
    public static void main(String[] args) {

        OgrenciIsleri ogrenci_1 = new OgrenciIsleri();

        ogrenci_1.name = "Muhammet";
        ogrenci_1.surname = "Pekuslu";
        ogrenci_1.gender = 'E';
        ogrenci_1.age = 15;
        ogrenci_1.ID = 143;

        ogrenci_1.okuma();
        System.out.println("ogrenci_1 = " + ogrenci_1);

        System.out.println("ogrenci_1.name = " + ogrenci_1.name);

        OgrenciIsleri ogrenci_2 = new OgrenciIsleri();
        ogrenci_2.name = "Ersin";
        ogrenci_2.surname = "Kayhan";
        ogrenci_2.gender = 'E';
        ogrenci_2.age = 50;
        ogrenci_2.ID = 134;

        ogrenci_2.studying();
        System.out.println("ogrenci_2 = " + ogrenci_2);



        Ogrenci_Isleri_Constructors_Ile ogrenci_3 = new Ogrenci_Isleri_Constructors_Ile("Mehmet","Çelik",'E',145,15);
        System.out.println("ogrenci_3 = " + ogrenci_3);



        Ogrenci_Isleri_Constructors_Ile ogrenci_4 = new Ogrenci_Isleri_Constructors_Ile("Deniz","Çelik");
        System.out.println("ogrenci_4 = " + ogrenci_4);

        Ogrenci_Isleri_Constructors_Ile ogrenci_5 = new Ogrenci_Isleri_Constructors_Ile("Yağmur", "Yılmaz", 'K',15);
        System.out.println("ogrenci_5 = " + ogrenci_5);
    }
}
