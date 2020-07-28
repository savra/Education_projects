package Part10.Lesson1;

public class Outer {
    class Inner {
        int fff;
        @Override
        public String toString() {
            return str;
        }
    }

    private String str;

    Outer(String str) {
        this.str = str;
    }

    Inner l_inner = new Inner();

    Inner f() {
        System.out.println("Create Inner");
        return new Inner();
    }

    public static void main(String[] args) {
        Inner a = new Outer("AAA").f();
        System.out.println(a);
        Outer outer = new Outer("BBB");
        Outer.Inner oi = outer.f();
        System.out.println(oi.toString());
    }
}
