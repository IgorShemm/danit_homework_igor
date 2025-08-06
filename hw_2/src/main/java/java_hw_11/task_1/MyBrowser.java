package java_hw_11.task_1;

public class MyBrowser implements CanBeClosed {
    @Override
    public void close() {
        System.out.println("Browser closed");
    }
}