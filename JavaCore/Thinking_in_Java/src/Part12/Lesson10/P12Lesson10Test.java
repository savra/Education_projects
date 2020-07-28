package Part12.Lesson10;

public class P12Lesson10Test {
    void f() throws BException {
        try {
            g();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new BException();
        }
    }

    void g() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        P12Lesson10Test t = new P12Lesson10Test();
        try {
            t.f();
        } catch (BException e) {
            System.out.println(e.getMessage());
        }

    }
}


class AException extends Exception {
    AException() {

    }

    @Override
    public String getMessage() {
        return "AException";
    }
}

class BException extends Exception {
    BException() {

    }

    @Override
    public String getMessage() {
        return "BException";
    }
}