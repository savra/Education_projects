package Part11.Lesson5;

import java.util.ArrayList;
import java.util.List;

public class ListFeatures {
    private int i = 0;
    ListFeatures(int val) {
        i = val;
    }
    public static void main(String[] args) {
       ArrayList<ListFeatures> list = new ArrayList<>();
       list.add(new ListFeatures(1));
       list.add(new ListFeatures(2));
       list.add(new ListFeatures(3));

        for(ListFeatures i : list)
            System.out.println(i.i);

        List<ListFeatures> l2 = ((List<ListFeatures>) list).subList(1,2);

        for(ListFeatures i : l2)
            System.out.println(i.i);

        ((List<ListFeatures>) list).removeAll(l2);

        for(ListFeatures i : list)
            System.out.println(i.i);
    }
}

