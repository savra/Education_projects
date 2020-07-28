package Part15.Lesson33;

import java.util.ArrayList;

class FixedSizeStack<T> {
    private int index = 0;
    private ArrayList<T> storage;

    public FixedSizeStack(int size) {
        storage = new ArrayList<>(size);
    }

    public void push(T item) {
        storage.add(index++, item);
    }

    public T pop() {
        return (T) storage.get(--index);
    }
}


public class GenericCast {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        FixedSizeStack<String> strings = new FixedSizeStack<String>(SIZE);
        for (String s : "A B C D E F G H I !".split(" ")) strings.push(s);
        for (int i = 0; i < SIZE; i++) {
            String s = strings.pop();
            System.out.print(s + " ");
        }
    }
}