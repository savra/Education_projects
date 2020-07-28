package Part9.Lesson11;

public class TestClassP9 implements Processor {

    public String name() {
        return "I am TestClassP9";
    }

    public String process(Object input) {
        return f((String) input);
    }

    String f(String str) {
        char[] charArray = str.toCharArray();
        for (int j = 1; j < charArray.length; j += 2) {
            char tmp = charArray[j - 1];
            charArray[j - 1] = charArray[j];
            charArray[j] = tmp;
        }

        return new String(charArray);
    }

    public static void main(String... args) {
        TestClassP9 t9 = new TestClassP9();
        System.out.println(t9.f("Serge"));
        System.out.println(t9.name());
        System.out.println(t9.process("Sergeyfgdes"));
    }


}
