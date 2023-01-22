package classes.video;

import classes.video.Video;

public class Tvseries extends Video {

    private int seasons;


    public Tvseries(String title, String genre, int year, int seasons) {
        super(title, genre, year);
        this.seasons = seasons;
    }

    public void play() {
        System.out.println("reproducing cool stuff!");

    }

    public void numberOfSeasons(String title){

        System.out.println("The number of seasons is " + getSeasons());
    }



    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

}
