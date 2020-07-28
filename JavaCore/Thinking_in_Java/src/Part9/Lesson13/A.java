package Part9.Lesson13;

public interface A {
    void a();
}

interface B extends A {
    void b();
}

interface C extends A {
    void c();
}

interface D extends A, B {
    void d();
}
