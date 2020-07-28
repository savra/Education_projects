package Part17.Lesson8;

public class SList<T> {
    private Link<T> head = null;

    public SListIterator<T> iterator() {
        return new SListIterator<T>(head);
    }

    @Override
    public String toString() {
        return "";
    }
}
