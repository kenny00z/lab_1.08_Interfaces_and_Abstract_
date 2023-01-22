package classes.video;

public abstract class Video {


    private String title;

    private String genre;

    private int year;



    Tvseries gameOfThrones = new Tvseries("Game Of Thrones ", "Fantasy", 2011, 8);

    Movie interestellar = new Movie("Interestellar ", "sci-fi", 2013,210,"Pepe");





    public Video(String title, String genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;

    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
