package Part7.Lesson18;

public class A {
    static final int g = 7;
    final int b;

    final int[] ff;

    A()
    {
        b = 5;
        ff = new int[5];
    }


    public static void main(String[] args){
        A ff = new A();
        ff.ff[0] = 6;
        System.out.println(ff.b);
    }
}
