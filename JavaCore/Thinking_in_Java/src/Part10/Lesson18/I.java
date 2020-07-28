package Part10.Lesson18;

public interface I {
    void f();

     class NestedClass {
        public static void f2(I a) {
            a.f();
        }
    }
}
