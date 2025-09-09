package hw_6_2.task_2;

public class UpperCaseProcessor implements TextProcessor {

    @Override
    public String process(String text) {
        return text.toUpperCase();
    }
}
