package SecondHomework;

public class ShippingAddress {
    /* Create a class named ShippingAddress and write a program with the following requirements:

	Declare the following variables with appropriate data types:
 			fullName
			buildingNumber
			streetName
			city
			state
			zipCode

	Use concatenation to print the full shipping address

			Example:
				fullName = "Aaron Kissinger";
				buildingNumber = 13621;
				streetName = "Legacy Circle"
				city = "Fairfax;
				state = "VA";
				zipCode = 22030;

			Output:
	      		Your Shipping address is:
                			Aaron Kissinger
                			13621 Legacy Circle
                			Fairfax, VA 22030*/
    public static void main(String[] args) {


        String fullName = "Aaron Kissinger";
        int BuidingNumber = 3029;
        String streetName = "Legency Circle";
        String city = "Fairfax";
        String state = "VA";
        int zipCode = 44321;
        System.out.println("My Shipping address is: "+
                fullName+" "+BuidingNumber+" "+streetName+" "+city+", "+state+" "+zipCode);
    }
}