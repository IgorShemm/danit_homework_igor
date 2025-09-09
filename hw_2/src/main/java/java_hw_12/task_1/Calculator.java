package java_hw_12.task_1;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Error: Division by zero is not allowed.");
        }
        return a / b;
    }

    @Override
    public String toString() {
        return "Simple Calculator";
    }
}
