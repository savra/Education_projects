package Part4.Lesson1;

class MyException extends RuntimeException {

    MyException(String message) {
        super(message);
    }


}

public class Test2 {
    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    private static void anotherMethod2() {
        anotherMethod();
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Throwable().getStackTrace();
        if (stackTraceElements.length <= 2) return null;
        else
            return stackTraceElements[2].getClassName() + "#" + stackTraceElements[2].getMethodName();
    }

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
        anotherMethod2();
    }
}
