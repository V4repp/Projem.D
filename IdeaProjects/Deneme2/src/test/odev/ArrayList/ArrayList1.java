package test.odev.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    public static void main(String[] args) {
         /*Birden fazla olan aynı elemanların fazla olanlarını sil...
      Elemanlar, 10, 1, 10, 2, 20, 20, 30, 3, 5, 30, 10, 20, 30     +
      addAll() metodunu kullnalım.,    +
      Unique Element; Tek olan elemanları bul;
      Cydeo, Java, Java, Muhammet, Ali, Fatma, Ersin, Ersin, Ayşe, Elif, Elif, Kubilay*/

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 1, 10, 2, 20, 20, 30, 3, 5, 30, 10, 20, 30));

        ArrayList<Integer> sonucInt = new ArrayList<>();
/*
        for (int i=0 ; i < numbers.size();i++){ //i=0, 1, 2,
            if (!(sonucInt.contains(numbers.get(i)))){
                sonucInt.add(numbers.get(i)); //
            }
        }*/
        System.out.println("sonucInt = " + sonucInt);


        for (int i = 0; i < numbers.size(); i++) { //i=0, 1, 2,
            if (sonucInt.contains(numbers.get(i))) {
                continue;
            } else {
                sonucInt.add(numbers.get(i)); //
            }
        }
        System.out.println("sonucInt = " + sonucInt);

        ArrayList<String> kelimeler = new ArrayList<>();
        kelimeler.addAll(Arrays.asList("Cydeo", "Java", "Java", "Muhammet", "Ali", "Fatma", "Ersin", "Ersin", "Ayşe", "Elif", "Elif", "Kubilay"));

        for


    }
}
