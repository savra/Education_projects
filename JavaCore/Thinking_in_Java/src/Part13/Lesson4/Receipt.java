package Part13.Lesson4;

import java.util.Formatter;



public class Receipt {
    private double total = 0;
    private static final int FIRST_COLUMN = 15;
    private static final int SECOND_COLUMN = 5;
    private static final int THIRD_COLUMN = 10;

    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format("%-" + FIRST_COLUMN + "s %" + SECOND_COLUMN + "s %" + THIRD_COLUMN + "s\n", "Item", "Qty", "Price");
        f.format("%-" + FIRST_COLUMN + "s %" + SECOND_COLUMN + "s %" + THIRD_COLUMN + "s\n", "--- ", "---", "----- ");
    }

    public void print(String name, int qty, double price) {
        f.format("%-" + FIRST_COLUMN + "." + FIRST_COLUMN + "s %" + SECOND_COLUMN + "d %10.2f\n", name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format("%-" + FIRST_COLUMN + "s %" + SECOND_COLUMN + "s %10.2f\n", "Tax", "", total * 0.06);
        f.format("%-" + FIRST_COLUMN + "s %" + SECOND_COLUMN + "s %10s\n", "", "", "-----");
        f.format("%-" + FIRST_COLUMN + "s %" + SECOND_COLUMN + "s %10.2f\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("3ack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
