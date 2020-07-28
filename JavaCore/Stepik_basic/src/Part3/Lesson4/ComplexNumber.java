package Part3.Lesson4;

import java.util.Objects;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        else {
            if (obj instanceof ComplexNumber) {
                return this.re == ((ComplexNumber) obj).re && this.im == ((ComplexNumber) obj).im;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(re) + Double.hashCode(im);
    }


    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1, 1);
        System.out.println(a.equals(b));
    }
}
