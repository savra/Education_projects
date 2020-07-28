package Part5.Lesson17;

public class Lesson17Test {

    public static void main(String[] args) {
        TestString[] tsArray = new TestString[]
        {
                new TestString("1"),
                new TestString("2"),
                new TestString("3"),
                new TestString("4"),
                new TestString("5"),
                new TestString("6"),
        };

        for(TestString item : tsArray)
            item = new TestString("1");

        System.out.println(tsArray.length);

        for(int i = 0; i < tsArray.length; i++)
        {
            tsArray[i] = new TestString(Integer.toString(i));
        }

        for(TestString item : tsArray)
            System.out.println(item.st1);
    }
}
