package test.day17;

public class Do_While_Loop {
    public static void main(String[] args) {
        int sayi = 0;
        String kelime = "Wooden spoon";
        for (int i = 0; i < 5; i++) {

            System.out.println(kelime);
        }
        System.out.println("---------------------------------------------");
        while (sayi<5){
            System.out.println(kelime);
            sayi++;
        }
        System.out.println("---------------------------------------------");

        do{
            System.out.println(kelime);
            sayi++;
        }while (sayi<5);

        System.out.println(sayi);


    }
}
