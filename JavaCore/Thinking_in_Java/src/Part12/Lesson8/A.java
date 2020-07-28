package Part12.Lesson8;

import Part12.Lesson4.TestException;

public class A {
    void f() throws TestException {
        throw new TestException("exception");
    }

    public static void main(String[] args) {
        try {
            A a = new A();
            a.f();
        }catch (TestException e) {
            System.out.println(e.getMessage());
        }
    }
}
