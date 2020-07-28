package Part5.Lesson10;

public class Lesson10Test {
    public static void main(String[] args) {
        TestFinalize tf = new TestFinalize();

        //tf.checkIn();

        tf = null;
        System.gc();
/*
        new TestFinalize();
        System.gc();*/
    }
}
