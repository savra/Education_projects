package Part12.Lesson2;

public class A {
    void f() {}
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            for(int i = 0; i < 6; i++)
                System.out.println(a[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println(e.getMessage());
        }
    }
}
