package Part6.Lesson2;

import java.util.HashSet;
import java.util.Set;

public class SymDifference {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<? super T> result = new HashSet<>(set1), tmp = new HashSet<>(set1);
        result.addAll(set2);
        tmp.retainAll(set2);
        result.removeAll(tmp);
        return (Set<T>) result;
    }

    public static void main(String[] args) {
        System.out.println(symmetricDifference(new HashSet<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        }, new HashSet<Integer>() {{
            add(0);
            add(1);
            add(2);
        }}));
    }
}
