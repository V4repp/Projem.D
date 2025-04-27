package test.day29.odev;

public class Motorola extends CepTelefonu{

    public Motorola(String brand, String model, double size, double price, String color) {
        super(brand, model, size, price, color);
    }
    public void yeniDuydum (){
        System.out.println(brand+" Yeni duydum ama biraz düşük gibi duruyor.");
    }
}
