package Part9.Lesson4;

public abstract class A {
    abstract void f();
}


class B extends A {

    void f() {
        System.out.println("BBBB");
    }

    static void f2(A someA) {
        someA.f();
    }

    public static void main(String[] args) {

        f2(new B());
    }
}
