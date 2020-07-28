package Part11.Lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class A {


    public static void main(String... args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> l2 = new ArrayList<>(5);
        ListIterator<Integer> li = l.listIterator(l.size());

        while (li.hasPrevious()) {
            l2.add(li.previous());
        }

        for (Integer item : l)
            System.out.println(item);

        for (Integer item : l2)
            System.out.println(item);
    }
}
