package Part12.Lesson25;

public class AException extends Exception {
}

class BException extends AException {

}

class CException extends BException {

}


class A {
    void f() throws AException {
        throw new AException();
    }
}

class B extends A {
    @Override
    void f() throws BException {
        throw new BException();
    }
}

class C extends B {
    @Override
    void f() throws CException {
        throw new CException();
    }

    public static void main(String[] args) {
        A c = new C();
        try {
            c.f();
        } catch (AException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}

