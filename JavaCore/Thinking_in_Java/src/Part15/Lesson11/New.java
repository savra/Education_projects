package Part15.Lesson11;

import java.util.*;

public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }

    public static <T> List<T> list() {
        return new ArrayList<T>();
    }

    public static <T> LinkedList<T> lList() {
        return new LinkedList<T>();
    }

    public static <T> Set<T> set() {
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue() {
        return new LinkedList<T>();
    }

    public static <T> A<T> a() {
        return new A<>();
    }

    public static <T> B<T> b() {
        return new B<>();
    }

    static void f(Map<A, List<B>> petPeople) {}

    // Примеры:
    public static void main(String[] args) {
        Map<String, List<String>> sls = New.<String, List<String>>map();
        List<String> ls = New.<String>list();
        LinkedList<String> lls = New.<String>lList();
        Set<String> ss = New.<String>set();
        Queue<String> qs = New.<String>queue();
        A<Integer> a = New.<Integer>a();
        B<String> b = New.<String>b();

    }
}

class A<T> {

}


class B<T> {

}