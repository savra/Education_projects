package Part7.Lesson12;

public class Root {
    Component1 c1 = new Component1(1);
    Component2 c2 = new Component2(2);
    Component3 c3 = new Component3(3);

    Root(int a) {
        System.out.println("Constructor Root");
    }

    void dispose(){
        c3.dispose();
        c2.dispose();
        c1.dispose();
        System.out.println("Dispose Root");
    }
}

class Component1 {
    Component1(int a) {
        System.out.println("Constructor Component1");
    }

    void dispose() {
        System.out.println("Dispose Component1");
    }
}

class Component2 {
    Component2(int a) {
        System.out.println("Constructor Component2");
    }

    void dispose() {
        System.out.println("Dispose Component2");
    }
}

class Component3 {
    Component3(int a) {
        System.out.println("Constructor Component3");
    }

    void dispose() {
        System.out.println("Dispose Component3");
    }
}

class Stem extends Root {
    Component1 c1 = new Component1(7);
    Component2 c2 = new Component2(6);
    Component3 c3 = new Component3(5);

    Stem(int a) {
        super(a);
        System.out.println("Constructor Stem");
    }

    public static void main(String[] args) {
        Stem s = new Stem(7);
        try{

        } finally {
            s.dispose();
        }
    }

    void dispose() {
        c3.dispose();
        c2.dispose();
        c1.dispose();

        super.dispose();
        System.out.println("Dispose Stem");
    }
}

