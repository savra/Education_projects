package Part12.Lesson9;

import com.sun.jmx.snmp.BerException;

public class AException extends Exception {

}

class BException extends Exception {

}

class CException extends Exception {

}

class TestException {
    static void f(int a) throws AException, BException, CException {
        if (a == 1)
            throw new AException();
        else if (a == 2)
            throw new BException();
        else if (a == 3)
            throw new CException();
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
            //f(1);
           // f(2);
           // f(3);

        }catch (Exception e) {
            System.out.println("Catched " + e.getClass().getSimpleName());
        }
        finally {
            System.out.println("FINALLY");
        }
    }
}
