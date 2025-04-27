package test.day33CollectionInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Mat_Calismasi2 {
    public static void main(String[] args) {
        ArrayList<String> group1 = new ArrayList<>(Arrays.asList( "Duygu","Magda","Farangez","Edison","Kerem","Farangis" ));
        ArrayList<String> group2 = new ArrayList<>(Arrays.asList( "Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat" ));
        ArrayList<String> group9 = new ArrayList<>(Arrays.asList( "Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem" ));
        ArrayList<String> group24 = new ArrayList<>(Arrays.asList( "Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas" ));
        ArrayList<String> group5 = new ArrayList<>(Arrays.asList("Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene" ));

        Map<Integer,ArrayList> gruplar = new TreeMap<>();
        gruplar.put(1,group1);
        gruplar.put(2,group2);
        gruplar.put(9,group9);
        gruplar.put(24,group24);
        gruplar.put(5,group5);

        System.out.println("gruplar = " + gruplar);
                                                                     //key  . ındex number
        System.out.println("(gruplar.get(24).get(1)) = " + (gruplar.get(24).get(1)));

        for (ArrayList eachGrup : gruplar.values()) {
            System.out.println("eachGrup = " + eachGrup);
            for (Object eachName : eachGrup) {
                System.out.println("eachName = " + eachName);
            }
        }

        for (Integer eachKeys : gruplar.keySet()) {
            System.out.println("eachKeys = " + eachKeys);
        }
    }
}
