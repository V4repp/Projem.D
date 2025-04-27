package test.day30.cars;

public class Car {
    String marka;
    int model;
    long fiyat;
    int yas;
    String rengi;
    String yakitTipi;

    public Car(String marka, int model, long fiyat, int yas, String rengi, String yakitTipi) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
        this.yas = yas;
        this.rengi = rengi;
        this.yakitTipi = yakitTipi;
    }

    public void hizlanma(int hizlanmaSuresi) {
        System.out.println(marka + " 0'dan 100'e " + hizlanmaSuresi + "sürede çıkıyor.");

    }
public void yakitTuketimi (double totalYakit){
    System.out.println(marka + " 100 Km'de  "+ totalYakit+ " lt "+yakitTipi + " yakıyor.");
}

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model=" + model +
                ", fiyat=" + fiyat +
                ", yas=" + yas +
                ", rengi='" + rengi + '\'' +
                ", yakitTipi='" + yakitTipi + '\'' +
                '}';
    }
}
