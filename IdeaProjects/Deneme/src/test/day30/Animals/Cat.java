package test.day30.Animals;

public class Cat extends Animal {

    public Cat(String tur, String isim, String rengi, int yas) {
        super(tur, isim, rengi, yas);
    }

    public void dusme (int kacAyakDusuyo){

        System.out.println(tur+" " + kacAyakDusuyo+" ayak üstüne düşüyor." );
    }
}
