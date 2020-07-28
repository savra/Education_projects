package Part6.Lesson4.TestProtected1;

public class TestProtected1 {
    public int field1;
    int field2;
    protected int field3;
    private int field4;

    protected String field5;

    public TestProtected1() {}

    protected TestProtected1(String str)
    {
        field5 = str;
    }

    public void f1()
    {
        System.out.println("Public");
    }

    void f2()
    {
        System.out.println("Default");
    }

    protected void f3()
    {
        System.out.println("Protected");
    }

    private void f4()
    {
        System.out.println("Private");
    }


}

class TestProtected3
{
    String someVal;

    TestProtected3()
    {
        TestProtected1 ts = new TestProtected1("Protected");
        someVal = ts.field5;
        System.out.println(someVal);
    }

    public static void main(String ... args)
    {
        TestProtected3 ts3 = new TestProtected3();

    }
}
