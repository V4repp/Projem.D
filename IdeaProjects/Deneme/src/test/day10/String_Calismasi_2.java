package test.day10;

public class String_Calismasi_2 {
    public static void main(String[] args) {
        //-----------------------------------------------  replace() -----------------------------
        System.out.println("----------------------------------------------- replace() -----------------------------");

        String str1 = "I love java, java is nice";
        str1 = str1.replace("j", "J");
        System.out.println("str1 = " + str1);
        str1=str1.replace("Java","phyton");
        System.out.println("str1 = " + str1);

        //-----------------------------------------------  replaceFirst() -----------------------------
        System.out.println("----------------------------------------------- replaceFirts() -----------------------------");

       str1= str1.replaceFirst("phyton","java");
        System.out.println("str1 = " + str1);


    }
}
