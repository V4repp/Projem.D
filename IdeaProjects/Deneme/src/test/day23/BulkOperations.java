package test.day23;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(2, 432, 54, 76, 90, 23, 1, 4, 50, 2, 3, 2, 2, 3, 4, 5));

        System.out.println("list = " + list);

        list.removeAll(Arrays.asList(2, 3, 4));

        System.out.println("list = " + list);

        list.remove(0);

        System.out.println("list = " + list);

        list.retainAll(Arrays.asList(90,54,23));

        System.out.println("list = " + list);



    }
}
