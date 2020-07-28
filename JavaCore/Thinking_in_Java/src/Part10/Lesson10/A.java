package Part10.Lesson10;

public class A {
    private class B implements I {
        public void f() {
            System.out.println("I am private inner class");
        }

        I f2() {
            return new B();
        }
    }

    I ff() {
        return new B();
    }

    public static void main(String[] args) {
        A a = new A();
        I i = a.new B();

        B b = (A.B)i;
        b.f();


    }
}

interface I {
    void f();
}