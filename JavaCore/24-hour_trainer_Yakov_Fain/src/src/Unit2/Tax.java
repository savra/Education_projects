package Unit2;

public class Tax {
    double grossIncome;
    String state;
    int dependents;

    public Tax(double grossIncome, String state, int dependents) {
        this.grossIncome = grossIncome;
        this.state = state;
        this.dependents = dependents;
    }

    public Tax() {}

    public void convertToEuros() {
        System.out.println("Tax in euro = " + this.grossIncome / 1.25);
    }

    public double calcTax() {
        if (grossIncome >= 0 && grossIncome <= 500)
            return 500;
        else
            return 1000;
    }
}

