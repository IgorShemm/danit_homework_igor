package hw_6_2.task_2;

public class ReverseProcessor implements TextProcessor {

    @Override
    public String process(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
