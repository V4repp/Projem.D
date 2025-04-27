package test.day26;

public class StaticMembers {
    int number;
    double db;
    long lg;
    String str;
    static String name;

    public StaticMembers(double db, int number, long lg, String str, String name) {
        this.db = db;
        this.number = number;
        this.lg = lg;
        this.str = str;
        this.name = name;
    }

    public StaticMembers() {

    }

    public StaticMembers(int number, double db, long lg, String str) {
        this.number = number;
        this.db = db;
        this.lg = lg;
        this.str = str;
    }

    // main block : en son run edilir
    public static void main(String[] args) {
        StaticMembers object1 = new StaticMembers(2.2, 3, 1214, "Hello", "Ali");
        System.out.println("object1 = " + object1);

        StaticMembers object2 = new StaticMembers(6.7, 80, 9864, "2", "Mehmet");
        System.out.println("object2 = " + object2);

        System.out.println("object1 = " + object1);
        System.out.println("object2 = " + object2);

        StaticMembers object3 = new StaticMembers(8.0, 80, 9864, "2", "Veli");
        System.out.println("object3 = " + object3);
        object3.name = "Muhammet";
        object3.str = "Araba";

        System.out.println("object1 = " + object1);

        System.out.println("object2 = " + object2);

        System.out.println("object3 = " + object3);

        System.out.println("Main method is running");        System.out.println("--------------------------------------------------------------------------------------");
        StaticMembers object4 = new StaticMembers(9, 3.6, 3525, "Kedi");
        System.out.println("object4 = " + object4);

        StaticMembers object5 = new StaticMembers(4, 8.3, 5465, "Kuş");
        System.out.println("object5 = " + object5);


        object5.name = "El";
        System.out.println("object4 = " + object4);
        System.out.println("object5 = " + object5);

    }


//Instance block :  Static blocktan sonra run olur her objec için runn olur !!

    {
        System.out.println("Instance block is running");
    }


    //static block : İlk static block run edilir... ve sadece 1 kere !!
    static {
        System.out.println("static block is running");
    }



    @Override
    public String toString() {
        return "StaticMembers{" +
                "number=" + number +
                ", db=" + db +
                ", lg=" + lg +
                ", str='" + str + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public static void metod1(){
        System.out.println("static metod1 !!!");

    }

    public void metod2(){
        System.out.println("instance metod2 !!!");

    }

}
