package test.day23;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCalismasi {
    public static void main(String[] args) {

        ArrayList<String> hayvanlar = new ArrayList<>();

        hayvanlar.add("kedi");
        hayvanlar.add("köpek");
        hayvanlar.add("kuş");
        hayvanlar.add("kuş");
        hayvanlar.add("kuş");
        hayvanlar.add("kuş");

        System.out.println("hayvanlar = " + hayvanlar);

        hayvanlar.add(2, "aslan");

        System.out.println("hayvanlar = " + hayvanlar);

        hayvanlar.remove(2);
        System.out.println("hayvanlar = " + hayvanlar);

        hayvanlar.remove("kuş");
        System.out.println("hayvanlar = " + hayvanlar);

hayvanlar.removeAll(Arrays.asList("kuş"));
        System.out.println("hayvanlar = " + hayvanlar);


        hayvanlar.clear();
        System.out.println("hayvanlar = " + hayvanlar);

        hayvanlar.addAll(Arrays.asList("aslan","kaplan","kartal"));
        System.out.println("hayvanlar = " + hayvanlar);

hayvanlar.set(2,"fare");
        System.out.println("hayvanlar = " + hayvanlar);

        boolean bl = hayvanlar.contains("fare");
        System.out.println("bl = " + bl);

        hayvanlar.reversed();
        System.out.println("hayvanlar = " + hayvanlar);

        String s = hayvanlar.get(1);
        System.out.println(s);
    }
}
