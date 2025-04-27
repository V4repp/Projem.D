package test.day25_Constructors;

public class Cars {

    String brand ;
    String color ;
    String model ;
    int year ;
    double price ;
    int engine ;


    public Cars(String brand) {
        this.brand = brand;
    }

    public Cars(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public Cars(String brand, String color, String model) {
        this.brand = brand;
        this.color = color;
        this.model = model;
    }

    public Cars(String brand, String color, String model, int year) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public Cars(String brand, String color, String model, int year, double price) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Cars(String brand, String color, String model, int year, double price, int engine) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", engine=" + engine +
                '}';
    }
}
