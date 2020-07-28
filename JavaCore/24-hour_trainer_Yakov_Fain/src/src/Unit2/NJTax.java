package Unit2;

public class NJTax extends Tax {
    @Override
    public double calcTax() {
        if (grossIncome >= 0 && grossIncome <= 500) {
            System.out.println("OVERRIDE BASE CLASS METHOD");
            return 500;
        }
        else {
            System.out.println("OVERRIDE BASE CLASS METHOD");
            return 1000;
        }
    }
}
