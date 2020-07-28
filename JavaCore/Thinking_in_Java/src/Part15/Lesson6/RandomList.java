package Part15.Lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.function.Consumer;

public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        RandomList<String> rs = new RandomList<>();
        for (String s : ("The quick brown fox jumped over " +
                "the lazy brown dog").split(" "))
            rs.add(s);
        for (int i = 0; i < 11; i++)
            System.out.print(rs.select() + " ");

        RandomList<Integer> integerRandomList = new RandomList<>();
        for (int i = 0; i < 10; i++)
            integerRandomList.add(i);
        Consumer<Integer> consumer = System.out::println;
        integerRandomList.storage.forEach(consumer);

        RandomList<Boolean> booleanRandomList = new RandomList<>();
        for (int i = 0; i < 10; i++)
            booleanRandomList.add(i > 5);
        booleanRandomList.storage.forEach(System.out::println);
    }
}
