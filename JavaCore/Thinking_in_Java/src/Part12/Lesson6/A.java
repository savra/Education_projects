package Part12.Lesson6;

import sun.rmi.runtime.Log;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class A extends Exception {
    private static Logger logger = Logger.getLogger("A");
    A() {
        StringWriter sw = new StringWriter();
        printStackTrace(new PrintWriter(sw));
        logger.severe(sw.toString());
    }
}

class B extends Exception {
    private static Logger logger =  Logger.getLogger("B");
    B() {
        StringWriter sw = new StringWriter();
        printStackTrace(new PrintWriter(sw));
        logger.severe(sw.toString());
    }
}


class C {
    public static void f() throws A, B {
        throw new A();
    }

    public static void g() throws B {
        throw new B();
    }
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception a) { }

        try {
            g();
        } catch (Exception b) {}
    }
}
