package Part17.Lesson7;

import java.util.*;

public class Collections7 {
    public static void main(String[] args) {
        List<String> arrayListString = new ArrayList<>(Arrays.asList("ALGERIA", "ANGOLA", "BENIN", "BOTSWANA", "BULGARIA", "BURKINA FASO", "RUSSIA"));
        List<String> linkedListString = new LinkedList<>(Arrays.asList("POLAND", "SWEDEN", "IRELAND", "GERMANY", "FINLAND"));

        Iterator<String> arrayListIterator = arrayListString.iterator();
        Iterator<String> linkedListIterator = linkedListString.iterator();

        System.out.println("arrayListString: ");
        while (arrayListIterator.hasNext())
            System.out.println(arrayListIterator.next());

        System.out.println("\nlinkedListString: ");
        while (linkedListIterator.hasNext())
            System.out.println(linkedListIterator.next());


        ListIterator<String> a_listIterator = arrayListString.listIterator();
        ListIterator<String> l_listIterator = linkedListString.listIterator();

        System.out.println("\n--------: ");

        while (a_listIterator.hasNext()) {
            l_listIterator.add(a_listIterator.next());
            if (l_listIterator.hasNext())
                l_listIterator.next();
        }

        linkedListString.forEach(System.out::println);


    }
}
