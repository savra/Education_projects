package Unit2;

public class TestTax {
    public static void main(String[] args) {
        Tax tax1 = new Tax();
        Tax tax2 = new Tax();
        Tax tax3 = new NJTax();

        tax1.grossIncome = 1500;
        System.out.println("Tax for person1 is " + tax1.calcTax());
        System.out.println("Tax for person2 is " + tax2.calcTax());
        System.out.println("Tax for person3 is " + tax3.calcTax());

        tax1.convertToEuros();
    }
}
