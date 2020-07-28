package Part5.Lesson9;

public class ConstructorOverload {
    ConstructorOverload()
    {
        System.out.println("default constructor");
    }

    ConstructorOverload(int n)
    {
        this();
        System.out.println("constructor with 1 arg");
    }


    ConstructorOverload(int n1, int n2)
    {
        this(n1);
        System.out.println("constructor with 2 arg");
    }
}
