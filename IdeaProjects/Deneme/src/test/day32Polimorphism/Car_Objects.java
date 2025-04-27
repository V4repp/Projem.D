package test.day32Polimorphism;

public class Car_Objects {
    public static void main(String[] args) {
        Toyota toyota1 = new Toyota("Toyota", "yarıs", 2020, 10_000, "Mavi", 35_000);
        BMW BMW1 = new BMW("BMW", "x3", 2005, 40_000, "Siyah", 200_000);
        Tesla tesla1 = new Tesla("Tesla", "Model X", 2020, 10_000, "Beyaz", 10_000);

        toyota1.drive();//Perant class' tan geldi. (car classtan override yapılmadı.)
        toyota1.start();//toyota' dan override yapılarak geldi.(car classta var)
        toyota1.reliable();//sadece toyota class tan geldi.
        System.out.println("---------------------------------------------------------------");
        BMW1.breaksDown();
        BMW1.racing();
        BMW1.start();
        BMW1.drive();
        System.out.println("-----------------------------------------------------------------");
        tesla1.autoPilot();
        tesla1.start();
        tesla1.drive();
        System.out.println("=============================================================");


        Cars car1 = new Toyota("Toyota", "yarıs", 2020, 10_000, "Mavi", 35_000);
        Cars car2 = new BMW("BMW", "x3", 2005, 40_000, "Siyah", 200_000);
        Cars car3 = new Tesla("Tesla", "Model X", 2020, 10_000, "Beyaz", 10_000);

        car1.start();
        car1.drive();

        System.out.println("-------------------------------------------------------");
        car2.start();
        car2.drive();
        ((BMW)car2).racing();//car2 normalda parent class ama ()((BMW)car2). yaparak büyük olan class'ı küçük olan BMW ye çevirdik.
        //down casting yapıldı.
        ((BMW)car2).breaksDown();

        System.out.println("--------------------------------------------------------");
        car3.drive();
        car3.start();
        ((Tesla)car3).autoPilot();
    }
}
