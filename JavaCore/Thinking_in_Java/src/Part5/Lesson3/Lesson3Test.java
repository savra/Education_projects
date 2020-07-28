package Part5.Lesson3;

public class Lesson3Test {
    Lesson3Test()
    {
        System.out.println("default constructor");
    }

    Lesson3Test(String str)
    {
        this();
        System.out.println(str);
    }


    public static void main(String[] args)
    {
        Lesson3Test ls = new Lesson3Test("constructor with arg");
    }
}
