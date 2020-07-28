package Part14.Lesson19;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ReflectionTest {
    public static void main(String[] args) {
        try {
            if (args.length != 0) {
                Class<?> c = Class.forName(args[0]);
                Constructor<?>[] constructors = c.getConstructors();
                Method[] methods = c.getMethods();
                Field[] fields = c.getDeclaredFields();
                Class<?>[] interfaces = c.getInterfaces();
                Annotation[] annotations = c.getDeclaredAnnotations();

                Pattern pattern = Pattern.compile("\\w+\\.");

                System.out.println("Класс " + c.getSimpleName() + " содержит следующие конструкторы: ");
                for (Constructor<?> constructor : constructors)
                    System.out.println(pattern.matcher(constructor.toString()).replaceAll(""));
                System.out.println("\nМетоды: ");
                for(Method method : methods)
                    System.out.println(pattern.matcher(method.toString()).replaceAll(""));
                System.out.println("\nПоля: ");
                for(Field field : fields)
                    System.out.println(pattern.matcher(field.toString()).replaceAll(""));
                System.out.println("\nРеализация интерфейсов: ");
                for(Class<?> impl : interfaces)
                    System.out.println(pattern.matcher(impl.toString()).replaceAll(""));

                for(Annotation annotation : annotations)
                    System.out.println(pattern.matcher(annotation.toString()).replaceAll(""));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Ошибка создания класса " + e.getMessage());
        }
    }
}
