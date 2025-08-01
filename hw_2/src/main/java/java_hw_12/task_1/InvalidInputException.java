package java_hw_12.task_1;

public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "InvalidInputException: " + getMessage();
    }
}
