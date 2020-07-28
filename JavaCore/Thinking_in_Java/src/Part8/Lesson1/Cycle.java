package Part8.Lesson1;

public class Cycle {

    int countWheels;

    void ride() {
        wheels();
        System.out.println("Cycle");
    }

    int wheels()
    {
        return countWheels;
    }

    public static void main(String[] args) {
        Cycle[] arrayCycle = new Cycle[] {
                new Cycle(),
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };

       // arrayCycle[0].balance();
        ((Unicycle)arrayCycle[1]).balance();
        ((Bicycle)arrayCycle[2]).balance();
        //arrayCycle[3].balance();
    }
}

class Unicycle extends Cycle{

    int countWheels = 5;

    int wheels()
    {
        return countWheels;
    }

    void ride() {
        wheels();
        System.out.println(countWheels + " Unicycle");
    }

    void balance(){
        System.out.println("Unicycle balance");
    }
}

class Bicycle extends Cycle{

    int countWheels = 2;

    int wheels()
    {
        return countWheels;
    }

    void ride() {
        wheels();
        System.out.println(countWheels + " Bicycle");
    }

    void balance(){
        System.out.println("Bicycle balance");
    }
}

class Tricycle extends Cycle{

    int countWheels = 3;

    int wheels()
    {
        return countWheels;
    }

    void ride() {
        wheels();
        System.out.println(countWheels + " Tricycle");
    }
}
