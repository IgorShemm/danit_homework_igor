package hw_4.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        StringBuilder completeSentence = new StringBuilder();

        System.out.println("Please enter words one by one (type STOP to finish):");

        while (true) {
            String enteredWord = userInputScanner.nextLine().trim();

            if (enteredWord.equalsIgnoreCase("STOP")) {
                break;
            }

            // Add space if sentence already contains words
            if (completeSentence.length() > 0) {
                completeSentence.append(" ");
            }

            completeSentence.append(enteredWord);
        }

        // Display the final sentence
        System.out.println("Resulting sentence:");
        System.out.println(completeSentence.toString());
    }
}