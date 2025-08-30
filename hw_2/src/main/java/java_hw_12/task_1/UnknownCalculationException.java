package java_hw_12.task_1;

public class UnknownCalculationException extends Exception {
    public UnknownCalculationException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "UnknownCalculationException: " + getMessage();
    }
}
