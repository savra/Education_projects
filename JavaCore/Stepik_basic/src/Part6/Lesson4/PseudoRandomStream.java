package Part6.Lesson4;

import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class PseudoRandomStream {

    /*Выделение разрядов, если считать слева*/
    public static int bitAllocation(int sourceInt, int position) {
        if (position <= 0 || sourceInt <= 0) return 0;

        int digitCount = (int) Math.log10(sourceInt) + 1;

        if (digitCount < position) return 0;

        int pow = (int) Math.pow(10, digitCount - position);

        return (sourceInt / pow) % 10;
    }

    public static IntStream pseudoRandomStream(int seed) {
        if (seed < 0)
            return null;
        return IntStream.iterate(seed, x -> x * x / 10 % 1000);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 13; i++) {
            IntStream intStream = pseudoRandomStream(i);
            intStream.mapToObj(x -> x + " ").limit(15).forEach(System.out::print);
            System.out.println();
        }
    }
}
