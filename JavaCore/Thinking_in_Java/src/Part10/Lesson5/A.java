package Part10.Lesson5;

public class A {
    A() {
        System.out.println("Outer class " + getClass().getSimpleName() + " created");
    }


    class InnerA {
        InnerA() {
            System.out.println("Inner class " + getClass().getSimpleName() + " created");
        }
    }
}

class B {
    public static void main(String ... args) {
        A a = new A();
        A.InnerA ai = a.new InnerA();
    }
}
