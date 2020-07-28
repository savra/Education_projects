package Part11.Lesson27;

import java.util.*;

public class Command {
    private String str;

    public void operation() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        A a = new A();
        a.fillQueue(new Command(), new Command(), new Command());
    }
}

class A {
    Queue<Command> commandQueue;
    A() {
        commandQueue =  new LinkedList<>();
    }
    void fillQueue(Command ... c){
        commandQueue.addAll(Arrays.asList(c)) ;

        commandQueue.add(new Command());

        for (Command item : commandQueue)
            System.out.println(item.getClass().getSimpleName());
    }
}