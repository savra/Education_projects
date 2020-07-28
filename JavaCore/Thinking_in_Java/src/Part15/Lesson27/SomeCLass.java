package Part15.Lesson27;


import com.sun.javafx.image.IntPixelGetter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SomeCLass {

    public static void main(String []args) {
        //List<Number> list = new ArrayList<Integer>(); Not working
        List<? extends Number> llist = new ArrayList<Integer>();

        ArrayList<Integer> f = new ArrayList<>();
        f.add(1);
        f.add(5);
        List<? extends Number> list = f;

        for (Number item : list)
            System.out.println(item);
        f.add(7);
        System.out.println("-------");
        for (Number item : list)
            System.out.println(item);

        List<? extends Number> list1 = new ArrayList<Integer>();
        List<? > list2 = new ArrayList<Integer>();

        list1 = list;
        list2 = list;
        for (Object item : list2)
            System.out.println((Integer) item);
    //    list1.add(new Integer(6));
        for (Number item : list1)
            System.out.println(item);
    }
}
