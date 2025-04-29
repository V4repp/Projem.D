package test.day10_string_sworkout;

public class String_Calismasi_3 {
    public static void main(String[] args) {

        //-----------------------------------------------  substring(alt dize) -----------------------------
        System.out.println("----------------------------------------------- substring() -----------------------------");// *,+ arası olan tüm char'ları alır!
        String str1 = "Programa yeniden başladık.";
        String str2 = str1.substring(9, 16);//16=lenght of clause and before 9 will be delete do you understand
        System.out.println("str2 = " + str2);
        String str3 = str1.substring(7);
        System.out.println("str3 = " + str3);
        String str4 = str1.substring(9, 9);
        System.out.println("str4 = " + str4);

        //-----------------------------------------------  repeat(tekrar etmek) -----------------------------
        System.out.println("----------------------------------------------- repeat() -----------------------------");// istenilen sayı kadar o stringi tekrar eder!
        String java = "Java";
        int num1 = 6;

        System.out.println("java.repeat(num1) = " + java.repeat(num1));


        String str5 = ("" + num1) + 5;

        //String str5=(""+ num1);
        System.out.println("str5 = " + str5);


        //-----------------------------------------------  isEmpty(boş mu) -----------------------------
        System.out.println("----------------------------------------------- isEmpty() -----------------------------");// o değişkenin boş olup olmamasına bakıyor ve boolean ile kullanılır!

        boolean bl1 = str4.isEmpty();//true
        System.out.println("bl1 = " + bl1);

        boolean bl2 = java.isEmpty();//false
        System.out.println("bl2 = " + bl2);

        String str6 = "";
        boolean bl3 = str6.isEmpty();//false   eğer String de boşluk varsa onuda karakter sayar ve dolu olarak görür dikkat!
        System.out.println("bl3 = " + bl3);

        //-----------------------------------------------  isBlance() -----------------------------
        System.out.println("----------------------------------------------- isBlance() -----------------------------");//


        boolean bl4 = str4.isBlank();
        System.out.println("bl4 = " + bl4);
        boolean bl5 = str5.isBlank();
        System.out.println("bl5 = " + bl5);
        boolean bl6 = str6.isBlank();
        System.out.println("bl6 = " + bl6);

//-----------------------------------------------  equals(eşit) -----------------------------
        System.out.println("----------------------------------------------- equals() -----------------------------");

        String str10 = "Java";
        String str11 = "Java";
        String str12 = "JAVA";
        String str13 = "Phyton";
        String str14 = new String("Java");


        boolean bl10 = str10 == str11; //true
        boolean b11 = str10 == str12; //false
        boolean bl12 = str10 == str13; //false
        boolean bl13 = str10 == str14; //false

        boolean bl14 = str10.equals(str11); //true
        boolean bl15 = str10.equals(str12); //false
        boolean bl16 = str10.equals(str13);//false
        boolean bl17 = str10.equals(str14);//true

        System.out.println("bl14 = " + bl14);
        System.out.println("bl15 = " + bl15);
        System.out.println("bl16 = " + bl16);
        System.out.println("bl17 = " + bl17);

        //-----------------------------------------------  equalsIgnoreCase((equals)eşittir (case)Büyük/Küçük Harfleri (ignore)Yoksay) -----------------------------
        System.out.println("----------------------------------------------- equalsIgnoreCase() -----------------------------");

        bl15 = str10.equals(str12); //false
        System.out.println("bl15 = " + bl15);

        boolean bl18 = str10.equalsIgnoreCase(str12);//true
        System.out.println("bl18 = " + bl18);


        //-----------------------------------------------  contains(içerir?) -----------------------------
        System.out.println("----------------------------------------------- contains() İçerir? --------------------------------------------------");

        String str20 = "Java, Phyton, C++, JS";
        boolean bl20 = str20.contains("Phyton");
        System.out.println("bl20 = " + bl20);//true

        //-----------------------------------------------  startsWith(ile başlar) -----------------------------
        System.out.println("----------------------------------------------- startsWith() --------------------------------------------------");

        boolean bl21 = str20.startsWith("Ja");
        System.out.println("bl20 = " + bl20); //true


        //-----------------------------------------------  endsWith(ile biter) -----------------------------
        System.out.println("----------------------------------------------- endsWith() --------------------------------------------------");

        boolean bl22 = str20.endsWith("JS");
        System.out.println("bl22 = " + bl22);//true


        //-----------------------------------------------  concat(birleştirmek) -----------------------------
        System.out.println("----------------------------------------------- concat() --------------------------------------------------");
        //birleştirir (+) ile aynı işlev aslında.
        String str21 = str20.concat(str1);
        System.out.println("str21 = " + str21);

    }
}
