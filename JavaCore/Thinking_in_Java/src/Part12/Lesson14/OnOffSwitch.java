package Part12.Lesson14;

public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f()
            throws OnOffExceptionl, OnOffException2 {
    }

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
            throw new RuntimeException();
        } catch (OnOffExceptionl e) {
            System.out.println("OnOffExceptionl");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
