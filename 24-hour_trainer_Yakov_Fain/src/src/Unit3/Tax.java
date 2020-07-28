package Unit3;

import java.io.IOException;

public class Tax {
    double grossIncome; // class member variables
    String state;
    int dependents;

    // First Constructor
    Tax(double grossIncome, String state, int dependents) {
        this.grossIncome = grossIncome; // instance variable initialization
        this.state = state;
        this.dependents = dependents;
    }

    // Second Constructor
    Tax(double grossIncome, int dependents) {
        this(grossIncome, "NY", dependents);
    }

    public double calcTax() {
        double stateTax;
        if (grossIncome < 30000) {
            int taxCredit = 300;
            stateTax = grossIncome * 0.05 - taxCredit;
        } else {
            stateTax = grossIncome * 0.06;

        }
        return stateTax;
    }
}


class TestTax {
    public static void main(String[] args) {
        double grossIncome; // local variables
        String state;
        int dependents;
        if(args.length != 0) {
            try {
                grossIncome = Double.parseDouble(args[0]);
                dependents = Integer.parseInt(args[1]);
                state = args[2];

                Tax t = new Tax(grossIncome, state, dependents);
                double yourTax = t.calcTax(); //calculating tax
                System.out.println("Your tax is " + yourTax);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
