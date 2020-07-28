package Part15.Lesson3;

public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A а, B b) {
        first = а;
        second = b;
    }

    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
