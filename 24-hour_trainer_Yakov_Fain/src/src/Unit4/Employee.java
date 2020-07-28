package Unit4;


import Unit3.com.practicaljava.lesson6.Payable;

public class Employee implements Payable {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public boolean increasePay(int percent) {
        System.out.println("Increasing salary by " + percent + "%: " + name);
        return true;
    }
}
