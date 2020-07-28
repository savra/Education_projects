package Part11.Lesson17;

import java.util.*;

public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("Its gerbilNumber " + gerbilNumber);
    }

    public static void hashMap() {
        Gerbil g;
        Map<String, Gerbil> al = new LinkedHashMap<String, Gerbil>();

        for (int i = 1; i <= 10; i++) {
            g = new Gerbil(i);
            al.put(g.getClass().getName() + i, g);
        }

        for (String item : al.keySet()) {
            al.get(item).hop();
        }
    }

    public static void hashSet() {
        Gerbil g;
        Set<Gerbil> set = new HashSet<Gerbil>();

        for (int i = 1; i <= 10; i++) {
            set.add(new Gerbil(i));
        }

        for (Gerbil i : set) {
            i.hop();
        }
    }

    public static void linkedHashSet() {
        Gerbil g;
        Set<Gerbil> set = new LinkedHashSet<Gerbil>();

        for (int i = 1; i <= 10; i++) {
            set.add(new Gerbil(i));
        }

        for (Gerbil i : set) {
            i.hop();
        }
    }

    public static void main(String[] args) {
        Gerbil.hashMap();
        System.out.println();
        Gerbil.hashSet();
        System.out.println();
        Gerbil.linkedHashSet();
    }
}
