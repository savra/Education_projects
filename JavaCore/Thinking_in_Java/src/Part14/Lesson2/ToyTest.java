package Part14.Lesson2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

interface NewToys {

}

class Toy {
    int someValue;

    public Toy() {
    }

    public Toy(int i) {
        someValue = i;
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, NewToys {
    FancyToy(int i) {
        super(i);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Имя класса: " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        System.out.println("Простое имя: " + cc.getSimpleName());
        System.out.println("Каноническое имя : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        try {
            Class<?> cc = Class.forName("Part14.Lesson2.Toy");
            Constructor<?>[] j = cc.getConstructors();
            try {
                Constructor<?> constructor = cc.getConstructor(int.class);
                Toy t = (Toy) constructor.newInstance(5);
                System.out.println(t.someValue);
            } catch (NoSuchMethodException e) {
                System.out.println("Метод отсутствует");
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class " + e.getMessage() + " not found");
        }
        System.exit(0);
        Class c = null;
        try {
            c = Class.forName("Part14.Lesson2.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("He удается найти FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("He удалось создать экземпляр");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Откзано в доступе");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
