package collections;

public class Movie {
    private final String title;
    private final String director;
    private final String genre;
    private final int rate;

    public Movie(String title, String director, String genre, int rate) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return " Title:  " + getTitle() + " Director: " + getDirector() + " Genre: " + getGenre() + " Rate: " + getRate();
    }

}


