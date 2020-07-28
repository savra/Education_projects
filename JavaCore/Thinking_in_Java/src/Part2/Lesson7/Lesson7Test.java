package Part2.Lesson7;

public class Lesson7Test {
    public static void main(String[] args)
    {
        Incrementable sf = new Incrementable();
        StaticTest st = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest st3 = new StaticTest();

        System.out.println(StaticTest.i);
        System.out.println(st.i);
        System.out.println(st2.i);
        System.out.println(st3.i);
        sf.increment();
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}
