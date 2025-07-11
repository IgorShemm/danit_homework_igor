package hw_2.task_3;

public class Main {
    public static void main(String[] args) {
        // Initial string
        String text = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";

        // Count lowercase 'a'
        int lowerCount = text.split("a").length - 1;

        // Count uppercase 'A'
        int upperCount = text.split("A").length - 1;

        // Output the results
        System.out.println("Number of lowercase 'a': " + lowerCount);
        System.out.println("Number of uppercase 'A': " + upperCount);
        System.out.println("Total number of 'a' characters (case-insensitive): " + (lowerCount + upperCount));
    }
}