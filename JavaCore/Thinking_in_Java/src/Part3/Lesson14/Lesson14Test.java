package Part3.Lesson14;

public class Lesson14Test {

    private static void compareStrings(String str1, String str2)
    {
        System.out.println(str1 == str2);
        System.out.println(str1 != str2);
        System.out.println(str1.equals(str2));
    }

    public static void main(String[] args)
    {
        compareStrings("a", "a");
        System.out.println("");
        compareStrings(new String("a"), new String("a"));
    }
}
