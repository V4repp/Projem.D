package test.odev.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEX1 {
    public static void main(String[] args) {

 /* O halde sen bir tane ArrayList oluştur, içine 1'den 100'e kadar 10'un katlarindaki sayıları karışık sırada ekle.
    Bir tane daha oluştur ve içine sınıf arkadaşlarının adlarını ekle.
    Sonra her bir ArrayList 'in 5'inci elemanı olarak yeni bir elemen ekle.(isimlere)
    Daha sonra 7'inci elemanı sil.
    Daha sonra da 3'uncu elemanı değiştir.
    Son olarak ArrayList'lerin elemanları küçükten büyüğe sırala.     ???
         Son olarak her iki ArrayList'in elemanlarını tek tek yazdır.
    Bunu yaparsan büyük oranda ArrayList'i öğrenmiş olursun. */

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(20);
        numbers.add(50);
        numbers.add(40);
        numbers.add(30);
        numbers.add(60);
        numbers.add(80);
        numbers.add(70);
        numbers.add(90);
        numbers.add(10);

        System.out.println("numbers1 = " + numbers);

        //her bir ArrayList 'in 5'inci elemanı olarak yeni bir elemen ekle.
        numbers.add(4, 300);
        System.out.println("numbers2 = " + numbers);

        // Daha sonra 7'inci elemanı sil.
        numbers.remove(6);
        System.out.println("numbers3 = " + numbers);

        // Daha sonra da 3'uncu elemanı değiştir.
        numbers.set(2, 900);
        System.out.println("numbers4 = " + numbers);

        //Son olarak ArrayList'lerin elemanları küçükten büyüğe sırala.
        Collections.sort(numbers);
        System.out.println("numbers5 = " + numbers);

        //Son olarak her iki ArrayList'in elemanlarını tek tek yazdır.
        for (int i = 0; i <= numbers.size() - 1; i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("numbers6 = " + numbers);
        ArrayList<String> isimler = new ArrayList<>();

        isimler.add("Ahmet");
        isimler.add("Hamza");
        isimler.add("Mehmet");
        isimler.add("Muhammet");
        isimler.add("Ali");//4
        isimler.add("Osman");
        isimler.add("Ramazan");
        isimler.add("Tahir");
        isimler.add("Enes");

        //her bir ArrayList 'in 5'inci elemanı olarak yeni bir elemen ekle.
        isimler.add(4, "Mahmut");
        System.out.println("isimler2 = " + isimler);

        // Daha sonra 7'inci elemanı sil.
        isimler.remove(6);
        System.out.println("isimler3 = " + isimler);

        // Daha sonra da 3'uncu elemanı değiştir.
        isimler.set(2, "Ersin");
        System.out.println("isimler4 = " + isimler);

        //Son olarak ArrayList'lerin elemanları küçükten büyüğe sırala.
        Collections.sort(isimler);
        System.out.println("isimler5 = " + isimler);

        //Son olarak her iki ArrayList'in elemanlarını tek tek yazdır.
        for (int i = 0 ; i < isimler.size(); i ++){
            System.out.println(isimler.get(i));
            if (numbers.indexOf(i) == numbers.lastIndexOf(i));

        }

    }

}

