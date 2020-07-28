package Part11.Lesson13;

import java.util.*;

public class Controller {
    private List<Event> eventList = new LinkedList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        List<Event> tmpList = new LinkedList<>(eventList);
        ListIterator<Event> iterator = tmpList.listIterator();
        while(iterator.hasNext()) {
            Event e = iterator.next();
            if (e.ready()) {
                System.out.println(e);
                e.action();
                eventList.remove(e);
            }
        }

        /*while (eventList.size() > 0) {
            for (Event e : new LinkedList<Event>(eventList))
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
        }*/
    }
}
