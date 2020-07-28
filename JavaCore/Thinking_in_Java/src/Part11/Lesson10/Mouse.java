package Part11.Lesson10;

public class Mouse extends Rodent {

    private int refCount = 0;

    public void addRef() {
        refCount++;
    }

    public void dispose() {
        if(--refCount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "I am Mouse";
    }

    @Override
    public void voice(){
        System.out.println("Mouse speaking");
    }
}
