package eindproject;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

public class Model extends Observable {
    /*private List<MovieData> movies = new ArrayList<>();*/

    // TEST DATA
    private List<MovieData> movies = new LinkedList<>(Arrays.asList(
            new MovieData("Norm Of The North", 2016, "North Pole", 1800000),
            new MovieData("Lazer Team", 2016, "America", 2400000),
            new MovieData("Fan4stic", 2015, "America", 1550000),
            new MovieData("Epic Movie", 2007, "America", 2000000),
            new MovieData("Léon", 1995, "France", 1600000),
            new MovieData("Tortilla Heaven", 2007, "Mexico", 1000000),
            new MovieData("Kameleon", 2003, "Netherlands", 7500000),
            new MovieData("Sinterklaas en het gouden hoefijzer", 2017, "Netherlands", 96882)
    ));

    public void add(MovieData movie) {
        movies.add(movie);
        setChanged();
        notifyObservers();
    }

    public void remove(String movieName) {
        movies.removeIf(m -> m.getName().equals(movieName));
        setChanged();
        notifyObservers();
    }

    public List<MovieData> getMovies() {
        return movies;
    }
}
