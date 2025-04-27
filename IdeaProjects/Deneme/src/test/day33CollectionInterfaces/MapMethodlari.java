package test.day33CollectionInterfaces;

import java.util.HashMap;
import java.util.Map;

public class MapMethodlari {
    public static void main(String[] args) {
        Map<String,Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);


        System.out.println("students = " + students);
        System.out.println(students.size());

        System.out.println(students.get("Alex"));

        students.replace("Ali",90);
        System.out.println("students = " + students);

        students.remove("Alex");
        System.out.println("students = " + students);

        boolean bl = students.containsKey("Ali");
        System.out.println(bl);

        boolean bl1 = students.containsValue(95);
        System.out.println("bl1 = " + bl1);

        boolean bl2 = students.isEmpty();
        System.out.println("bl2 = " + bl2);

        Map<String,Integer> map1 = new HashMap<>();
        map1.putAll(students);
        System.out.println("map1 = " + map1);


        boolean bl3 = students.equals(map1);
        System.out.println("bl3 = " + bl3);

        map1.clear();
        System.out.println("map1 = " + map1);

        boolean bl4 = students.equals(map1);
        System.out.println("bl4 = " + bl4);

        students.putIfAbsent("Alex",10);
        System.out.println("students = " + students);

        students.putIfAbsent("Alex",15);
        System.out.println("students = " + students);

        students.put("Alex",15);
        System.out.println("students = " + students);
    }
}
