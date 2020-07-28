package Part13.Lesson6;

public class A {
    private int intValue = 100;
    private double doubleValue = 3243.34;
    private long longValue = 13443;
    private float floatValue = 22.1f;

    @Override
    public String toString() {
        return String.format("Integer value %d, Double value %5.2f, Long  value %d, Float value %f", intValue, doubleValue, longValue, floatValue);
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
    }
}
