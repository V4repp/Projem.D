package test.day10;

public class String_Calismasi_1 {
    public static void main(String[] args) {
        String str1 = "Hava çok güzel.";
        // 0123456789101112131415

        //----------------------------------------------- charAt() -----------------------------
        System.out.println("----------------------------------------------- charAt() -----------------------------");

        char ch1 = str1.charAt(10);
        System.out.println("ch1 = " + ch1);
        char ch2 = str1.charAt(5);
        System.out.println("ch2 = " + ch2);
        char ch3 = str1.charAt(12);
        System.out.println("ch3 = " + ch3);

        //----------------------------------------------- length() -----------------------------
        System.out.println("----------------------------------------------- length() -----------------------------");

        int lengthOfStr1 = str1.length();
        System.out.println("lengthOfStr1 = " + lengthOfStr1);

        String str2 = "Yaz tatiline girdik.";
        // 01234567891011121314151617181920
        char ch4 = str2.charAt(17);
        System.out.println("ch4 = " + ch4);
        char ch5 = str2.charAt(13);
        System.out.println("ch5 = " + ch5);
        char ch6 = str2.charAt(7);
        System.out.println("ch6 = " + ch6);
        int lengofStr2 = str2.length();
        System.out.println("lengofStr2 = " + lengofStr2);


        //----------------------------------------------- toLowerCase() -----------------------------
        System.out.println("----------------------------------------------- toLowerCase() -----------------------------");

        str2 = str2.toLowerCase();
        System.out.println("str2 = " + str2);


        //----------------------------------------------- toUpperCase() -----------------------------
        System.out.println("----------------------------------------------- toUpperCase() -----------------------------");

        str2 = str2.toUpperCase();
        System.out.println("str2 = " + str2);

//-----------------------------------------------   trim() -----------------------------
        System.out.println("----------------------------------------------- trim() -----------------------------");

        String str3 = "         Java is        nice         !         ";
        String str4 = str3.trim();
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);


        //-----------------------------------------------   indexOf() -----------------------------
        System.out.println("----------------------------------------------- indexOf() -----------------------------");

        int num1 = str3.indexOf("n");
        System.out.println("num1 = " + num1);


        int num2 = str3.indexOf("a");
        System.out.println("num2 = " + num2);
        int num3 = str3.indexOf("a ");
        System.out.println("num3 = " + num3);
        int num4 = str3.indexOf("!");
        System.out.println("num4 = " + num4);

        String str5 = "Wooden spoon";
        int num5 = str5.indexOf("oon");
        System.out.println("num5 = " + num5);


        //-----------------------------------------------  lastIndexOf() -----------------------------
        System.out.println("----------------------------------------------- lastIndexOf() -----------------------------");

        int num6 = str5.lastIndexOf("o");
        System.out.println("num6 = " + num6);
        int num7 = str5.lastIndexOf("oo");
        System.out.println("num7 = " + num7);
        int num8 = str5.lastIndexOf("n");
        System.out.println(num8);
    }
}
