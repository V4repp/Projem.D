package test.day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList2 {public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(100);
    list.add(200);
    list.add(200);
    list.add(200);
    list.add(300);
    list.add(400);
    list.add(500);

    System.out.println(list);
        /*
        int num = 1;
        list.remove(num);
*/
    Integer num = 200;
    //list.remove(200);
    boolean r = list.remove(num);

    System.out.println(list);
    System.out.println(r);

    System.out.println("-----------------------------------------");

    System.out.println(list.size());

    list.clear();

    System.out.println(list.size());

    System.out.println(list);

    System.out.println("-----------------------------------------");

    ArrayList<Character> characters = new ArrayList<>();
    characters.add('B');//0
    characters.add('A');//1
    characters.add('A');
    characters.add('A');
    characters.add('A');//4

    int a = characters.indexOf('A'); //1
    int b = characters.lastIndexOf('A'); //4

    System.out.println(a);
    System.out.println(b);

    System.out.println("--------------------------------------------");

    boolean r2 = characters.contains('A');//true

    boolean r3 = characters.contains('Z');//false

    System.out.println("r2 = " + r2);
    System.out.println("r3 = " + r3);

    System.out.println("--------------------------------");

    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(100);//0
    list1.add(100);//1
    list1.add(100);//2

    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(100);//0
    list2.add(100);//1
    System.out.println("list2.add(100) = " + list2.add(100));//2 içinde add() metodundaki parantez içindeki öge var mı yok mu diye bakar varsa true yoksa false olur !!!


    System.out.println("list1.get(0).equals( list1.get(1)) = " + list1.get(0).equals(list1.get(1)));

    //System.out.println("list2.add(100) = " + list2.add(100));

    System.out.println(list1 == list2);//false
    System.out.println(list1.equals(list2));//true ==> Same elements(aynı eleman), in the same order(aynı sırada), having same size(aynı boyutta)

    System.out.println("-----------------------------------------");
    list1.clear();
    System.out.println("list1 = " + list1);
    boolean r4 = list1.isEmpty(); // true [boşmu => (isEmpty)]

    System.out.println("r4 = " + r4);

    System.out.println("----------------------------------");

    ArrayList<Integer> numbers = new ArrayList<>();
    //Bulk Operation: CollectionType
    numbers.addAll(Arrays.asList(1, 2, 2, 2, 2, 2, 1, 3, 4, 5, 6, 7, 1, 1,2,2, 1, 1, 1));

    System.out.println(numbers);

    Collections.replaceAll(numbers, 2, 9);//(... yerine hepsini koy => replaceAll

    System.out.println("numbers = " + numbers);

}
}
