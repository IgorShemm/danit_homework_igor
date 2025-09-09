package hw_6_1.task_3;

public class Media {
    protected String title;
    protected int duration; // duration in minutes

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing media");
    }
}
