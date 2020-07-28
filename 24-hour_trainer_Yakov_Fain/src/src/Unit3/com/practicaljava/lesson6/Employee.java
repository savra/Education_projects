package Unit3.com.practicaljava.lesson6;

public class Employee extends Person implements Payable {
    @Override
    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%. "+ getName());
        return true;
    }

    Employee(String name) {
        super(name);
    }
}
