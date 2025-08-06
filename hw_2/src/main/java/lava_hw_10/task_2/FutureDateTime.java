package lava_hw_10.task_2;

import java.time.LocalDateTime;

public class FutureDateTime {
    public static LocalDateTime calculate(LocalDateTime dateTime, int days, int hours) {
        return dateTime.plusDays(days).plusHours(hours);
    }

    public static void main(String[] args) {
        LocalDateTime original = LocalDateTime.of(2023, 10, 25, 14, 30);
        LocalDateTime result = calculate(original, 3, 5);
        System.out.println(original);
        System.out.println(result);
    }
}
