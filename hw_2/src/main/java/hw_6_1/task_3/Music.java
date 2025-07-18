package hw_6_1.task_3;

public class Music extends Media {
    private String artist;

    public Music(String title, int duration, String artist) {
        super(title, duration);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing music " + artist + ": " + title);
    }
}
