package test.day10_string_sworkout;

public class String_Calismasi_2 {
    public static void main(String[] args) {
        //-----------------------------------------------  replace(yer değiştirme) -----------------------------
        System.out.println("----------------------------------------------- replace() -----------------------------");

        String str1 = "I love java, java is nice";
        str1 = str1.replace("j", "J");
        System.out.println("str1 = " + str1);
        str1=str1.replace("Java","phyton");
        System.out.println("str1 = " + str1);

        //-----------------------------------------------  replaceFirst(önce yer değiştir) -----------------------------
        System.out.println("----------------------------------------------- replaceFirts() -----------------------------");

       str1= str1.replaceFirst("phyton","java");
        System.out.println("str1 = " + str1);


    }
}
