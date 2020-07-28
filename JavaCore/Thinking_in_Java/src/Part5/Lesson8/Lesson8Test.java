package Part5.Lesson8;

import java.util.Random;

public class Lesson8Test {

    public static class TestClass
    {
         void func1()
        {
            System.out.println("func1");
            func2();
           this.func2();
        }

         void func2()
        {
            System.out.println("func2");
        }
    }

    public static void main(String[] args)
    {
        TestClass tc = new TestClass();
        tc.func1();
        tc.func2();
    }
}
