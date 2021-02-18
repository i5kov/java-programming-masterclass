package coding_exercises.coding_exercise_29;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getAdditionResult() {
        return this.getFirstNumber() + this.getSecondNumber();
    }

    public double getSubtractionResult() {
        return this.getFirstNumber() - this.getSecondNumber();
    }

    public double getMultiplicationResult() {
        return this.getFirstNumber() * this.getSecondNumber();
    }

    public double getDivisionResult() {
        if (this.getSecondNumber() == 0) {
            return 0;
        }
        return getFirstNumber() / getSecondNumber();
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}