package Part11.Lesson4;

import java.util.*;

public class SomeClass {
    private final ArrayList<String> filmPersonName;
    private static Random rn = new Random();
    private int i = 0;

    SomeClass() {
        filmPersonName = new ArrayList<>();
        filmPersonName.add("name1");
        filmPersonName.add("name2");
        filmPersonName.add("name3");
        filmPersonName.add("name4");
        filmPersonName.add("name5");
        filmPersonName.add("name6");
        filmPersonName.add("name7");
        filmPersonName.add("name8");
        filmPersonName.add("name9");
    }

    int getSize() {
        return filmPersonName.size();
    }

    String next() {
        if (i == filmPersonName.size())
            i = 0;
        return filmPersonName.get(i++);
    }

    public static void main(String[] args) {
        SomeClass s = new SomeClass();
        String[] stringArray = new String[s.getSize()];
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        int j = 0;

        while (j < s.getSize()) {
            stringArray[j] = s.next();
            j++;
        }

        while (j < s.getSize()) {
            linkedList.add(s.next());
            j++;
        }

        while (j < s.getSize()) {
            hashSet.add(s.next());
            j++;
        }
        while (j < s.getSize()) {
            linkedHashSet.add(s.next());
            j++;
        }
        while (j < s.getSize()) {
            treeSet.add(s.next());
            j++;
        }

        for (String item : stringArray)
            System.out.println(item);
        for (String item : arrayList)
            System.out.println(item);
        for (String item : linkedList)
            System.out.println(item);
        for (String item : hashSet)
            System.out.println(item);
        for (String item : linkedHashSet)
            System.out.println(item);
        for (String item : treeSet)
            System.out.println(item);
    }
}
