package Part4.Lesson18;

public class Lesson18Test {

    public static void main(String[] args)
    {
        int maxSize = 1000;
        boolean isSimple;

        for(int i = 2; i < maxSize; i++)
        {
            isSimple = true;
            for(int j = 1; j < maxSize; j++)
            {
                if(j == 1 || j == i)
                    continue;
                if(i % j == 0)
                {
                    isSimple = false;
                    break;
                }
            }

            if (isSimple)
                System.out.println(i + " простое число");
        }
    }
}
