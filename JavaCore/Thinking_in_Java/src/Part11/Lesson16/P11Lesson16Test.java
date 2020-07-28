package Part11.Lesson16;

import sun.reflect.generics.tree.Tree;

import java.io.FileReader;
import java.util.*;

public class P11Lesson16Test {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>(Arrays.asList('e', 'y', 'u', 'i', 'o', 'a'));
        Set<String> words = new TreeSet<>(Arrays.asList("А", "add", "addAll", "added", "args", "В", "С", "class", "Collections", "contains", "containsAll", "D", "E", "F", "false",
                "from", "G", "Н", "HashSet", "holding", "I", "import", "in", "1", "java", "K", "L", "M", "main", "mindview", "N", "net",
                "new", "Output", "Print", "public", "remove", "removeAll", "removed", "Set", "setl", "set2", "SetOperations", "split",
                "static", "String", "to", "true", "util", "void", "X", "Y", "Z"));

        long totalCount = 0;
        long currentCount = 0;

        Map<String, Long> map = new HashMap<>();
        for (String item : words) {
            for (Character c : set) {
                currentCount += item.chars().filter(ch -> Character.toLowerCase(ch)  == c).count();
            }
            map.put(item, currentCount);
            totalCount += currentCount;
            currentCount = 0;
        }

        for (Map.Entry<String, Long> item : map.entrySet()) {
            System.out.println("String " + item.getKey() + " contains " + item.getValue() + " vowels");
        }

        System.out.println(String.format("Total count in all words %d", totalCount));
    }
}
