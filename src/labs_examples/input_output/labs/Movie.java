package labs_examples.input_output.labs;

public class Movie {
    private String title;
    private String director;
    private int year;
    private int length;
    private double imdbRating;

    public Movie() {
    }

    public Movie(String title, String director, int year, int length, double imdbRating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.length = length;
        this.imdbRating = imdbRating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", length=" + length +
                ", imdbRating=" + imdbRating +
                '}';
    }
}
