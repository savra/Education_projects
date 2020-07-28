package Part5.Lesson1;

public class Lesson1Test {
    static String s = "first string";

    Lesson1Test(String s)
    {
        this.s = s;
    }

    public static void f()
    {
        System.out.println(s);
    }

    public static void main(String[] args)
    {
        System.out.println(s);
        Lesson1Test g = new Lesson1Test("second string");
        Lesson1Test.f();
    }
}
