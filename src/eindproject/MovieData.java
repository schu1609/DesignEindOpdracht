package eindproject;

/**
 * @author Brave
 */
public class MovieData {
    private String movieName;
    private int movieYear;
    private String movieOrigin;
    private double movieBudget;

    // Wij hebben hier het Design Pattern Constructor Chaining gebruikt, omdat: voor sommige films die nog uit moeten komen weten mensen niet alle data er over.
    public MovieData(String movieName, int movieYear, String movieOrigin, double movieBudget) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieOrigin = movieOrigin;
        this.movieBudget = movieBudget;
    }

    public MovieData(String movieName, int movieYear, String movieOrigin) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieBudget = -1;
        this.movieOrigin = movieOrigin;
    }

    public MovieData(String movieName, int movieYear, double movieBudget) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieBudget = movieBudget;
        this.movieOrigin = "Unknown";
    }

    public MovieData(String movieName, int movieYear) {
        this.movieName = movieName;
        this.movieYear = movieYear;
        this.movieBudget = -1;
        this.movieOrigin = "Unknown";
    }

    public String getName() {
        return movieName;
    }

    public int getYear() {
        return movieYear;
    }

    public String getOrigin() {
        return movieOrigin;
    }

    public double getBudget() {
        return movieBudget;
    }
}
