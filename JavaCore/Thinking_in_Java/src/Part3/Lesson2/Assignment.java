package Part3.Lesson2;

public class Assignment {

    static void f(Tank t)
    {
        t.level = 10;
    }

    public static void main(String[] args)
    {
        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.level = 9.5f;
        t2.level = 10f;

        System.out.println("1: t1.level: " + t1.level + " t2.level: " + t2.level);

        t1 = t2;

        System.out.println("1: t1.level: " + t1.level + " t2.level: " + t2.level);

        t1.level = 11f;

        System.out.println("1: t1.level: " + t1.level + " t2.level: " + t2.level);

        f(t1);
        System.out.println("1: t1.level: " + t1.level + " t2.level: " + t2.level);
    }
}
