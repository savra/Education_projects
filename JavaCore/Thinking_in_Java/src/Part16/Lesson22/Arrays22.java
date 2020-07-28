package Part16.Lesson22;

import java.util.Arrays;

public class Arrays22 {
    public static void main(String[] args) {
        int[] ints = new int[] {1, 3, 2, 7, 4, 9, 6, 5, 8, 10};

        System.out.println(Arrays.binarySearch(ints, 6)); //results are undefined

        Arrays.sort(ints);

        System.out.println(Arrays.binarySearch(ints, 6));
    }
}
