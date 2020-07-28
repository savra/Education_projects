package Part6.Lesson1;

import com.sun.istack.internal.NotNull;

import java.util.*;

public class Pair<T, U> {
    private final T firstValue;
    private final U secondValue;

    public T getFirst() {
        return firstValue;
    }

    public U getSecond() {
        return secondValue;
    }

     private Pair(T firstValue, U secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public static <T, U> Pair<T, U> of(T firstValue, U secondValue) {
        return new Pair<>(firstValue, secondValue);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        return (this.firstValue.equals(((Pair<?, ?>) obj).firstValue) && this.secondValue.equals(((Pair<?, ?>) obj).secondValue));
    }


    @Override
    public int hashCode() {
        return firstValue.hashCode() + secondValue.hashCode();
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(null, null);
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
    }
}
