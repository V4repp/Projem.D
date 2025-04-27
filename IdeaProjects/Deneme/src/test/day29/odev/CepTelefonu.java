package test.day29.odev;

public class CepTelefonu {
    String brand;
    String model;
    double size;
    double price;
    String color;

    public void call (){
        System.out.println(brand+" is calling...");
    }

    public void text (){
        System.out.println(brand+" is texting...");
    }

    public CepTelefonu(String brand, String model, double size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Telefon_Hastanesi{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
