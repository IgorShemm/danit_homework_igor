package java_hw_11.task_1;

public class MyFile implements CanBeClosed {
    @Override
    public void close() {
        System.out.println("File closed");
    }
}
