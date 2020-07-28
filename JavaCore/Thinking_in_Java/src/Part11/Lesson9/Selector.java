package Part11.Lesson9;

import java.util.Iterator;
import java.util.ListIterator;

public interface Selector {
    boolean end();
    Object current(Iterator<Object> iterator);
    void next(Iterator<Object> iterator);
}

