package coding_exercises.coding_exercise_34;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.real = realPart;
        this.imaginary = imaginaryPart;
    }

    public void add (double real, double imaginary) {
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add (ComplexNumber other) {
        add(other.real, other.imaginary);
    }

    public void subtract (double real, double imaginary) {
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract (ComplexNumber other) {
        subtract(other.real, other.imaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
