package Part7.Lesson9;

public class Root {
    Component1 c1 = new Component1(1);
    Component2 c2 = new Component2(2);
    Component3 c3 = new Component3(3);

    Root(int a) {
        System.out.println("Constructor Root");
    }
}

class Component1 {
    Component1(int a) {
        System.out.println("Constructor Component1");
    }
}

class Component2 {
    Component2(int a) {
        System.out.println("Constructor Component2");
    }
}

class Component3 {
    Component3(int a) {
        System.out.println("Constructor Component3");
    }
}

class Stem extends Root {
    Component1 c1 = new Component1(7);
    Component2 c2 = new Component2(6);
    Component3 c3 = new Component3(5);

    Stem(int a)
    {
        super(a);
        System.out.println("Constructor Stem");
    }

    public static void main(String[] args)
    {
        Stem s = new Stem(7);
    }
}


