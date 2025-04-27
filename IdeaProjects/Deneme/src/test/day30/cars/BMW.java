package test.day30.cars;

public class BMW extends Car {
    String motosiklet ;


    public BMW(String marka, int model, long fiyat, int yas, String rengi, String yakitTipi,String motosiklet) {
        super(marka, model, fiyat, yas, rengi, yakitTipi);
        this.motosiklet = motosiklet ;
    }

    public void yakitTuketimi (double totalYakit){
        System.out.println(marka + " turbo kullanarak, 100 Km'de  "+ totalYakit+ " lt "+yakitTipi + " yakıyor.");
    }
}
