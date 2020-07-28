package Part17.Lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unsupported {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I J K".split(" "));

        try {
            list.add("ll");
        } catch (UnsupportedOperationException e) {
            System.out.println("add(): " + e);
        }

        try {
            list.size();
        } catch (UnsupportedOperationException e) {
            System.out.println("size(): " + e);
        }
        try {
            list.listIterator();
        } catch (UnsupportedOperationException e) {
            System.out.println("listIterator(): " + e);
        }
        try {
            list.remove(0);
        } catch (UnsupportedOperationException e) {
            System.out.println("remove(): " + e);
        }
        try {
            list.subList(0, 5);
        } catch (UnsupportedOperationException e) {
            System.out.println("subList(): " + e);
        }
        try {
            list.clear();
        } catch (UnsupportedOperationException e) {
            System.out.println("clear(): " + e);
        }
        try {
            list.sort(String.CASE_INSENSITIVE_ORDER);
        } catch (UnsupportedOperationException e) {
            System.out.println("sort(): " + e);
        }
        try {
            list.isEmpty();
        } catch (UnsupportedOperationException e) {
            System.out.println("isEmpty(): " + e);
        }
        try {
            list.set(0, "L");
        } catch (UnsupportedOperationException e) {
            System.out.println("set(): " + e);
        }

        for (String s: list) {
            System.out.println(s);
        }
    }
}
