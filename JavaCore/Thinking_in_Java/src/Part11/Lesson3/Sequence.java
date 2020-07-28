package Part11.Lesson3;

import java.util.ArrayList;

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
        private int i = 0;

        public boolean end() {
            return i == items.size();
        }

        public Object current() {
            return items.get(i);
        }

        public void next() {
            if (i < items.size())
                i++;
        }

        public void prev() {
            if (i > 0)
                i--;
        }

        public Sequence getOuterRef() {
            return Sequence.this;
        }
    }

    private class SequenceSelectorReverse implements Selector {
        private int i = items.size() - 1;

        public boolean end() {
            return i == 0;
        }

        public Object current() {
            return items.get(i);
        }

        public void next() {
            if (i >= 0)
                i--;
        }

        public Sequence getOuterRef() {
            return Sequence.this;
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
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }

        System.out.println();

        Selector reverseSelector = sequence.reverseSelector();
        while (!reverseSelector.end()) {
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();
        }
    }
}
