package Part8.Lesson14;

public class ReferenceCounting {
    public static void main(String ... args) {
        Shared shared = new Shared();
        Composing[] composing = new Composing[] {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)
        };

        for(Composing item : composing) {
            item.dispose();
            //item = null;
        }

        //shared = null;
        //composing = null;

        System.gc();
    }
}
