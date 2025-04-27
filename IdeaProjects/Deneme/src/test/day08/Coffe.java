package test.day08;

public class Coffe {
    public static void main(String[] args) {
        /*1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and their price & calories are:
						tall:
								price is $3.69
								90 calories
						grande:
								price is $3.99;
								120 calories
						venti:
								price is $4.29
								150 calories
			If the size is invalid then the output should be "Invalid Size"

			Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement*/
        //Arayacağımız değişken size, yani boy. Onu da String olarak tanımlamak gerekir.
        // Sora case "buyuk": yazıp altına print, sonra break;

        String size = "venti";
        switch (size) {
            case "tall":
                System.out.println("price is $3.69 ve 90 calories");
                break;
            case "grande":
                System.out.println("price is $3.99 ve 120 calories");
                break;
            case "venti":
                System.out.println("price is $4.29 ve 150 calories");
                break;
            default:
                System.out.println("girdiğiniz boy yoktur lütfen tekrardan kontrol edin ve yeniden boy giriniz. ");
                break;

        }

        switch (size) {
            case "tall" -> System.out.println("price is $3.69 ve 90 calories");
            case "grande" -> System.out.println("price is $3.99 ve 120 calories");
            case "venti" -> System.out.println("\"price is $4.29 ve 150 calories\"");
            default ->
                    System.out.println("girdiğiniz boy yoktur lütfen tekrardan kontrol edin ve yeniden boy giriniz. ");

        }

    }
}
