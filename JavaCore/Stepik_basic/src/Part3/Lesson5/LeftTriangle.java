package Part3.Lesson5;

import java.util.function.DoubleUnaryOperator;

public class LeftTriangle {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        final double h = 1e-6;
        double result = 0;

        while (a <= b) {
            result += h * f.applyAsDouble(a);
            a += h;
        }
        return result;
    }

    public static void main(String... args) {
        System.out.println(LeftTriangle.integrate(x -> 1, 0, 10));
    }
}
