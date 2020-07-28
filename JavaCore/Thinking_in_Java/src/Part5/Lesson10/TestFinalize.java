package Part5.Lesson10;

public class TestFinalize {

    private boolean empty;

    TestFinalize()
    {
        empty = true;
    }

    void checkIn()
    {
        empty = false;
    }

    public void finalize()
    {
        if(empty) {
            System.out.println("In finalize");
        }
    }
}
