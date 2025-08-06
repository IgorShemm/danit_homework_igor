package java_hw_12.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            try {
                System.out.print("Enter first number: ");
                String input1 = scanner.nextLine();
                double num1 = parseInput(input1);

                System.out.print("Enter second number: ");
                String input2 = scanner.nextLine();
                double num2 = parseInput(input2);

                System.out.print("Choose operation (+, -, *, /) or type 'exit': ");
                String operation = scanner.nextLine();

                if (operation.equalsIgnoreCase("exit")) {
                    System.out.println("Calculator terminated.");
                    break;
                }

                double result;

                switch (operation) {
                    case "+":
                        result = calculator.add(num1, num2);
                        break;
                    case "-":
                        result = calculator.subtract(num1, num2);
                        break;
                    case "*":
                        result = calculator.multiply(num1, num2);
                        break;
                    case "/":
                        result = calculator.divide(num1, num2);
                        break;
                    default:
                        throw new UnknownCalculationException("Error: Unknown operation.");
                }

                System.out.println("Result: " + result);

            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            } catch (UnknownCalculationException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred.");
            }
        }

        scanner.close();
    }

    private static double parseInput(String input) throws InvalidInputException {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Error: Non-numeric input. Please try again.");
        }
    }
}