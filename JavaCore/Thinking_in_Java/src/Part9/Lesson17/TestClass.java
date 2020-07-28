package Part9.Lesson17;

public class TestClass {
    public static void main(String ... args) {
        Test2.drawCycle(new BicycleFactory());
        Test2.drawCycle(new TricycleFactory());
        Test2.drawCycle(new UnicycleFactory());
    }
}

class Test2 {
    public static void drawCycle(CycleFactory factory) {
        Cycle cc = factory.getCycle();
        cc.print();
    }
}

class BicycleImpl implements Cycle {
    public void print() {
        System.out.println("I am BicycleImpl");
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new BicycleImpl();
    }
}

class TricycleImpl implements Cycle {
    public void print() {
        System.out.println("I am TricycleImpl");
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new TricycleImpl();
    }
}

class UnicycleImpl implements Cycle {
    @Override
    public void print() {
        System.out.println("I am UnicycleImpl");
    }
}

class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new UnicycleImpl();
    }
}