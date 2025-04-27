package test.day29.hayvanlar;

public class Hayvanat_Bahcesi {
    public static void main(String[] args) {
        Dogs kopek1 = new Dogs("Kangal", "Joe", "Beyaz", 4);
        System.out.println("kopek1 = " + kopek1);

        kopek1.havlamak();
        kopek1.haraket();
        kopek1.su();
        kopek1.uyumak();
        kopek1.yemek();

        System.out.println("----------------------------- Kedi ---------------------------");
        Cats kedi1 = new Cats("Tekir", "Pamuk", "Beyaz", 2);
        System.out.println("kedi1 = " + kedi1);
        kedi1.gerinmek();
        kedi1.haraket();
        kedi1.uyumak();
        kedi1.su();
        kedi1.yemek();

        System.out.println("----------------------------- Kaplan --------------------------");
        Kaplan kaplan1 = new Kaplan("Kaplan", "Tiger", "Turuncu", 4);
        System.out.println("kaplan1 = " + kaplan1);
        kaplan1.haraket();
        kaplan1.su();
        kaplan1.uyumak();
        kaplan1.yemek();

        System.out.println("--------------------------- Kartal ------------------------------");
        Kartal kartal1= new Kartal("Kartal","Kartal","Siyah",5);
        System.out.println("kartal1 = " + kartal1);
        kartal1.yemek();
        kartal1.haraket();
        kartal1.uyumak();
        kartal1.su();
        kartal1.ucmak();

        System.out.println("--------------------------- Balık ------------------------------");
        Balik balik1= new Balik("Hamsi","Hamsi","Gri",1,true);
        System.out.println("Balık = " + balik1 );
        balik1.yemek();
        balik1.yuzmek();
        balik1.su();
        balik1.haraket();
        balik1.uyumak();
    }
}
