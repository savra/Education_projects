package Part5.Lesson19;

public class Lesson19Test {

    static void func1(String... str) {
        for (String item : str)
            System.out.println(item);
    }

    static void func1(int n, String... str) {
        System.out.println(n);
        for (int i = 0; i < str.length; i++)
            System.out.println(str[i]);
    }

    public static void main(String[] args) {
        func1(new String("1"), "2", "3");
        func1(new String[]{"4", "5", "6"});
        func1(7);
        func1(8, new String("9"));
    }
}
