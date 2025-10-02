package ThirdHomework;

import java.util.Scanner;

public class GallonsToLiters {
    /*
    Write a program that converts any given number of gallons to liters.

					Example:
						gallon = 10

					Output:
						10 gallons is equal to 37.9 liters

			Hint: 1 gallon = 3.79 liters
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write Gallon number...");
        int gallon = scan.nextInt();
        double litres = gallon*3.79;
        System.out.println(gallon+ " gallons is equal to " + litres+" litres");


    }
}
