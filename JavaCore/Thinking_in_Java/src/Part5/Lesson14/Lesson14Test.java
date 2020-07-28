package Part5.Lesson14;

public class Lesson14Test {
    static String s1 = "string 1";

    static String s2;

    static {
        s2 = "string 2";
    }

    static void f1()
    {
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void main(String[] args)
    {
        f1();
    }
}
