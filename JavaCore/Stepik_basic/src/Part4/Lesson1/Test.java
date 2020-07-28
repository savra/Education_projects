package Part4.Lesson1;

public class Test {
    public static double sqrt(double x) throws IllegalArgumentException {
        if (x < 0) throw new IllegalArgumentException("Expected non-negative number, got " + x);
        else
            return Math.sqrt(x); // your implementation here
    }

    public static void main(String[] args) {

    }
}
