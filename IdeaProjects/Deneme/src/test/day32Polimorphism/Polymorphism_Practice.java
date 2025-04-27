package test.day32Polimorphism;

import java.util.Arrays;

public class Polymorphism_Practice {

    public static void main(String[] args) {
        Cars car1 = new Toyota("Toyota", "Haylander", 2010, 2500, "Blue", 25_000);
        Cars car2 = new BMW("BMW", "X3", 2010, 2500, "Blue", 25_000);
        Cars car3 = new Tesla("Tesla", "Model_Y", 2024, 2500, "Blue", 25_000);


        Cars[] cars = {car1, car2, car3};


        System.out.println("cars = " + Arrays.toString(cars));

        Cars[] cars2 = {
                new Toyota("Toyota", "Haylander", 2010, 2500, "Blue", 25_000),
                new BMW("BMW", "X3", 2010, 2500, "Blue", 25_000),
                new Tesla("Tesla", "Model_Y", 2024, 2500, "Blue", 25_000),
        };


        for (Cars eachCar : cars2) {


            if (eachCar instanceof Toyota) {
                if (eachCar.year >= 2010 && eachCar.year <=2011) {
                    System.out.println(eachCar);
                }
            }

        }

cars[0].start();// Cars class'taki method Toyota class'da override edilmiş method
cars[0].drive(); // Cars class'taki override edilmemiş methot
 //cars[0].reliable(); //Referans tipi cars calss olduğu için Toyota class' a özgü olan reliable motofunu çağıramıyoruz.


      Toyota toyota = new Toyota("Toyota", "Haylander", 2010, 2500, "Blue", 25_000);

      toyota.reliable();
    }
}
