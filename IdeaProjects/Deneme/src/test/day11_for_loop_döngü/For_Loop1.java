package test.day11_for_loop_döngü;

public class For_Loop1 {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            System.out.println("i = " + i);

        }



        String str1 = "Java";
                     //0123

       /* System.out.println("( str1.charAt(0)) = " + (str1.charAt(0)));
        System.out.println("( str1.charAt(0)) = " + (str1.charAt(1)));
        System.out.println("( str1.charAt(0)) = " + (str1.charAt(2)));
        System.out.println("( str1.charAt(0)) = " + (str1.charAt(3)));*/

        //  int num1=str1.length();//4


        for (int i = 0; i < str1.length(); i++) {

            System.out.println("str1.charAt(i) = " + str1.charAt(i) + " index= " + i);
        }



        // 1'den  100'e kadar olan tek sayıların toplamını veren bir program yazınız.

        int sonuc = 0;//1/4/

        for (int s = 1; s < 100; s += 2) {//s=1/3/5

            sonuc = sonuc + s;//1/4

          //  System.out.println("sonuc = " + sonuc);
        }

        System.out.println("sonuc = " + sonuc);



        // 1'den  100 dahil çift sayıların toplamını veren bir program yazınız.
        int num1=0;
        for ( int o = 2; o<=100 ; o+=2){// o=2 / o=4

            num1 = o +num1; //2+0 / 2+4/
           // System.out.println("o = " + o);
        }

        System.out.println("num1 = " + num1);


        /* 1. 1'den başlayarak kullanıcının girdiği sayıya kadar tüm sayıların toplamını veren bir program yazınız. (Bitiş sayısını kullanıcı programı çalıştırınca girecek şekilde)
           2. Kullanıcının girdiği sayının faktoriyel sonucunu hesaplayan bir program yazınız:

        Örnek:

        input: 5
        output: 120

        ( 5! = 5 * 4 * 3 * 2* 1 = 120 )*/

    }
}
