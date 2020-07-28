package Part15.Lesson20;

import Part15.Lesson20.I;
import Part15.Lesson20.A;


class C {}

public class B {
    static <T extends I> void f(T a) {
        a.f2();
        a.f3();
        System.out.println("Method f in class B");
    }

    public static void main(String[] args) {
        A a = new A(5);
        I i = new A(7);
        C c;
        try {
            Class<?> clazz = Class.forName("Part15.Lesson20.C");
            c = (C)clazz.newInstance();
          //  B.f((I)c);
        }catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println("Ошибка создания объекта");
        }

        B.f(a);
        System.out.println("------------");
        B.f(i);

    }
}
