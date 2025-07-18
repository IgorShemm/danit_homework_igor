package hw_6_2.task_2;

public class Main {
    public static void main(String[] args) {
        String sampleText = "  Hello.World.  ";

        TextProcessor upper = new UpperCaseProcessor();
        TextProcessor reverse = new ReverseProcessor();
        TextProcessor trim = new TrimProcessor();

        System.out.println("=== UpperCaseProcessor ===");
        System.out.println("Processed: " + upper.process(sampleText));
        System.out.println("Without dots: " + upper.removeDigits(sampleText));

        System.out.println("\n=== ReverseProcessor ===");
        System.out.println("Processed: " + reverse.process(sampleText));
        System.out.println("Without dots: " + reverse.removeDigits(sampleText));

        System.out.println("\n=== TrimProcessor ===");
        System.out.println("Processed: " + trim.process(sampleText));
        System.out.println("Without dots: " + trim.removeDigits(sampleText));
    }
}
