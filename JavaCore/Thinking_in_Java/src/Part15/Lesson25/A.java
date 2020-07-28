package Part15.Lesson25;


class B implements I2 {
    @Override
    public void f3() {

    }
}

public class A implements I1, I2 {

    @Override
    public void f2() {
        System.out.println("Method f2");
    }

    @Override
    public void f3() {
        System.out.println("Method f3");
    }

    public <T extends I1> void someMethod1(T someVar) {
        f2();
    }

    public <T extends I2> void someMethod2(T someVar) {

    }

    public static void main(String...args) {
        A a = new A();
        B b = new B();

        a.someMethod1(a);
        a.someMethod2(a);
        a.someMethod2(b);
    }
}
