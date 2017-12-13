/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thefellowes
 */
public class Controller {
    List<MovieData> movies = new ArrayList<>();
    
    public void fillWithDummyContent()
    {
        addMovie("a", 1, "asdf", 2);
        addMovie("b", 11, "asasdfdf", 20);
        addMovie("c", 12, "adsdf", 200);
        addMovie("d", 13, "asfdf", 2000);
        addMovie("e", 14, "aasdf", 20000);
    }
    
    public void addMovie(String name, int year, String origin, double budget){
        movies.add(new MovieData(name, year, origin, budget));
    }

    public List<MovieData> getMovies(){
        return movies;
    }
}

