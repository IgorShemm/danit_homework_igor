package hw_6_1.task_3;

public class Video extends Media {
    private String resolution;

    public Video(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    @Override
    public void play() {
        System.out.println("Playing video " + title + " in resolution " + resolution);
    }
}