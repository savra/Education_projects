package Part7.Lesson1;

public class Lesson1Test {
    String str;

    public Lesson1Test()
    {
        str = "qwe";
    }

    public String toString()
    {
        return  str;
    }
}


class Lesson1Test2 {
    Lesson1Test l;

    public String toString()
    {
        if (l == null)
        {
            System.out.println("111");
            l = new Lesson1Test();
        }
        return l.toString();
    }

    public static void main(String[] args)
    {
        Lesson1Test2 l = new Lesson1Test2();
        System.out.println(l);
    }
}