package hw_4.task_5;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomNumbersArray = new int[10];
        Random randomGenerator = new Random();

        // Fill array with random numbers from 1 to 100
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = randomGenerator.nextInt(100) + 1;
        }

        System.out.println("Generated numbers:");
        for (int number : randomNumbersArray) {
            System.out.print(number + " ");
        }
        System.out.println(); // line break

        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Please enter a number to search:");

        int userEnteredNumber = userInputScanner.nextInt();
        boolean isFound = false;

        // Check if the number is in the array
        for (int number : randomNumbersArray) {
            if (number == userEnteredNumber) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("The entered number is in the array.");
        } else {
            System.out.println("The entered number is not in the array.");
        }
    }
}
