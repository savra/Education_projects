package Unit3.com.practicaljava.lesson6;

public class Contractor extends Person implements Payable {
    @Override
    public boolean increasePay(int percent) {
        if(percent < Payable.INCREASE_CAP)
            System.out.println("Increasing salary by " + percent + "%. " + getName());
        else
            System.out.println("Нельзя увеличить ставку больше чем на 20% " + getName());
        return false;
    }

    Contractor(String name) {
        super(name);
    }
}
