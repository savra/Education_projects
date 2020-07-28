package Part11.Lesson9;

import java.util.*;

public class Sequence {
    private ArrayList<Object> items;
    private int next = 0;

    public Sequence(int size) {
        items = new ArrayList<>();
    }

    public void add(Object x) {
        items.add(x);
    }


    private class SequenceSelector implements Selector {
        private Object currentElement;

        public boolean end() {
            return true;
        }

        public Object current(Iterator<Object> iterator) {
            return currentElement;
        }

        public void next(Iterator<Object> iterator) {
            if (iterator.hasNext()) {
                currentElement = iterator.next();
            }
        }
    }

    private class SequenceSelectorReverse implements Selector {
        private Object currentElement;

        public boolean end() {
            return true;
        }

        public SequenceSelectorReverse() {
            Collections.reverse(items);
        }

        public Object current(Iterator<Object> iterator) {
            return currentElement;
        }

        public void next(Iterator<Object> iterator) {
            if (iterator.hasNext()) {
                currentElement = iterator.next();
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector reverseSelector() {
        return new SequenceSelectorReverse();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(13);

        for (int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));

        sequence.add(new SomeClass("A"));
        sequence.add(new SomeClass("B"));
        sequence.add(new SomeClass("C"));
        sequence.add(new SomeClass("D"));

        Iterator<Object> iterator = sequence.items.iterator();

        Selector selector = sequence.selector();

        while (iterator.hasNext()) {
            selector.next(iterator);
            System.out.print(selector.current(iterator) + " ");
        }

        System.out.println();

        Iterator<Object> reverseIterator = sequence.items.iterator();

        Selector reverseSelector = sequence.reverseSelector();
        while (reverseIterator.hasNext()) {
            reverseSelector.next(reverseIterator);
            System.out.print(reverseSelector.current(iterator) + " ");
        }
    }
}
