/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class DisplayModel extends Observable {
    private List<MovieData> movies;
    
    public DisplayModel() {
        movies = new ArrayList<>();
    }
    
    public void Add(MovieData movie){
        movies.add(movie);
        setChanged();
        notifyObservers();
    }
    
    public void Remove(String movieName){
        for (int i = 0; i < movies.size(); i++){
            if (movies.get(i).getName().equals(movieName)){
                movies.remove(i);
            }
        }
        setChanged();
        notifyObservers();
    }
    
    public List<MovieData> getMovies() {
        return movies;
    }
}
