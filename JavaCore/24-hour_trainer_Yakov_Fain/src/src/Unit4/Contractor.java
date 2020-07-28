package Unit4;

import Unit3.com.practicaljava.lesson6.Payable;

public class Contractor implements Payable {
    private String name;

    public Contractor(String name){
        this.name=name;
    }

    @Override
    public boolean increasePay(int percent) {
        if (percent < Payable.INCREASE_CAP) {
            System.out.println("Increasing hourly rate by " +
                    percent + "%. ");
            return true;
        } else {
            System.out.println(
                    "Sorry,can't increase hourly rate by more than " + Payable.INCREASE_CAP + "%: " + name);
            return false;
        }
    }


}
