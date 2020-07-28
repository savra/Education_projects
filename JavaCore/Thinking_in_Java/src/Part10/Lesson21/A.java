package Part10.Lesson21;

public class A {
    U functionA1(int ind) {
        return new U() {

            int v = ind;

            @Override
            public void f1() {
                System.out.println(v);
            }

            @Override
            public void f2() {
                System.out.println("function 2");
            }

            @Override
            public void f3() {
                System.out.println("function 3");
            }
        };
    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        B b1 = new B(10);
        b1.functionB1(a1.functionA1(1));
        b1.functionB1(a2.functionA1(2));
        b1.functionB1(a3.functionA1(3));
        b1.functionB3();
        b1.functionB2(1);
        b1.functionB3();

    }
}

class B {
    private U[] arrayU;
    private int i = 0;

    B(int arrayCount) {
        arrayU = new U[arrayCount];
    }

    void functionB1(U u) {
        arrayU[i] = u;
        i++;
    }

    void functionB2(int index) {
        arrayU[index] = null;
    }

    void functionB3() {
        for (U item : arrayU) {
            if (item != null) {
                item.f1();
                item.f2();
                item.f3();
            }
        }
    }
}