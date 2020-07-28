package Part13.Lesson3;

import java.io.PrintStream;
import java.util.Formatter;

interface I {
    void f();
}

public class Turtle implements I {
    private String name;
    private Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    /*
    * Тестовая аннотация
    * */
    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }

    @Override
    public void f() {
        System.out.println("Реализация метода f");
    }

    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Turtle tommy = new Turtle("Tommy",
                new Formatter(outAlias));
        Turtle terry = new Turtle("Terry",
                new Formatter(outAlias));
        tommy.move(0, 0);
        terry.move(4, 8);
        tommy.move(3, 4);
        terry.move(2, 5);
        tommy.move(3, 3);
        terry.move(3, 3);
    }
}
