package hw_5;

import java.util.Random;
import java.util.Scanner;

public class NumbersApplication {
    private String name;
    private int gameNumber;

    public NumbersApplication(String name) {
        this.name = name;
        this.gameNumber = new Random().nextInt(101); // [0, 100]
    }

    public void startGame(Scanner scanner) {
        System.out.println("Let the game begin!");

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < gameNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > gameNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }
}