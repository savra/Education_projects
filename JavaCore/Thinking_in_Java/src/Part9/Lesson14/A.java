package Part9.Lesson14;

public interface A {
    void a1();
    void a2();
}

interface B {
    void b1();
    void b2();
}

interface C {
    void c1();
    void c2();
}

interface D extends A, B, C {
    void d();
}
