package test.day23;

import java.util.ArrayList;
import java.util.Arrays;

public class RevomeIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

       /* for (int i = 0 ; i<=list.size()-1; i++){
            if (list.get(i)%2==1){
                list.remove(i);
            }

        }*/

//        list.removeIf(p ->p<5);

        list.removeIf(each -> each % 2 == 1);
        System.out.println("list = " + list);

        System.out.println("-------------------------------- String RemoveIf ---------------------------------------");

        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("java","javaScript","C++","C#","java","phyton"));

        list1.removeIf(p ->p.contains("j"));
        System.out.println("list1 = " + list1);

        
    }
}
