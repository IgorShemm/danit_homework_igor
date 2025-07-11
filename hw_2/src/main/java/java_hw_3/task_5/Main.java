package java_hw_3.task_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = inputScanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = inputScanner.nextInt();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = inputScanner.next().charAt(0);

        int calculationResult = (operator == '+') ? (firstNumber + secondNumber) :
                (operator == '-') ? (firstNumber - secondNumber) :
                        (operator == '*') ? (firstNumber * secondNumber) :
                                (operator == '/') ? (secondNumber != 0 ? firstNumber / secondNumber : 0) :
                                        (operator == '%') ? (secondNumber != 0 ? firstNumber % secondNumber : 0) :
                                                0;

        System.out.println("Result: " + calculationResult);
    }
}
