package test.day33CollectionInterfaces;

import java.util.*;

public class List_Intro {
    public static void main(String[] args) {

        List<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(10,5,2,80,100));

        List<Integer>list2=new LinkedList<>();
        list2.addAll(Arrays.asList(10,5,2,80,100));

        List<Integer>list3=new Vector<>();
        list3.addAll(Arrays.asList(10,5,2,80,100));

        List<Integer>list4=new Stack<>();
        list4.addAll(Arrays.asList(10,5,2,80,100));

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);
        System.out.println("list4 = " + list4);

        System.out.println(list1.get(0));
        System.out.println(list2.get(0));
        System.out.println(((Stack)list4).pop());//last in first out
        //System.out.println(list4.pop());
        System.out.println("list4 = " + list4);
        System.out.println(list1.size());

    }
}
