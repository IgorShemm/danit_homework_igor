package hw_2.task_2;

public class Main {
    public static void main(String[] args) {
        String text = "Testing, is my favourite job";

        // Remove comma and split into words
        String[] words = text.replace(",", "").split(" ");

        // Print each word and its length
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word" + (i + 1) + " = " + words[i] + ", Length of this word = " + words[i].length());
        }

        // Check if the first word is longer than all the others
        int firstLength = words[0].length();
        boolean isLongest = true;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() >= firstLength) {
                isLongest = false;
                break;
            }
        }

        System.out.println(isLongest);
    }
}