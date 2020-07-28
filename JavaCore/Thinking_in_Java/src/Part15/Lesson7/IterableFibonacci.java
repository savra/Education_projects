package Part15.Lesson7;

import java.util.Iterator;

public class IterableFibonacci implements Iterable<Integer> {
    private int n;
    private Fibonacci fibonacci;

    public IterableFibonacci(int count) {
        n = count;
        fibonacci = new Fibonacci();
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return n > 0;
            }

            public Integer next() {
                n--;
                return fibonacci.next();
            }

            public void remove() { // Не реализован
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFibonacci(18))
            System.out.print(i + " ");
    }
}
