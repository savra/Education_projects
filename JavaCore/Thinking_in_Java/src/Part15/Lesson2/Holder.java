package Part15.Lesson2;

public class Holder<T> {
    private T x, y, z;

    public Holder(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public T getZ() {
        return z;
    }

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public void setZ(T z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return x + " " + y + " " +  z;
    }

    public static void main(String ... args) {
        Holder<Integer> holder = new Holder<>(1, 2, 3);

        System.out.println(holder);
    }
}

