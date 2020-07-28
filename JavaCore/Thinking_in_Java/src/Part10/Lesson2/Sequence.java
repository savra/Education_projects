package Part10.Lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sequence<T> {
    private T[] items;
    private int next = 0;
    public Sequence(Class<T[]> clazz, int size) {
        items = clazz.cast(Array.newInstance(clazz.getComponentType(), size));
    }
    public void add(T x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() {
            return i == items.length;
        }

        public T current() {
            return items[i];
        }

        public void next() {
            if (i < items.length)
                i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence<SomeClass> sequence = new Sequence<>(SomeClass[].class, 13);

        for(int i = 0; i < 10; i++)
            sequence.add(new SomeClass(Integer.toString(i)));

        sequence.add(new SomeClass("A"));
        sequence.add(new SomeClass("B"));
        sequence.add(new SomeClass("C"));
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
