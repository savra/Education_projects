package Part16.Lesson23;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays23 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{(int) (Math.random() * (100 - 1) + 1), (int) (Math.random() * (100 - 1) + 1),
                (int) (Math.random() * (100 - 1) + 1), (int) (Math.random() * (100 - 1) + 1),
                (int) (Math.random() * (100 - 1) + 1)};
        System.out.println("Before sort");
        System.out.println(Arrays.toString(integers));
        System.out.println("After sort");
        Arrays.sort(integers, Integer::compare);
        System.out.println(Arrays.toString(integers));
    }

}
