package Part11.Lesson11;

import java.util.*;
import java.util.function.Function;

class B {
    public int a;

    public B(int a) {
        this.a = a;
    }

    public static void f(Collection<B> c) {
        Iterator<B> i = c.iterator();
        while (i.hasNext())
            System.out.println(((B) i.next()).toString());
    }

    @Override
    public String toString() {
        return new String(Integer.toString(a));
    }

}

public class A implements Comparable<A> {
    private int a;

    public A(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return new String(Integer.toString(a));
    }

    public static void f(Collection c) {
        Iterator<Collection> i = c.iterator();
        while (i.hasNext())
            System.out.println(((A) i.next()).toString());
    }

    public static void main(String[] args) {
        Collection<A> c = new ArrayList<>();
        c.add(new A(1));
        c.add(new A(2));
        c.add(new A(3));
        c.add(new A(4));
        c.add(new A(5));

      //  f(c);

        c = new HashSet<>();
        c.add(new A(6));
        c.add(new A(7));
        c.add(new A(8));
        c.add(new A(9));
        c.add(new A(10));
     //   f(c);

        c = new TreeSet<>();
        c.add(new A(11));
        c.add(new A(12));
        c.add(new A(13));
        c.add(new A(14));
        c.add(new A(15));
    //    f(c);

        Collection<B> d = new LinkedHashSet<>();

        Integer[] integers = {4, 5, 3, 4};

        A.func1((v) -> {
            int sum = 0;
            for(int q : v) {
                sum += q;
            }
            return "qwe" + sum;
        }, integers);
        d.add(new B(10));
        d.add(new B(2));
        d.add(new B(37));
        d.add(new B(4));
        d.add(new B(5));
        B.f(d);
    }

    public static  void func1(Function<Integer[], String> function, Integer[] args) {
        System.out.println(function.apply(args));
    }

    @Override
    public int compareTo(A o) {
        return 0;
    }
}
