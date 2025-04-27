package test.day29.hayvanlar;

public class Dogs extends Hayvanlar{


    public Dogs(String tur, String isim, String rengi, int yas) {
        super(tur, isim, rengi, yas);
    }
     public void havlamak (){
         System.out.println(isim+" Havlıyor.");
     }


}
