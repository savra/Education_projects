package Part12.Lesson12;

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        try {
            items[next++] = x;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вышли за границы массива");
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length)
                i++;
        }

        public Sequence getOuterRef() {
            return Sequence.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);

        for (int i = 0; i < sequence.items.length; i++)
            sequence.add(Integer.toString(i));

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
