package java_hw_12.task_1;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "DivisionByZeroException: " + getMessage();
    }
}
