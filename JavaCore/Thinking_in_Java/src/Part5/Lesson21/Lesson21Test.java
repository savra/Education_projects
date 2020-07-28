package Part5.Lesson21;

public class Lesson21Test {
    public static void main(String[] args)
    {
        for(Colors item : Colors.values())
        {
            switch (item)
            {
                case RED: System.out.println("it " + item + " color"); break;
                case BLUE: System.out.println("it " + item + " color"); break;
                case GREEN: System.out.println("it " + item + " color"); break;
                case ORANGE: System.out.println("it " + item + " color"); break;
                case YELLOW: System.out.println("it " + item + " color"); break;
                case PURPULE: System.out.println("it " + item + " color"); break;
            }
        }
    }
}
