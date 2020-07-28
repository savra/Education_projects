package Part15.Lesson9;

public class GenericMethods {
    public <T, E> void f(T x, E y, int z) {
        System.out.println(x.getClass().getName() + " " + y.getClass().getName() + " " + z);
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("", 1.0, 2);
        gm.f(true, 1, 0);
        gm.f(0, true, 1);
        gm.f(1.0F, true, 5);
        gm.f('c', "ss", 8);
        gm.f(gm, "l", 6);
    }
}
