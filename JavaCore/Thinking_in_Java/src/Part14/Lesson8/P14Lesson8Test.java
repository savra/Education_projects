package Part14.Lesson8;

import java.lang.reflect.Field;

interface I {
    void f();
}

class A implements I {
    int aValue;
    String aValue2;
    double aValue3;
    @Override
    public void f() {
    }
}

class B extends A {
    int bValue;
    String bValue2;
    double bValue3;
}

class C extends B {
    int cValue;
    String cValue2;
    double cValue3;
    float cValue4;
}

public class P14Lesson8Test {
    public static void g(Class o) {
        if (o.getSuperclass() != null) {
            try {
                System.out.println(o.newInstance().getClass().getSimpleName() + " is subclass of " + o.newInstance().getClass().getSuperclass().getSimpleName());
                for (Field item : o.newInstance().getClass().getDeclaredFields())
                    System.out.println(item);
            } catch (InstantiationException e) {
                System.out.println("Ошибка создания экземпляра");
            } catch (IllegalAccessException e) {
                System.out.println("Ошибка доступа");
            }
            g(o.getSuperclass());
        }
    }

    public static void main(String[] args) {
        P14Lesson8Test.g(C.class);
        //   System.out.println(P14Lesson8Test.g(new A().getClass()));
    }
}
