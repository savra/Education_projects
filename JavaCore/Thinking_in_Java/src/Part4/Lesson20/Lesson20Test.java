package Part4.Lesson20;

public class Lesson20Test {
    static int test(int testval, int begin, int end)
    {
        if(testval >= begin && testval <= end)
            return 1;
        else
            return -1;
    }

    public static void main(String[] args)
    {
        System.out.println(test(10, 5, 10));
        System.out.println(test(5, 10, 20));
        System.out.println(test(5, 5, 5));
    }
}
