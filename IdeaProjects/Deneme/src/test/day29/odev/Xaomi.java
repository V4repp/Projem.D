package test.day29.odev;

public class Xaomi extends CepTelefonu{

    public Xaomi(String brand, String model, double size, double price, String color) {
        super(brand, model, size, price, color);
    }
    public void telefon_Disi_Baska_Urunlerde_Yapiliyor (){
        System.out.println(brand+" Telefon dışı başka ürünlerde yapılıyor...");
    }
}
