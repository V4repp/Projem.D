package test.day29.odev;

public class Nokia extends CepTelefonu{


    public Nokia(String brand, String model, double size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public void yilanOyunu (){
        System.out.println(brand+ " Yılan oyunu oynalınıyor");
    }
}
