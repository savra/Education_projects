package Part8.Lesson9;

public class Hamster extends Rodent {

    Mouse m;

    Hamster(Mouse m) {
        this.m = m;
        this.m.addRef();
    }

    Hamster(){}

    public void dispose()
    {
        System.out.println("Disposing " + this);
        m.dispose();
    }


    @Override
    public void voice(){
        System.out.println("Hamster speaking");
    }

    @Override
    public String toString() {
        return "I am Hamster";
    }
}
