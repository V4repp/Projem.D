package test.day27;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        /*Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Merhaba lütfen pizzanızı yazınız. (Cheese/Pepperoni)");
        System.out.println("Not: sorulara örneklerdeki gibi cevap veriniz.");
        String pizzaturu =scan.nextLine();

        System.out.println(pizzaturu + " türünün sosundan ne kadar istersiniz?");
        int pizzaSosMiktari = scan.nextInt();

        System.out.println("Hangi boyda pizzanızı istersiniz ? (small/Medium/Large)");
        String pizzaninBoyu = scan.nextLine();
        scan.nextLine();
        int calcCost = 0;

        if (pizzaturu.equals("cheese") && pizzaninBoyu.equals("small")) {
            calcCost =+ 10 + pizzaSosMiktari * 2;

            System.out.println("Yapmış olduğunuz sipariş ve ücreti : Cheese," + calcCost + "$");


        } else if (pizzaturu.equals("cheese") && pizzaninBoyu.equals("medium")) {
            calcCost =+ 12 + pizzaSosMiktari * 2;


            System.out.println("Yapmış olduğunuz sipariş ve ücreti : Cheese," + calcCost + "$");

        } else if (pizzaturu.equalsIgnoreCase("cheese") && pizzaninBoyu.equalsIgnoreCase("large")) {
            calcCost =+ 14 + pizzaSosMiktari * 2;

            System.out.println("Yapmış olduğunuz sipariş ve ücreti : Cheese," + calcCost + "$");

        } else if (pizzaturu.equalsIgnoreCase("pepperoni") && pizzaninBoyu.equalsIgnoreCase("small")) {
            calcCost =+ 10 + pizzaSosMiktari * 2;

            System.out.println("Yapmış olduğunuz sipariş ve ücreti : Pepperoni," + calcCost + "$");

        }else if (pizzaturu.equalsIgnoreCase("Pepperoni") && pizzaninBoyu.equalsIgnoreCase("Medium")){
            calcCost =+ 12 + pizzaSosMiktari * 2;

            System.out.println("Yapmış olduğunuz sipariş ve ücreti : Pepperoni," + calcCost + "$");

        } else if (pizzaturu.equalsIgnoreCase("Pepperoni") && pizzaninBoyu.equalsIgnoreCase("Large")){
            calcCost =+ 14 + pizzaSosMiktari * 2;

            System.out.println("Yapmış olduğunuz sipariş ve ücreti : Pepperoni," + calcCost + "$");
        }else {
            System.out.println("Bir şeyi yanlış girmiş bulunmaktasınız. lütfen tekrardan deneyiniz...");
        }

    }
}