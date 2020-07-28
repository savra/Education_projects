package Part7.Lesson13;

public class A {
    void f(int a) {
        System.out.println("f(int)");
    }

    void f(double b){
        System.out.println("f(double)");
    }

    void f(String c){
        System.out.println("f(string)");
    }
}

class B extends A{

    void f(String d) {
        System.out.println("f(char)");
    }

    public static void main(String[] args) {
        B ff = new B();
        ff.f('a');
        ff.f(5);
        ff.f(1.2);
        ff.f("s");

        A gg = new B();

        gg.f("j");
    }
}
