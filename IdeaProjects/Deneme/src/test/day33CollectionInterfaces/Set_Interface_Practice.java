package test.day33CollectionInterfaces;

import java.util.*;

public class Set_Interface_Practice {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,200,500,1000));
        list.addAll(Arrays.asList(10,200,500,1000));
        list.addAll(Arrays.asList(10,200,500,1000));
        list.addAll(Arrays.asList(10,200,500,1000));
        System.out.println("list = " + list);


        Set<Integer> set=new HashSet<>();
        set.addAll(Arrays.asList(10,200,500,1000));
        set.addAll(Arrays.asList(10,200,500,1000));
        set.addAll(Arrays.asList(10,200,500,1000));
        set.addAll(Arrays.asList(10,200,500,1000));
        System.out.println("set = " + set);

        Set<Integer> set1=new LinkedHashSet<>();
        set1.addAll(Arrays.asList(10,200,500,1000));
        set1.addAll(Arrays.asList(10,200,500,1000));
        set1.addAll(Arrays.asList(10,200,500,1000));
        set1.addAll(Arrays.asList(10,200,500,1000));
        System.out.println("set1 = " + set1);

        Set<Integer> set2=new TreeSet<>();
        set2.addAll(Arrays.asList(1000,500,30,2));
        set2.addAll(Arrays.asList(1000,500,30,2));
        set2.addAll(Arrays.asList(1000,500,30,2));
        set2.addAll(Arrays.asList(1000,500,30,2));
        System.out.println("set2 = " + set2);

        List<String>list2=new ArrayList<>();
        list2.add(null);
        System.out.println("list2 = " + list2);

        List<String>list3=new LinkedList<>();
        list3.add(null);
        System.out.println("list3 = " + list3);

        Set<String>set4=new HashSet<>();
        set4.add(null);
        System.out.println("set4 = " + set4);

        Set<String>set5=new LinkedHashSet<>();
        set5.add(null);
        System.out.println("set5 = " + set5);

        Set<String>set6=new TreeSet<>();
//        set6.add(null);
        System.out.println("set6 = " + set6);


    }
}
