package lava_hw_10.task_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatter {
    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);
        return dateTime.format(formatter);
    }

    public static void main(String[] args) {
        LocalDateTime inputDate = LocalDateTime.of(2025, 1, 1, 0, 0);
        System.out.println("Input date: " + inputDate);
        System.out.println("Formatted output: " +
                formatDateTime(inputDate, "EEEE, MMMM dd, yyyy HH:mm"));
    }
}