package Part4.Lesson3;

import java.util.logging.*;

public class ClassA {

}


class ClassB {
    private final static Logger LOGGER = Logger.getLogger(ClassB.class.getName());

    public ClassB() {
        LOGGER.setLevel(Level.WARNING);
    }
}


class ClassC {

    private static void configureLogging() {
        Logger loggerC = Logger.getLogger("org.stepic.java");
        loggerC.setLevel(Level.ALL);

        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerA.setLevel(Level.ALL);
        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerB.setLevel(Level.WARNING);



        Handler handlerClassC = new ConsoleHandler();
        handlerClassC.setLevel(Level.ALL);
        handlerClassC.setFormatter(new XMLFormatter());
        loggerC.addHandler(handlerClassC);
        loggerC.setUseParentHandlers(false);
    }

    public static void main(String[] args) {
    }
}