package hw_4.task_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numberArray = new int[45];
        Random randomGenerator = new Random();

        // Fill array with random numbers from -50 to +50
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = randomGenerator.nextInt(101) - 50;
        }

        int minimumValue = numberArray[0];
        int maximumValue = numberArray[0];

        // Find min and max values
        for (int number : numberArray) {
            if (number < minimumValue) {
                minimumValue = number;
            }
            if (number > maximumValue) {
                maximumValue = number;
            }
        }

        // Display results
        System.out.println("Minimum value in the array: " + minimumValue);
        System.out.println("Maximum value in the array: " + maximumValue);
    }
}