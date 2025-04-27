package test.day23;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods1 {public static void main(String[] args) {

    // *********** ARRAY REVIEW *************
    System.out.println("******** ARRAY REVIEW (Gözden Geçirmek) ***********");
    int[] array = {1, 2, 3, 4, 5};

    int[] array1 = new int[5];

    array1[2] = 13;

    System.out.println("array1[0] = " + array1[0]);//0
    System.out.println("array[4] = " + array[4]);

    //array1[0]=9;

    System.out.println("array1 = " + Arrays.toString(array1));//[0,0,0,0,0]

    System.out.println();


    // *********** ARRRAY LIST add() Method ***********
    System.out.println("------------------------------add() (Eklemek) --------------------------------");
    System.out.println();

    ArrayList<Integer> numbers = new ArrayList<>();//default 10

    System.out.println("ArrayList before adding data = " + numbers);//[]

    numbers.add(10); //0    --> 0 - 10
    numbers.add(20); //1    --> 1 - 20
    numbers.add(30); //2    --> 2 - 30  ==> 25
    numbers.add(40); //3    --> 3 - 40
    numbers.add(50); //4    --> 4 - 50
    numbers.add(60); //5    --> 5 - 60
    numbers.add(70); //6    --> 6 - 70
    //--> 6 - 50
    // --> 7 - 60

    System.out.println("ArrayList after adding data = " + numbers);//numbers = [10, 20, 30, 40, 50, 60]

    numbers.add(2, 25); //2
    numbers.add(5, 45); //5
    numbers.add(8, 100); //8 -->8 - 100

    //numbers.add(10, 45); //5

    System.out.println("numbers = " + numbers); //numbers = [10, 20, 25, 30, 40, 45, 50, 60, 70]

    System.out.println("numbers.add(15) = " + numbers.add(15));//true

    System.out.println("numbers.add(7) = " + numbers.add(10));//true

    numbers.add(8);//return type is boolean

    System.out.println(numbers); //[10, 20, 25, 30, 40, 45, 50, 60, 7, 8]

    System.out.println();


    // ********** ARRRAY LIST size() Method ***********                                                        ?????????
    System.out.println("----------------size()--------------------");
    System.out.println();

    System.out.println(numbers.size());
    int lastIndex = numbers.size() - 1;

    System.out.println("lastIndex = " + lastIndex);

    System.out.println();


    // ********** ARRRAY LIST get() Method ************
    System.out.println("----------------get() (Getirmek) --------------------");
    System.out.println();


    int num = numbers.get(3);


    System.out.println("num = " + num);

    System.out.println();


    // ********** ARRRAY LIST for loop ************
    System.out.println("----------------forLoop()--------------------");
    System.out.println();


    for (int i = 0; i < numbers.size(); i++) {

        System.out.println(numbers.get(i));
    }

    System.out.println("------------------//////////////////\\\\\\\\\\\\\\\\\\\\\\\\----------------");
    for (int i = numbers.size() - 1; i >= 0; i--) {

        System.out.println(numbers.get(i));

    }

    System.out.println();


    // ********** ARRRAY LIST for each loop ************                                                   ?????????????
    System.out.println("----------------for Each Loop()--------------------");
    System.out.println();
    for (Integer eachNumber : numbers) { // (:) Loopun her bir turunda solundaki değişkene(eachNumber) sağındaki objectin (numbers) sadece bir elemanını atıyor.
        System.out.println("eachNumber = " + eachNumber);

    }

    System.out.println();


    // ********** ARRRAY LIST set() method ************
    System.out.println("----------------set() Yerleştirme --------------------");
    System.out.println();

    ArrayList<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Python");
    list.add("Java");//2
    list.add("C#");//3
    list.add("Ruby");


    System.out.println("list before set = " + list);
    list.set(2, "JavaScript"); // replace (Yerine koyma)
    list.set(3, "C++");


    System.out.println(list);

    System.out.println();


    // ********** ARRRAY LIST remove() method ************
    System.out.println("----------------remove() Silme --------------------");
    System.out.println();

    // remove() metodun da ilk gördüğünü siler mesela ben String oluşturdum diyelim orada 3 tane Ali var bunlardan ilk gördüğünü siler. !!!

    ArrayList<String> employees = new ArrayList<>();

    employees.add("Suat");//0
    employees.add("Aygun");
    employees.add("Olga");
    employees.add("Suat");//3
    employees.add("Kaloyan");
    employees.add("Neira");
    employees.add("Ali");
    employees.add("Kaloyan");
    employees.add("Hulya");
    employees.add("Kaloyan");

    System.out.println(employees);

    System.out.println("employees.remove(0) = " + employees.remove(0));


    //employees.remove("Suat");
    // employees.remove(3);

//employees.removeIf(each->each.equals("Kaloyan"));

    employees.removeIf(meta -> meta.equals("Kaloyan"));//?

//employees.removeAll(Arrays.asList("Kaloyan"));


    System.out.println(employees);

    employees.remove(0);

    System.out.println(employees);

    employees.remove(0);

    System.out.println(employees);

    employees.remove(1);

    System.out.println(employees);

    employees.remove(employees.size() - 1);

    System.out.println(employees);

    boolean r1 = employees.remove("Hulya");

    System.out.println(employees);

    boolean r2 = employees.remove("Neira");

    System.out.println(employees);


    System.out.println("r1 = " + r1);
    System.out.println("r2 = " + r2);


}
}
