package Part15.Lesson7;

class Base{
    public static void  kmToMiles(int km){
        System.out.println("Base class");
    }
}

class Derive extends Base{
    public static void  kmToMiles(int km){
        System.out.println("Derive class");
    }
}

public class Fibonacci implements Generator<Integer> {
    private int count = 0;

    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Base b = new Derive(); // run-time тип - Derive, compile-time тип - Base
        b.kmToMiles(10); // "Base class"

        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 18; i++)
            System.out.print(gen.next() + " ");
    }
}