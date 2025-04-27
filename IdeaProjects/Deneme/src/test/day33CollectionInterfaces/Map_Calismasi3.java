package test.day33CollectionInterfaces;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Calismasi3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 145000);
        map.put("Cory", 145000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        int maxSalary = Collections.max(map.values());
        System.out.println("maxSalary = " + maxSalary);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue() == maxSalary){
                System.out.println("maxSalary = " + pair.getKey());
            }
        }
    }
}
