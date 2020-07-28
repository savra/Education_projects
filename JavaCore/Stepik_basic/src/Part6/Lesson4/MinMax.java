package Part6.Lesson4;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMax {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {


        List<? extends T> arrayList = stream.collect(Collectors.toList());

        if (arrayList.size() == 0) minMaxConsumer.accept(null, null);
        else {
            Optional<? extends T> max = Optional.ofNullable(Collections.max(arrayList, order));
            Optional<? extends T> min = Optional.ofNullable(Collections.min(arrayList, order));

            minMaxConsumer.accept(min.orElse(null), max.orElse(null));
        }

    }

    public static void main(String[] args) {
        Comparator<Integer> integerComparator = Integer::compareTo;
        BiConsumer<Integer, Integer> minMaxConsumer = null;

        //findMinMax(Stream.generate(() -> (int) (Math.random() * (20 - 10) + 10)).limit(30), integerComparator, minMaxConsumer);
        findMinMax(Stream.empty(), integerComparator, minMaxConsumer);

        System.out.println(minMaxConsumer.toString());

        // .min().mapToObj((x) -> x + " ").forEach(System.out::print);
        // findMinMax();
        //  Optional
    }
}
