package hw_4.task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Arrays containing names, hours, and places
        String[] personNames = {"Petya", "Masha", "Olena", "Fedya", "Sasha", "Anton", "Glib"};
        int[] timeSlots = {10, 12, 14, 16, 18, 20};
        String[] visitPlaces = {"school", "store", "church", "gym", "cinema", "clinic"};

        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Enter index for name (0–6):");
        int nameIndex = userInputScanner.nextInt();

        System.out.println("Enter index for time (0–5):");
        int timeIndex = userInputScanner.nextInt();

        System.out.println("Enter index for place (0–5):");
        int placeIndex = userInputScanner.nextInt();

        // Validate index ranges
        boolean isValid = nameIndex >= 0 && nameIndex < personNames.length
                && timeIndex >= 0 && timeIndex < timeSlots.length
                && placeIndex >= 0 && placeIndex < visitPlaces.length;

        if (!isValid) {
            System.out.println("Invalid input: one or more indexes are out of bounds.");
            return;
        }

        // Display final message
        String resultMessage = personNames[nameIndex] + " will go to the "
                + visitPlaces[placeIndex] + " at "
                + timeSlots[timeIndex] + ":00";

        System.out.println(resultMessage);
    }
}