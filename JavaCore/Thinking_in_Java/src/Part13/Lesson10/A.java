package Part13.Lesson10;

import java.util.regex.*;
public class A {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^Java");
        Matcher m = p.matcher("Java now has regular expressions");
        System.out.println(m.find());

        p = Pattern.compile("n.w\\s+h(a|i)s");
        m = p.matcher("Java now has regular expressions");
        System.out.println(m.find());

        p = Pattern.compile("s?");
        m = p.matcher("Java now has regular expressions");
        System.out.println(m.find());
        p = Pattern.compile("s*");
        m = p.matcher("Java now has regular expressions");
        System.out.println(m.find());
        p = Pattern.compile("s+");
        m = p.matcher("Java now has regular expressions");
        System.out.println(m.find());
        p = Pattern.compile("S{4}");
        m = p.matcher("Java now has regular expressions");
        System.out.println(m.find());
        p = Pattern.compile("S{1}.");
        m = p.matcher("Java now has regular expressions");
        System.out.println(m.find());
        p = Pattern.compile("S{0,3}");
        m = p.matcher("Java now has regular expressions");
        System.out.println(m.find());

        p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        m = p.matcher("Arline ate eight apples and one orange while Anita hadn't any");
        System.out.println(m.matches());


    }
}
