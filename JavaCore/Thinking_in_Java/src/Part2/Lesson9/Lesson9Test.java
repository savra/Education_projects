package Part2.Lesson9;

public class Lesson9Test {
    public static void main(String[] args)
    {
        char c = 'x';
        Character ch = new Character(c);
        Character ch2 = new Character('x');

        Character ch3 = 'x';

        char c2 = ch3;

        Character a = 'a';
        Character b = 'a';
        System.out.println(a == b);

        Number aa = 127;
        Number bb = 127;
        System.out.println(aa == bb);

        aa = 128;
        bb = 128;
        System.out.println(aa == bb);

        aa = -128;
        bb = -128;
        System.out.println(aa == bb);

        System.out.println(c);
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(c2);


        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }

}
