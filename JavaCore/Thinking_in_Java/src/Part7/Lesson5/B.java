package Part7.Lesson5;

public class B {
    B(int a)
    {
        System.out.println("B constructor");
    }
}

class C extends A{
    B someField = new B(5);
    C()
    {
        super(6);
        System.out.println("C constructor");
    }

    public static void main(String[] args)
    {
        C instanceC = new C();
    }
}
