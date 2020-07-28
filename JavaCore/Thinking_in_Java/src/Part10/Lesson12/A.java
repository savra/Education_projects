package Part10.Lesson12;

public class A {

    public int a;

    A(int b) {
        this.a = b;
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.f(7).a);
    }
}


class B {
    A f(final int b) {
        return new A(5) {
            {
                a = b;
            }
        };
    }
}
