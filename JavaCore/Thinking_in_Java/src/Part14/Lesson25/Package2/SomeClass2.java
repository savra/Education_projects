package Part14.Lesson25.Package2;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SomeClass2 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Part14.Lesson25.Package1.SomeClass1");
            Method[] methods = c.getDeclaredMethods();
            for (Method method : methods) {
                method.setAccessible(true);
                method.invoke(c.newInstance());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Ошибка создания класса");
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
