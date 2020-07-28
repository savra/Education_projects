package Part15.Lesson31;

public class Hourly extends Employee implements Payable {
    @Override
    public float getPay() {
        return 2;
    }

    public static void main(String[] args) {
        Hourly hourly = new Hourly();
        System.out.println(hourly.getPay());
    }
}
