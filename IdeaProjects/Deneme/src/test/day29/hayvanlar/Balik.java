package test.day29.hayvanlar;

public class Balik extends Hayvanlar{
    boolean yuzgec  ;


    public Balik(String tur, String isim, String rengi, int yas,boolean yuzgec) {
        super(tur, isim, rengi, yas);
        this.yuzgec=yuzgec;
    }
    public void yuzmek (){
        System.out.println(isim+ " Yüzüyor.");
    }

}
