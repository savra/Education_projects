package Part3.Lesson8;

public class Lesson8Test {
    public static void main(String[] args)
    {
        long l1 = 0123;
        long l2 = 0xAB;

        float float_min = 1.4E-45f;
        float float_max = 3.4028235E38f;
        double double_min = 4.9E-324;
        double double_max = 1.7976931348623157E308;

        System.out.println(Long.toBinaryString(l1));
        System.out.println(Long.toBinaryString(l2));

        System.out.println("Float min value: " + float_min);
        System.out.println("Double min value: " + double_min);
        System.out.println("Float max value: " + float_max);
        System.out.println("Double max value: " + double_max);
    }
}
