package test.day24;

public class Galeri {
    public static void main(String[] args) {

        Cars car1 = new Cars();
        car1.brand = "Hyundai";
        car1.color = "Gri";
        car1.model = "Accend Era ";
        car1.year = 2012;
        car1.price = 528.000;

        Cars car2 = new Cars();
        car2.brand = "BMW";
        car2.color = "Siyah";
        car2.model = "320i";
        car2.year = 1988;
        car2.price = 459.000;

        Cars car3 = new Cars();
        car3.brand = "Mercedes Benz";
        car3.color = "Beyaz";
        car3.model= "CLA";
        car3.year=2016;
        car3.price=1247.000;

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
    }
}
