package classes.video;

import classes.video.Video;

public class Movie extends Video {


    private int duration;

    private String author;

    public Movie(String title, String genre, int year, int duration, String author) {
        super(title, genre, year);
        this.duration = duration;
        this.author = author;
    }




    public void play (int duration){
        if (duration > 125){
             System.out.println("U're going to fall sleep :B");
        } else {
            System.out.println("Playing this masterpiece!");
        }
    }









    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
