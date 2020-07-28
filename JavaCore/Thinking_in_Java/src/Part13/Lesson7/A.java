package Part13.Lesson7;

import java.util.Arrays;

public class A {

    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";


    public static boolean f(String str)
    {
        return str.matches("^([А-Я]|[A-Z]){1}([A-Яа-я]|[A-Za-z])*?\\.$");
    }

    public static void g(String str) {
        System.out.println(Arrays.toString(str.split("the")));
    }

    public static void main(String[] args) {
        System.out.println(A.f("Djhjhjd."));
        A.g(A.knights);
        System.out.println(A.knights);
        System.out.println(A.knights.replaceAll("([eyuioa])", "_"));
    }
}
