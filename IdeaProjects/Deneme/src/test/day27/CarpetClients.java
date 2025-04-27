package test.day27;

public class CarpetClients {
    /*1. Aşağıdaki özelliklere sahip Pizza adlı özel bir sınıf oluşturun
     Öznitelik: boyut numberOfCheeseTopping numberOfPepperoniTopping Eylemler:

     --------------------------------------------------------------------------------------------------
                calcCost(): pizzanın toplam maliyetini döndürür toString():
     calcCost() tarafından hesaplanan pizza boyutunu, her bir sosun miktarını ve pizza maliyetini içeren bir Dize döndürür                 -------------------      YAPILDI     ---------------------


     Pizza maliyeti şu şekilde belirlenir: Küçük: 10 $ + tepesi başına 2 $/ Orta: 12 $ + tepesi başına 2 $/ Büyük: 14 $ + tepesi başına 2 $
     PizzaClients adlı başka bir sınıf oluşturun, birden çok pizza nesnesi oluşturun ve pizza nesnesinin her işlevini test edin. */
/*1. Create a custom class named Pizza with the following specifications:

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

    String Boyut ;
    int numberOfCheeseTopping ;
    int numberOfPepperoniTopping ;
    int calcCost ;

               /////////////////////////////////////////////////////////////////////////
    public CarpetClients(String boyut, String sos_miktari, int numberOfPepperoniTopping, int calcCost) {
        this.Boyut = boyut;

        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        this.calcCost = calcCost;
    }

    public CarpetClients(String boyut, int numberOfCheeseTopping, int calcCost) {
        Boyut = boyut;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.calcCost = calcCost;
    }

    ///////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "CarpetClients{" +
                "Boyut='" + Boyut + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", calcCost=" + calcCost +
         '}';
    }


}
