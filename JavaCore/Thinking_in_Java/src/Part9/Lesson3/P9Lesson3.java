package Part9.Lesson3;

public abstract class P9Lesson3 {

    P9Lesson3() {
        print();
    }

    abstract void print();

    public static void main(String[] args) {
        A f = new A();
        f.print();
    }
}

class A extends P9Lesson3 {
    int a = 5;

    @Override
    void print() {
        System.out.println(a);
    }
}
