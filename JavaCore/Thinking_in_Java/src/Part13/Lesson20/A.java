package Part13.Lesson20;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.LinkedList;
import java.util.Scanner;

public class A {
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    String stringValue;

    A(String str) {
        Scanner scn = new Scanner(str);
        intValue = scn.nextInt();
        longValue = scn.nextLong();
        floatValue = scn.nextFloat();
        doubleValue = scn.nextDouble();
        stringValue = scn.next();
    }

    @Override
    public String toString() {
       return String.format("IntValue = %d LongValue = %d FloatValue = %f DoubleValue =  %f StringValue = %s", intValue, longValue, floatValue, doubleValue,stringValue);
    }

    public static void main(String[] str) {
        A a = new A("232 28897979 38712,21 398797997,098990797 dskjhkahk");
        System.out.println(a);
    }
}
