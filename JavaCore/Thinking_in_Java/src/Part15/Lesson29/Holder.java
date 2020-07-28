package Part15.Lesson29;

import java.util.LinkedList;
import java.util.List;

public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T val) {
        value = val;
    }

    public void set(T val) {
        value = val;
    }

    public T get() {
        return value;
    }

    public boolean equals(Object obj) {
        return value.equals(obj);
    }
}


class TestClass {
    public static void f(Holder<List<?>> holder) {
        Holder<Integer> integerHolder = new Holder<>();
        holder.equals(integerHolder);
        List<?> list = holder.get();
        holder.set(new LinkedList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        });

    }

    public static void main(String[] args) {
        Holder<List<?>> holder = new Holder<>();
        holder.set(new LinkedList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
            }
        });

        List<?> h = holder.get();

        for (Object item : h)
            System.out.println(item);

        h.forEach(x -> System.out.println(x));
      //  TestClass.f();
    }
}
