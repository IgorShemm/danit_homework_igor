package hw_6_1.task_3;

public class Main {
    public static void main(String[] args) {
        Media music = new Music("Never Gonna Give You Up", 4, "Rick Astley");
        Media video = new Video("Big Buck Bunny", 10, "1920x1080");

        System.out.println("=== Music ===");
        music.play();

        System.out.println("\n=== Video ===");
        video.play();
    }
}