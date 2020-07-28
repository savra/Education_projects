package Part14.Lesson21;

public class SimpleProxy implements Interface {
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}

class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        consumer(new RealObject());
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения 1го метода: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        consumer(new SimpleProxy(new RealObject()));
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения 2го метода: " + (endTime - startTime) + " ms");
    }
}
