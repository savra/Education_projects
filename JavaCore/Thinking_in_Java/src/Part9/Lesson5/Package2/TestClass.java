package Part9.Lesson5.Package2;

import Part9.Lesson5.Package1.TestImpl;

public class TestClass implements TestImpl {

    public void f1() {
        System.out.println("f1");
    }

    public void f2() {
        System.out.println("f2");
    }

    public void f3() {
        System.out.println("f3");
    }

    public static void main(String[] args) {
        TestClass ts = new TestClass();
        ts.f1();
        ts.f2();
        ts.f3();
    }
}
