package hw_5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String playerName = scanner.nextLine();

        NumbersApplication game = new NumbersApplication(playerName);
        game.startGame(scanner);
    }
}