package lava_hw_10.task_5;

import java.time.LocalDateTime;
import java.time.Duration;

public class DateDifferenceCalculator {
    public static String calculateDifference(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);

        long totalMinutes = duration.toMinutes();
        long days = totalMinutes / (24 * 60);
        long hours = (totalMinutes % (24 * 60)) / 60;
        long minutes = totalMinutes % 60;

        return "Difference: " + days + " days, " + hours + " hours, " + minutes + " minutes";
    }

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2023, 10, 25, 14, 30);
        LocalDateTime end = LocalDateTime.of(2023, 10, 28, 16, 45);

        System.out.println("Start date: " + start);
        System.out.println("End date: " + end);
        System.out.println(calculateDifference(start, end));
    }
}
