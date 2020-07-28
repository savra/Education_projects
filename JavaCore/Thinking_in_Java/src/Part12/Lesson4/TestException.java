package Part12.Lesson4;

public class TestException extends RuntimeException {
    private String message;
    public TestException(String str) {
        message = str;
    }

    public void f() {
        System.out.println(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
       /* try {*/
            throw new TestException("VERY IMPORTANT MESSAGE");
       /* }catch (TestException e) {
            e.f();
            System.out.println(e.getMessage());
        }*/
    }
}
