package test.day25_Constructors;

public class Sahibinden_Arabalar {
    public static void main(String[] args) {

        Cars BMW = new Cars("BMW","Black","X3",2020,750_000,3000);

        System.out.println("BMW = " + BMW);

        Cars Mercedes = new Cars("Mercedes","White","Benz",2016);

        System.out.println("Mercedes = " + Mercedes);
        Mercedes.price = 132_000;

        System.out.println("Mercedes = " + Mercedes);
    }
}
