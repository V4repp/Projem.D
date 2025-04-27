package test.day30.Animals;

public class Dog extends Animal{

    public Dog(String tur, String isim, String rengi, int yas) {
        super(tur, isim, rengi, yas);
    }
    public void kopeklerinYaptigiBaziSeyler (String kopeklerinYaptigiBaziSeyler ){
        System.out.println("Köpeklerin yaptığı şeylerden biride "+kopeklerinYaptigiBaziSeyler+"tır.");
    }
}
