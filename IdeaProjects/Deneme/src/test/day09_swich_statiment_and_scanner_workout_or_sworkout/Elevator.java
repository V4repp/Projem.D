package test.day09_swich_statiment_and_scanner_workout_or_sworkout;

public class Elevator {
    public static void main(String[] args) {
/*Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed Solution 2: use if & switch statements mixed */
        int katSayisi = 2;
        switch (katSayisi) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Girdiğiniz kat sayısını kontrol ediniz.");

        }
        switch (katSayisi) {
            case 1 -> System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            case 2 -> System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            case 3 -> System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            default -> System.out.println("Girdiğiniz kat sayısını kontrol ediniz.");
        }


    }
}
