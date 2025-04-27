package test.day33CollectionInterfaces;

import java.util.*;

public class MapCalismasi {
    public static void main(String[] args) {
        //      Key     Value
        Map<Integer,String > calisanlar= new HashMap<>();
        calisanlar.put(10,"Arthur");
        calisanlar.put(11,"Arthur");
        calisanlar.put(12,"Arthur");
        calisanlar.put(5,"Arthur");
        calisanlar.put(90,"");
        calisanlar.put(3,null);
        System.out.println("calisanlar = " + calisanlar);

        Map<Object, Object> calisanlar2 = new LinkedHashMap<>();
        calisanlar2.put(10,"Arthur");
        calisanlar2.put(11,"Arthur");
        calisanlar2.put(12,"Arthur");
        calisanlar2.put(5,"Arthur");
        calisanlar2.put(90,"");
        calisanlar2.put(3,null);
        System.out.println("calisanlar2 = " + calisanlar2);

        Map<Integer, String> calisanlar3 = new Hashtable<>();
        calisanlar3.put(10,"Arthur");
        calisanlar3.put(11,"Arthur");
        calisanlar3.put(12,"Arthur");
        calisanlar3.put(5,"Arthur");
        calisanlar3.put(90,"Mercedes");
        calisanlar3.put(90,"Ford");
        //calisanlar3.put(3,null); null kabul etmiyor.
        System.out.println("calisanlar3 = " + calisanlar3);

        Map<Integer, String> calisanlar4 = new TreeMap<>();
        calisanlar4.put(10,"Arthur");
        calisanlar4.put(11,"Arthur");
        calisanlar4.put(12,"Arthur");
        calisanlar4.put(5,"Arthur");
        calisanlar4.put(90,"Mercedes");
        calisanlar4.put(90,"Ford");
        //calisanlar3.put(3,null); null kabul etmiyor.
        System.out.println("calisanlar4 = " + calisanlar4);

        List<Map<Integer,String>>list1 = new ArrayList<>();
        //list1.addAll(Arrays.asList(calisanlar,calisanlar2,calisanlar4));

        //MapCalismasi<Integer,List<Integer>> Ogrenciler = new MapCalismasi<>();







    }
}
