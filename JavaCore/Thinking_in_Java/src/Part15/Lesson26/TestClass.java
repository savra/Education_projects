package Part15.Lesson26;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String ... args) {
        Number[] arrayNumber = new Integer[10];
        arrayNumber[0] = new Integer(1);
       // arrayNumber[1] = new Short((short)2);
     //   arrayNumber[1] = new Double(2);  //ArrayStoreException
        arrayNumber[2] = 6; //OK

        List<?> intList = new ArrayList<Integer>();

        Number[] numbers = new Number[5];
        numbers[0] = 1;
        numbers[1] = 2d;
        numbers[2] = (short) 5;

        for (Number item : numbers)
            System.out.println(item);
    }
}
