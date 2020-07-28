package Part12.Lesson21;

public class A {
    A() throws SomeException {
        throw new SomeException();
    }
}

class B extends A {
    B() throws SomeException {
        super();
    }
}

class TestLesson21 {
    public static void main(String[] args) {
        try {
            B b = new B();
        } catch (SomeException e) {
            System.out.println("SomeException caught in main()");
        }
    }
}


class SomeException extends Exception {

}