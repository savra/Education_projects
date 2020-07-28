package Part17.Lesson8;

public class SListIterator<T> {
    Link<T> current;

    public SListIterator(Link<T> value) {
        current = value;
    }

    public void insert(T value) {
        if (current == null) {
            current = new Link<>(value);
        } else {
            current.next = new Link<>(value);
            current = current.next;
        }
    }

    public boolean hasNext() {
        return current != null;
    }

    public Link<T> next() {
        current = current.next;
        return current;
    }

    public void remove() {
        if (current.next != null) {
            current.next = current.next.next;
        }
    }
}
