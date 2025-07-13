package hw_4.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Please enter a number to check for palindrome:");

        String enteredNumber = userInputScanner.nextLine().trim();
        String reversedNumber = new StringBuilder(enteredNumber).reverse().toString();

        if (enteredNumber.equals(reversedNumber)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}