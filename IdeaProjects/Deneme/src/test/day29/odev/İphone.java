package test.day29.odev;

class Iphone extends CepTelefonu {

    public Iphone(String brand, String model, double size, double price, String color) {
        super(brand, model, size, price, color);
    }
    public void yeniTelefonCikariliyor (){
        System.out.println(brand+" Yeni telefon çıkartılıyor klasik Iphone işte. :D");
    }
}
