package Part17.Lesson8;

public class Link<T> {
    public T value;
    public Link<T> next;

    public Link(T value, Link<T> next) {
        this.value = value;
        this.next = next;
    }

    public Link(T value) {
        this(value, null);
    }
}
