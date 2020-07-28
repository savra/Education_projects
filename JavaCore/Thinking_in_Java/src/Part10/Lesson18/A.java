package Part10.Lesson18;

public class A implements I {
    public  void f() {
        System.out.println("FFFF");
    }

    public static void main(String ... args) {
        A a = new A();
        I.NestedClass.f2(a);

    }
}
