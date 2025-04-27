package test.day29.odev;

public class Samsung extends CepTelefonu{

    public Samsung(String brand, String model, double size, double price, String color) {
        super(brand, model, size, price, color);
    }
    public void androidYazilimiYapiliyor (){
        System.out.println(brand+" Android yazılımı yapılıyor...(Biraz uzun sürücek.)");
    }
}
